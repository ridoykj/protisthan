package com.itbd.application.group;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

@Slf4j
public class GroupSegmentTest {

    private final String[] items = {
            "tab"
            , "section"
            , "column"
            , "item", "item", "item"
            , "column"
            , "item", "item"
            , "column"
            , "item", "item", "item1"
            , "tab"
            , "section"
            , "column"
            , "item", "item", "item"
            , "column"
            , "item", "item2"

    };

//    record Tab(String name , List<Section> section) {
//        public Tab(String name) {
//            this(name, List.of());
//        }
//        public void addSection(Section section) {
//            this.section.add(section);
//        }
//    }
//    record Section(String name,  List<Column> column) {
//        public Section(String name) {
//            this(name, List.of());
//        }
//        public void addColumn(Column column) {
//            this.column.add(column);
//        }
//    }
//    record Column(String name,  List<String> item) {
//        public Column(String name) {
//            this(name, List.of());
//        }
//        public void addItem(String item) {
//            this.item.add(item);
//        }
//    }

    class Item {
        String name;

        public Item(String name) {
            this.name = name;
        }
    }

    class Column {
        String name;
        List<Item> items;

        public Column(String name) {
            this.name = name;
            this.items = new ArrayList<>();
        }

        public void addItem(Item item) {
            this.items.add(item);
        }
    }

    class Section {
        String name;
        List<Column> columns;

        public Section(String name) {
            this.name = name;
            this.columns = new ArrayList<>();
        }

        public void addColumn(Column column) {
            this.columns.add(column);
        }
    }

    class Tab {
        String name;
        List<Section> sections;

        public Tab(String name) {
            this.name = name;
            this.sections = new ArrayList<>();
        }

        public void addSection(Section section) {
            this.sections.add(section);
        }
    }
    @Test
    public void convertTest() {

        Tab currentTab = null;
        Section currentSection = null;
        Column currentColumn = null;

        for (String item : items) {
            switch (item) {
                case "tab":
                    currentTab = new Tab(item);
                    break;
                case "section":
                    currentSection = new Section(item);
                    if (currentTab != null) {
                        currentTab.addSection(currentSection);
                    }
                    break;
                case "column":
                    currentColumn = new Column(item);
                    if (currentSection != null) {
                        currentSection.addColumn(currentColumn);
                    }
                    break;
                case "item":
                    if (currentColumn != null) {
                        currentColumn.addItem(new Item(item));
                    }
                    break;
            }
        }
        log.info("{}", currentTab);
    }
}
