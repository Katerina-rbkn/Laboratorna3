package org.example;

public class ItemData {
    public StringWrapper itemName;
    public IntegerWrapper daysRemainingBeforeExpiration;
    public IntegerWrapper itemQuality;

    public ItemData(StringWrapper itemName, IntegerWrapper daysRemainingBeforeExpiration, IntegerWrapper itemQuality) {
        this.itemName = itemName;
        this.daysRemainingBeforeExpiration = daysRemainingBeforeExpiration;
        this.itemQuality = itemQuality;
    }
}
