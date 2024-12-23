package lab_session_3_e_commerce;

import java.util.*;

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
        Electronic e3 = new Electronic("5","led", 1200, 1, 2);
        Electronic e4 = new Electronic("6","tube", 1200, 1, 4);
        ElectronicInventory.addItem(e1);
        ElectronicInventory.addItem(e2);
        ElectronicInventory.addItem(e3);
        ElectronicInventory.addItem(e4);


        System.out.println("________________________________________");
        ArrayList<Electronic> electronicInventory = ElectronicInventory.getAllItems();
        for (Electronic electronic : electronicInventory) {
            System.out.println(electronic.getName());
        }

//        ElectronicInventory.removeItem(e2);
        System.out.println("________________________________________");
        ArrayList<Electronic> electronicInventory2 = ElectronicInventory.getAllItems();
        for (Electronic electronic : electronicInventory2) {
            System.out.println(electronic.getName());
        }

        System.out.println("________________________________________");
        System.out.println(ElectronicInventory.getItem(e1).getName());
        System.out.println(ElectronicInventory.getItem(e2).getName());
        System.out.println(ElectronicInventory.getItem(e3).getName());
        System.out.println(ElectronicInventory.getItem(e2).getName());
        System.out.println(ElectronicInventory.getItem(e4).getName());
        System.out.println("________________________________________");
        System.out.println("________________________________________");


        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        recentlyViewedItems.addRecentlyViewedItems(e1);
        recentlyViewedItems.addRecentlyViewedItems(e2);
        recentlyViewedItems.addRecentlyViewedItems(e3);
        recentlyViewedItems.addRecentlyViewedItems(e4);
        recentlyViewedItems.addRecentlyViewedItems(e2);
        LinkedList<Item> recentlyVisited = recentlyViewedItems.getRecentlyViewedItems();

        for (Item item : recentlyVisited) {
            System.out.println(item.getName());
        }


        System.out.println("---------------------------ORDERS------------------");


        Order o1 = new Order("1", false);
        Order o2 = new Order("2", false);
        Order o3 = new Order("3", true);
        Order o4 = new Order("4", false);
        Order o5 = new Order("5", false);
        Order o6 = new Order("6", true);

        Order o7 = new Order("7", false);
        Order o8 = new Order("8", true);


        OrderProcessor orderProcessor = new OrderProcessor();

        orderProcessor.addOrder(o1);
        orderProcessor.addOrder(o2);
        orderProcessor.addOrder(o3);
        orderProcessor.addOrder(o4);
        orderProcessor.addOrder(o5);
        orderProcessor.addOrder(o6);
        orderProcessor.addOrder(o7);
        orderProcessor.addOrder(o8);

//        orderProcessor.processOrder();

        PriorityQueue<Order> pq = orderProcessor.getPq();

        for(Order order : pq) {
            System.out.println(order.getOrderID());
        }



    }
}
