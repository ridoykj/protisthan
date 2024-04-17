import { Item } from '@hilla/react-components/Item.js';
import DocFieldDto from 'Frontend/generated/com/itbd/application/db/dto/doctypes/DocFieldDto';

interface Item {
  name: string;
  field: DocFieldDto | null;
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

function FieldDataFormatter({ fieldData }: { fieldData: DocFieldDto[] }) {
  const tabs: Tab[] = [];
  let currentTab: Tab | null = null;
  let currentSection: Section | null = null;
  let currentColumn: Column | null = null;

  fieldData.forEach((item) => {
    switch (item.fieldType) {
      case 'Tab Break':
        currentTab = { name: item.fieldType, sections: [] };
        tabs.push(currentTab);
        break;
      case 'Section Break':
        currentSection = { name: item.fieldType, columns: [] };
        if (currentTab !== null) {
          currentTab.sections.push(currentSection);
        }
        break;
      case 'Column Break':
        currentColumn = { name: item.fieldType, items: [] };
        if (currentSection !== null) {
          currentSection.columns.push(currentColumn);
        }
        break;
      default:
        if (currentColumn !== null) {
          currentColumn.items.push({ name: item.fieldType ?? '', field: item });
        }
        break;
    }
  });
  return tabs;
}

export default FieldDataFormatter;
