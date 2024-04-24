import { GridDataProviderParams } from '@hilla/react-components/Grid.js';
import Filter from 'Frontend/generated/dev/hilla/crud/filter/Filter';
import PropertyStringFilter from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter';
import Pageable from 'Frontend/generated/dev/hilla/mappedtypes/Pageable';

function gridLazyFilter<T>(
  gridDataProviderParams: GridDataProviderParams<T>,
  type: string,
  property: PropertyStringFilter[]
) {
  const { page, pageSize, filters } = gridDataProviderParams;
  const pagination: Pageable = {
    pageNumber: page,
    pageSize,
    sort: {
      orders: [],
    },
  };

  const filter: Filter = {
    '@type': type,
    children: property,
  };

  return { pagination, filter };
}
export default gridLazyFilter;
