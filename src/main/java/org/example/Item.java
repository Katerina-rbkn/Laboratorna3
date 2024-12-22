package org.example;

public class Item {

    public final ItemData itemData;

    public Item(String itemName, int daysRemainingBeforeExpiration, int itemQuality) {
        this.itemData = new ItemData(new StringWrapper(itemName), new IntegerWrapper(daysRemainingBeforeExpiration), new IntegerWrapper(itemQuality));
    }

    public String toString() {
        return "Item: " + itemData.itemName + ", DaysRemaining: " + itemData.daysRemainingBeforeExpiration + ", Quality: " + itemData.itemQuality;
    }
}


