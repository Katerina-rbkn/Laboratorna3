package org.example;

public class Main {
    public static void main(String[] args) {

        Item[] items = new Item[]{
                new Item("Aged Brie", 10, 20),
                new Item("Elixir of the Mongoose", 5, 7),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", -1, 80),
                new Item("Regular Item", 15, 25)
        };

        GildedRose app = new GildedRose(items);

        System.out.println("До оновлення:");
        printItems(items);

        app.updateQuality();

        System.out.println("Після оновлення:");
        printItems(items);
    }

    private static void printItems(Item[] items) {
        for (Item item : items) {
            System.out.println(item);
        }
    }
}

