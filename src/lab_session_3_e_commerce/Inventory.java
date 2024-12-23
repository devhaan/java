package lab_session_3_e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Inventory <T extends Item> {

    HashMap<String,T> inventories;

    public Inventory() {
        inventories = new HashMap<>();
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
        return inventories.get(item.getId());
    }
}
