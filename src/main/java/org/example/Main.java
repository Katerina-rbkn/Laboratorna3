package org.example;

public class Main {
    public static void main(String[] args) {

        ItemCollection itemCollection = new ItemCollection();
        itemCollection.addItem(new Item("Aged Brie", 10, 20));
        itemCollection.addItem(new Item("Elixir of the Mongoose", 5, 7));
        itemCollection.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 5, 30));
        itemCollection.addItem(new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49));
        itemCollection.addItem(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
        itemCollection.addItem(new Item("Sulfuras, Hand of Ragnaros", -1, 80));
        itemCollection.addItem(new Item("Regular Item", 15, 25));


        GildedRose app = new GildedRose(itemCollection);

        System.out.println("До оновлення:");
        System.out.println(itemCollection);

        app.updateQuality();

        System.out.println("Після оновлення:");
        System.out.println(itemCollection);
    }
}

