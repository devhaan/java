package lab_session_3_e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Inventory <T extends Item> {

    HashMap<String,T> inventories;
    LinkedList<String> recentlyViewedItems;
    int size = 0;

    public Inventory() {
        inventories = new HashMap<>();
        recentlyViewedItems = new LinkedList<>();
    }


    public ArrayList<T> getAllItems() {
        ArrayList<T> output = new ArrayList<>();
        inventories.forEach((k, v)
                -> output.add(v));
        return output;
    }

    public void addItem(T item) {
        inventories.put(item.getId(), item);
    }

    public void removeItem(T item) {
        inventories.remove(item.getId());
    }

    public T getItem(T item) {
        if( this.size == 3){
            recentlyViewedItems.removeLast();
            this.size--;
        }
        recentlyViewedItems.addFirst(item.getName());
        this.size++;
        return inventories.get(item.getId());
    }

    public LinkedList<String> getRecentlyViewedItems() {
        return recentlyViewedItems;
    }
}
