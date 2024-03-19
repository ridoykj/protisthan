import type { GridSorterDirection } from '@hilla/react-components/GridSorter.js';
import { type Dispatch, type SetStateAction, createContext } from 'react';
import type { ColumnOptions } from './autogrid-columns';
import type { PropertyInfo } from './model-info';
import PropertyStringFilter from 'Frontend/generated/dev/hilla/crud/filter/PropertyStringFilter';
// import type PropertyStringFilter from './types/dev/hilla/crud/filter/PropertyStringFilter';

export interface SorterState {
  direction: GridSorterDirection;
}

export type SortState = Record<string, SorterState | undefined>;

export type ColumnContext = Readonly<{
  propertyInfo: PropertyInfo;
  setPropertyFilter(propertyFilter: PropertyStringFilter): void;
  sortState: SortState;
  setSortState: Dispatch<SetStateAction<SortState>>;
  customColumnOptions?: ColumnOptions;
}>;

export const ColumnContext = createContext<ColumnContext | null>(null);
