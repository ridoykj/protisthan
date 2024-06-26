import type { AbstractModel, DetachedModelConstructor } from '@hilla/form';
import {
  Grid,
  type GridDataProvider,
  type GridDataProviderCallback,
  type GridDataProviderParams,
  type GridDefaultItem,
  type GridElement,
  type GridProps,
} from '@hilla/react-components/Grid.js';
import { GridColumn } from '@hilla/react-components/GridColumn.js';
import { GridColumnGroup } from '@hilla/react-components/GridColumnGroup.js';
import AndFilter from 'Frontend/generated/dev/hilla/crud/filter/AndFilter.js';
import FilterUnion from 'Frontend/generated/dev/hilla/crud/filter/FilterUnion.js';
import PropertyStringFilter from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter.js';
import Sort from 'Frontend/generated/dev/hilla/mappedtypes/Sort.js';
import Direction from 'Frontend/generated/org/springframework/data/domain/Sort/Direction.js';
import {
  cloneElement,
  forwardRef,
  useEffect,
  useImperativeHandle,
  useMemo,
  useRef,
  useState,
  type ForwardedRef,
  type JSX,
  type MutableRefObject,
} from 'react';
import { ColumnContext, type SortState } from './autogrid-column-context.js';
import { getColumnOptions, type ColumnOptions } from './autogrid-columns.js';
import { AutoGridRowNumberRenderer } from './autogrid-renderers.js';
import type { ListService } from './crud';
import { HeaderSorter } from './header-sorter';
import { ModelInfo, getDefaultProperties, type PropertyInfo } from './model-info.js';
import { GridSelectionColumn } from '@hilla/react-components/GridSelectionColumn.js';

// registerStylesheet(css);

export interface AutoGridRef<TItem = any> {
  /**
   * The underlying vaadin-grid DOM element.
   */
  grid: GridElement<TItem> | null;

  /**
   * Refreshes the grid by reloading the data from the backend.
   */
  refresh(): void;
}

interface AutoGridOwnProps<TItem> {
  /**
   * The service to use for fetching the data. This must be a TypeScript service
   * that has been generated by Hilla from a backend Java service that
   * implements the `dev.hilla.crud.ListService` interface.
   */
  service: ListService<TItem>;
  /**
   * The entity model to use for the grid, which determines which columns to
   * show and how to render them. This must be a Typescript model class that has
   * been generated by Hilla from a backend Java class. The model must match
   * with the type of the items returned by the service. For example, a
   * `PersonModel` can be used with a service that returns `Person` instances.
   *
   * By default, the grid shows columns for all properties of the model which
   * have a type that is supported. Use the `visibleColumns` option to customize
   * which columns to show and in which order.
   */
  model: DetachedModelConstructor<AbstractModel<TItem>>;
  /**
   * The property to use to detect an item's ID. The item ID is used to keep
   * the selection state when reloading the grid.
   *
   * By default, the component uses the property annotated with
   * `jakarta.persistence.Id`, or a property named `id`, in that order.
   * This option can be used to override the default behavior, or define the ID
   * property in case a class doesn't have a property matching the defaults.
   */
  itemIdProperty?: string;
  /**
   * Allows to provide a filter that is applied when fetching data from the
   * service. This can be used for implementing an external filter UI outside
   * the grid. A custom filter is not compatible with header filters.
   *
   * **NOTE:** This is considered an experimental feature and the API may change
   * in the future.
   */
  experimentalFilter?: FilterUnion;
  /**
   * Allows to customize which columns to show and in which order. This must be
   * an array of property names that are defined in the model. Nested properties
   * can be specified using dot notation, e.g. `address.street`.
   */
  visibleColumns?: string[];
  /**
   * Disables header filters, which are otherwise enabled by default.
   */
  noHeaderFilters?: boolean;
  /**
   * Allows to add custom columns to the grid. This must be an array of
   * `GridColumn` component instances. Custom columns are added after the
   * auto-generated columns.
   */
  customColumns?: JSX.Element[];
  /**
   * Allows to customize the props for individual columns. This is an object
   * where the keys must be property names that are defined in the model, and
   * the values are props that are accepted by the `GridColumn` component.
   * Nested properties can be specified using dot notation, e.g.
   * `address.street`.
   */
  columnOptions?: Record<string, ColumnOptions>;
  /**
   * When enabled, inserts a column with row numbers at the beginning of the
   * grid.
   */
  rowNumbers?: boolean;
  /**
     * When enabled, inserts a column with row numbers at the beginning of the
     * grid.
     */
  multiSelect?: boolean;
  /**
   * Allows to provide a filter that is applied when fetching data from the
   */
  customFilter?: PropertyStringFilter[];
}

