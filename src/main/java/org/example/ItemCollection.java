package org.example;

import java.util.ArrayList;
import java.util.List;

public class ItemCollection {
    public final List<Item> items;

    public ItemCollection() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Item item : items) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }
}
