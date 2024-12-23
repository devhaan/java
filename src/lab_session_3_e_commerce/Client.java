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


        Inventory<Clothing> ClothingInventory = new Inventory<>();

        Clothing c1 = new Clothing("3","t-shirt-1", 1200, 1, 20);
        Clothing c2 = new Clothing("4","t-shirt-2", 1200, 1, 40);
        ClothingInventory.addItem(c1);
        ClothingInventory.addItem(c2);


        System.out.println("________________________________________");
        ArrayList<Clothing> clothingInventory = ClothingInventory.getAllItems();
        for (Clothing clothing : clothingInventory) {
            System.out.println(clothing.getName());
        }

        ClothingInventory.removeItem(c2);
        System.out.println("________________________________________");
        ArrayList<Clothing> clothingInventory2 = ClothingInventory.getAllItems();
        for (Clothing clothing : clothingInventory2) {
            System.out.println(clothing.getName());
        }

        System.out.println("________________________________________");
        System.out.println(ClothingInventory.getItem(c1).getName());


        Inventory<Electronic> ElectronicInventory = new Inventory<>();

        Electronic e1 = new Electronic("3","iron", 1200, 1, 2);
        Electronic e2 = new Electronic("4","tv", 1200, 1, 4);
        ElectronicInventory.addItem(e1);
        ElectronicInventory.addItem(e2);


        System.out.println("________________________________________");
        ArrayList<Electronic> electronicInventory = ElectronicInventory.getAllItems();
        for (Electronic electronic : electronicInventory) {
            System.out.println(electronic.getName());
        }

        ElectronicInventory.removeItem(e2);
        System.out.println("________________________________________");
        ArrayList<Electronic> electronicInventory2 = ElectronicInventory.getAllItems();
        for (Electronic electronic : electronicInventory2) {
            System.out.println(electronic.getName());
        }

        System.out.println("________________________________________");
        System.out.println(ElectronicInventory.getItem(e1).getName());




    }
}
