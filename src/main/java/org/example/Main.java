package org.example;

public class Main {
    public static void main(String[] args) {

        Items items = new Items();
        items.addItem(new Item("Aged Brie", 10, 20));
        items.addItem(new Item("Elixir of the Mongoose", 5, 7));
        items.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30));
        items.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        items.addItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        items.addItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        items.addItem(new Item("Regular Item", 15, 25));


        GildedRose app = new GildedRose(items);

        System.out.println("До оновлення:");
        System.out.println(items);

        app.updateQuality();

        System.out.println("Після оновлення:");
        System.out.println(items);
    }
}

