import { Item } from '@hilla/react-components/Item.js';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';

interface Item {
  name: string;
  field: DocFieldDto;
}

interface Column {
  name: string;
  items: Item[];
}

interface Section {
  name: string;
  columns: Column[];
}

interface Tab {
  name: string;
  sections: Section[];
}

interface ComponentState {
  tab: boolean;
  section: boolean;
  column: boolean;
}

function FieldDataFormatter({ fieldData }: { fieldData: DocFieldDto[] }) {
  let cState: ComponentState = { tab: false, section: false, column: false };
  const tabs: Tab[] = [];
  let currentTab: Tab = { name: '', sections: [] };
  let currentSection: Section = { name: '', columns: [] };
  let currentColumn: Column = { name: '', items: [] };

  fieldData.forEach((item) => {
    switch (item.fieldType) {
      case 'Tab Break': {
        cState = { tab: false, section: false, column: false };
        break;
      }
      case 'Section Break': {
        cState = { tab: true, section: false, column: false };
        break;
      }
      case 'Column Break': {
        cState = { tab: true, section: true, column: false };
        break;
      }
      default:
        currentColumn?.items.push({ name: item.label ?? '', field: item });
        break;
    }

    if (!cState.tab) {
      currentTab = { name: item.fieldType === 'Tab Break' ? item.label ?? '' : '', sections: [] };
      tabs.push(currentTab);
      cState.tab = true;
    }
    if (!cState.section) {
      currentSection = {
        name: item.fieldType === 'Section Break' ? item.label ?? '' : '',
        columns: [],
      };
      currentTab.sections.push(currentSection);
      cState.section = true;
    }
    if (!cState.column) {
      const isColumnBreak = item.fieldType === 'Column Break';
      currentColumn = {
        name: isColumnBreak ? item.label ?? '' : '',
        items: isColumnBreak ? [] : [...currentColumn.items],
      };
      currentSection.columns.push(currentColumn);
      cState.column = true;
    }
  });
  return tabs;
}

export default FieldDataFormatter;
