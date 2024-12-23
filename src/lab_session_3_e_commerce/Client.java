package lab_session_3_e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client {

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<Item>();

        items.add(new Electronic("1","iron", 1200, 1,2));
        items.add(new Book("2","desh", 1200, 1,"devendar mahor" ));
        items.add(new Clothing("3","t-shirt", 1200, 1, 20));


        for (Item item : items) {
            System.out.println(item.getName());
        }
        Collections.sort(items);
        for (Item item : items) {
            System.out.println(item.getName());
        }


        Inventory<Clothing> inventory = new Inventory<Clothing>();

        Clothing c1 = new Clothing("3","t-shirt-1", 1200, 1, 20);
        Clothing c2 = new Clothing("4","t-shirt-2", 1200, 1, 40);
        inventory.addItem(c1);
        inventory.addItem(c2);


        System.out.println("________________________________________");
        ArrayList<Clothing> clothingInventory = inventory.getAllItems();
        for (Clothing clothing : clothingInventory) {
            System.out.println(clothing.getName());
        }

        inventory.removeItem(c2);
        System.out.println("________________________________________");
        ArrayList<Clothing> clothingInventory2 = inventory.getAllItems();
        for (Clothing clothing : clothingInventory2) {
            System.out.println(clothing.getName());
        }

        System.out.println("________________________________________");
        System.out.println(inventory.getItem(c1).getName());
    }
}
