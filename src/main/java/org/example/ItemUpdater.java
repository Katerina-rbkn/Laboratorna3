package org.example;

import java.util.List;

public class ItemUpdater {
    public void updateAllItemsQuality(List<Item> items){
        for(Item item : items){
            if(!isLegendary(item)){
                updateItemQuality(item);
                updateSellIn(item);
                handleExpiredItem(item);
            }
        }
    }
    private boolean isLegendary(Item item){
        return item.getItemName().equals("Sulfuras, Hand of Ragnaros");
    }
    private void updateItemQuality(Item item){
        if(isSpecialItem(item)){
            increaseQuality(item);
            handleSpecialCases(item);
        } else{
            decreaseQuality(item);
        }
    }
    private boolean isSpecialItem(Item item){
        StringWrapper itemName = item.getItemName();
        return itemName.equals("Aged Brie") || itemName.equals("Backstage passes to a TAFKAL80ETC concert");
    }
    private void increaseQuality(Item item){
        IntegerWrapper quality = item.getItemQuality();
        int currentQuality = quality.getValue();
        if (currentQuality < 50) {
            item.setItemQuality(new IntegerWrapper(currentQuality + 1));
        }
    }
    private void decreaseQuality(Item item){
        IntegerWrapper quality = item.getItemQuality();
        int currentQuality = quality.getValue();
        if (currentQuality > 0) {
            item.setItemQuality(new IntegerWrapper(currentQuality - 1));
        }
    }
    private void handleSpecialCases(Item item) {
        StringWrapper itemName = item.getItemName();
        if (itemName.equals("Backstage passes to a TAFKAL80ETC concert")) {
            IntegerWrapper daysRemainingWrapper = item.getDaysRemainingBeforeExpiration();
            int daysRemaining = daysRemainingWrapper.getValue();
            if (daysRemaining < 11) {
                increaseQuality(item);
            }
            if (daysRemaining < 6) {
                increaseQuality(item);
            }
        }
    }
    private void updateSellIn(Item item){
        IntegerWrapper daysRemainingWrapper = item.getDaysRemainingBeforeExpiration();
        int daysRemaining = daysRemainingWrapper.getValue();
        item.setDaysRemainingBeforeExpiration(new IntegerWrapper(daysRemaining - 1));
    }
    private void handleExpiredItem(Item item) {
        IntegerWrapper daysRemainingWrapper = item.getDaysRemainingBeforeExpiration();
        int daysRemaining = daysRemainingWrapper.getValue();
        if (daysRemaining < 0) {
            if (item.getItemName().equals("Aged Brie")) {
                increaseQuality(item);
            } else if (item.getItemName().equals("Backstage passes to a TAFKAL80ETC concert")) {
                item.setItemQuality(new IntegerWrapper(daysRemaining + 1));
            } else {
                decreaseQuality(item);
            }
        }
    }

}
