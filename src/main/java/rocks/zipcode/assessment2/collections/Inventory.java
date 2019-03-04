package rocks.zipcode.assessment2.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Use a map to keep track of inventory in a store
 */
public class Inventory {
    private List<String> strings;
    private Map<String, Integer> inventoryMap;
    /**
     * @param strings list of strings to add / remove / fetch from
     */
    public Inventory(List<String> strings) {
        this.strings = strings;
        inventoryMap = new TreeMap<>();
        for(String s : strings) {
            if (!inventoryMap.containsKey(s)) {
                inventoryMap.put(s, 0);
            } else {
                inventoryMap.put(s, inventoryMap.get(s) + 1);
            }
        }
    }

    /**
     * nullary constructor initializes a new list
     */
    public Inventory() {
        this.strings = new ArrayList<>();
        this.inventoryMap = new TreeMap<>();
    }

    /**
     * @param item - increment the number of this item in stock by 1
     */
    public void addItemToInventory(String item) {
        if (!inventoryMap.containsKey(item)) {
            inventoryMap.put(item, 1);
        } else {
            inventoryMap.put(item, (inventoryMap.get(item) + 1));
        }
    }

    /**
     * @param item - decrement the number of this item in stock by 1
     */
    public void removeItemFromInventory(String item) {

        inventoryMap.put(item, inventoryMap.get(item) - 1);
    }

    /**
     * @param item - Search for this item in stock
     * @return - return the number of items
     */
    public Integer getItemQuantity(String item) {
       if(inventoryMap.containsKey(item)){
           return inventoryMap.get(item);
       }
       else{
           return 0;
       }
    }
}
