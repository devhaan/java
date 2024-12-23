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


    }
}
