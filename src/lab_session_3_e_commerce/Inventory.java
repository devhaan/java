package lab_session_3_e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class Inventory <T extends Item> {

    HashMap<String,T> inventories;
    int size = 0;

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

    public ArrayList<T> filterByPriceRange(double minPrice, double maxPrice) {
        ArrayList<T> output = new ArrayList<>();
        inventories.forEach((k, v)
                -> {
            if(v.getPrice() >= minPrice && v.getPrice() <= maxPrice){
                output.add(v);
            }
        });
        return output;
    }

    public ArrayList<T> filterByAvailability() {
        ArrayList<T> output = new ArrayList<>();
        inventories.forEach((k, v)
                -> {
            if(v.getQuantity() > 0){
                output.add(v);
            }
        });
        return output;
    }

}