export type AutoGridProps<TItem> = GridProps<TItem> & Readonly<AutoGridOwnProps<TItem>>;

type GridElementWithInternalAPI<TItem = GridDefaultItem> = GridElement<TItem> &
  Readonly<{
    _dataProviderController: {
      rootCache: {
        size?: number;
      };
    };
  }>;

function createDataProvider<TItem>(
  grid: GridElement<TItem>,
  service: ListService<TItem>,
  filter: MutableRefObject<FilterUnion | undefined>,
): GridDataProvider<TItem> {
  let first = true;

  // eslint-disable-next-line @typescript-eslint/no-misused-promises
  return async (params: GridDataProviderParams<TItem>, callback: GridDataProviderCallback<TItem>) => {
    const sort: Sort = {
      orders: params.sortOrders
        .filter((order) => order.direction != null)
        .map((order) => ({
          property: order.path,
          direction: order.direction === 'asc' ? Direction.ASC : Direction.DESC,
          ignoreCase: false,
        })),
    };

    const pageNumber = params.page;
    const { pageSize } = params;
    const req = {
      pageNumber,
      pageSize,
      sort,
    };

    const items = await service.list(req, filter.current);
    let size;
    if (items.length === pageSize) {
      size = (pageNumber + 1) * pageSize + 1;

      const cacheSize = (grid as GridElementWithInternalAPI<TItem>)._dataProviderController.rootCache.size;
      if (cacheSize !== undefined && size < cacheSize) {
        // Only allow size to grow here to avoid shrinking the size when scrolled down and sorting
        size = undefined;
      }
    } else {
      size = pageNumber * pageSize + items.length;
    }
    callback(items, size);
    if (first) {
      // Workaround for https://github.com/vaadin/react-components/issues/129
      first = false;
      setTimeout(() => grid.recalculateColumnWidths(), 0);
    }
  };
}

interface ColumnConfigurationOptions {
  visibleColumns?: string[];
  noHeaderFilters?: boolean;
  customColumns?: JSX.Element[];
  columnOptions?: Record<string, ColumnOptions>;
  rowNumbers?: boolean;
  multiSelect?: boolean;
}

function addCustomColumns(columns: JSX.Element[], options: ColumnConfigurationOptions): JSX.Element[] {
  if (!options.customColumns) {
    return columns;
  }

  // When using header filters, wrap custom columns into column groups and
  // move header text or renderer to group
  const customColumns = options.noHeaderFilters
    ? options.customColumns
    : options.customColumns.map((column) => {
      const { header, headerRenderer } = column.props;
      const { key } = column;
      const columnWithoutHeader = cloneElement(column, { header: undefined, headerRenderer: undefined });
      return (
        <GridColumnGroup key={key} header={header} headerRenderer={headerRenderer}>
          {columnWithoutHeader}
        </GridColumnGroup>
      );
    });

  // When using a custom column order, insert custom columns into auto-generated
  // ones using their `key`
  if (options.visibleColumns) {
    const columnMap = [...columns, ...customColumns].reduce((map, column) => {
      const { key } = column;
      if (key) {
        map.set(key, column);
      }
      return map;
    }, new Map<string, JSX.Element>());

    return options.visibleColumns.map((path) => columnMap.get(path)).filter(Boolean) as JSX.Element[];
  }

  // Otherwise just append custom columns at the end
  return [...columns, ...customColumns];
}

function useColumns(
  properties: PropertyInfo[],
  setPropertyFilter: (propertyFilter: PropertyStringFilter) => void,
  options: ColumnConfigurationOptions,
) {
  const sortableProperties = properties.filter(
    (propertyInfo) => options.columnOptions?.[propertyInfo.name]?.sortable !== false,
  );
  const [sortState, setSortState] = useState<SortState>(
    sortableProperties.length > 0 ? { [sortableProperties[0].name]: { direction: 'asc' } } : {},
  );

  let columns = properties.map((propertyInfo) => {
    let column;

    const customColumnOptions = options.columnOptions ? options.columnOptions[propertyInfo.name] : undefined;

    // Header renderer is effectively the header filter, which should only be
    // applied when header filters are enabled
    const { headerRenderer, ...columnProps } = getColumnOptions(propertyInfo, customColumnOptions);

    if (!options.noHeaderFilters) {
      column = (
        <GridColumnGroup headerRenderer={HeaderSorter}>
          <GridColumn path={propertyInfo.name} headerRenderer={headerRenderer} {...columnProps}></GridColumn>
        </GridColumnGroup>
      );
    } else {
      column = <GridColumn path={propertyInfo.name} headerRenderer={HeaderSorter} {...columnProps}></GridColumn>;
    }
    return (
      <ColumnContext.Provider
        key={propertyInfo.name}
        value={{
          propertyInfo,
          setPropertyFilter,
          sortState,
          setSortState,
          customColumnOptions,
        }}
      >
        {column}
      </ColumnContext.Provider>
    );
  });

  columns = addCustomColumns(columns, options);

  if (options.multiSelect) {
    columns = [
      <GridSelectionColumn key="multiSelect" />,
      ...columns,
    ];
  }

  if (options.rowNumbers) {
    columns = [
      <GridColumn key="rownumbers" width="4em" flexGrow={0} renderer={AutoGridRowNumberRenderer}></GridColumn>,
      ...columns,
    ];
  }

  return columns;
}

function AutoGridInner<TItem>(
  {
    service,
    model,
    itemIdProperty,
    experimentalFilter,
    visibleColumns,
    noHeaderFilters,
    customColumns,
    columnOptions,
    rowNumbers,
    multiSelect,
    customFilter,
    ...gridProps
  }: AutoGridProps<TItem>,
  ref: ForwardedRef<AutoGridRef<TItem>>,
): JSX.Element {
  const [internalFilter, setInternalFilter] = useState<AndFilter>({ '@type': 'and', children: [] });
  const gridRef = useRef<GridElement<TItem>>(null);
  const dataProviderFilter = useRef<FilterUnion | undefined>(undefined);

  useImperativeHandle(
    ref,
    () => ({
      get grid() {
        return gridRef.current;
      },
      refresh() {
        gridRef.current?.clearCache();
      },
    }),
    [],
  );

  const setHeaderPropertyFilter = (propertyFilter: PropertyStringFilter) => {
    const filterIndex = internalFilter.children.findIndex(
      (f) => (f as PropertyStringFilter).propertyId === propertyFilter.propertyId,
    );
    let changed = false;
    if (propertyFilter.filterValue === '') {
      // Delete empty filter
      if (filterIndex >= 0) {
        internalFilter.children.splice(filterIndex, 1);
        changed = true;
      }
    } else if (filterIndex >= 0) {
      internalFilter.children[filterIndex] = propertyFilter;
      changed = true;
    } else {
      internalFilter.children.push(propertyFilter);
      changed = true;
    }
    if (changed) {
      setInternalFilter({ ...internalFilter });
    }
  };

  const modelInfo = useMemo(() => new ModelInfo(model, itemIdProperty), [model]);
  const properties = visibleColumns ? modelInfo.getProperties(visibleColumns) : getDefaultProperties(modelInfo);
  const children = useColumns(properties, setHeaderPropertyFilter, {
    visibleColumns,
    noHeaderFilters,
    customColumns,
    columnOptions,
    rowNumbers,
    multiSelect,
  });

  useEffect(() => {
    // Remove all filtering if header filters are removed
    if (noHeaderFilters) {
      setInternalFilter({ '@type': 'and', children: [] });
    }
  }, [noHeaderFilters]);

  useEffect(() => {
    // Sets the data provider, should be done only once
    const grid = gridRef.current!;
    setTimeout(() => {
      // Wait for the sorting headers to be rendered so that the sorting state is correct for the first data provider call
      grid.dataProvider = createDataProvider(grid, service, dataProviderFilter);
    }, 1);
  }, [model, service]);

  useEffect(() => {
    // Update the filtering, whenever the filter changes
    const grid = gridRef.current;
    if (grid) {
      dataProviderFilter.current = experimentalFilter ?? internalFilter;
      grid.clearCache();
    }
  }, [experimentalFilter, internalFilter]);

  return (
    <Grid itemIdPath={modelInfo.idProperty?.name} {...gridProps} ref={gridRef}>
      {children}
    </Grid>
  );
}

type AutoGrid = <TItem>(
  props: AutoGridProps<TItem> & { ref?: ForwardedRef<AutoGridRef<TItem>> },
) => ReturnType<typeof AutoGridInner>;

/**
 * Auto Grid is a component for displaying tabular data based on a Java backend
 * service. It automatically generates columns based on the properties of a
 * Java class and provides features such as lazy-loading, sorting and filtering.
 *
 * Example usage:
 * ```tsx
 * import { AutoGrid } from '@hilla/react-crud';
 * import PersonService from 'Frontend/generated/endpoints';
 * import PersonModel from 'Frontend/generated/com/example/application/Person';
 *
 * <AutoGrid service={PersonService} model={PersonModel} />
 * ```
 */
export const AutoGrid: AutoGrid = forwardRef(AutoGridInner) as AutoGrid;
