//package lab_session_3_e_commerce;
//
//import java.util.*;
//
//public class Client {
//
//    public static void main(String[] args) {
//        ArrayList<Item> items = new ArrayList<Item>();
//
//        // Adding different items to the list
//        items.add(new Electronic("1", "iron", 1200, 111, 2));
//        items.add(new Book("2", "desh", 100, 23, "devendar mahor"));
//        items.add(new Clothing("3", "t-shirt", 10, 22, 20));
//
//        // Displaying all items before sorting
//        System.out.println("------ Items Before Sorting by Quantity ------");
//        for (Item item : items) {
//            System.out.println(item.getName());
//        }
//
//        // Sorting items by quantity
//        Collections.sort(items, new CompareByQuantity());
//
//        // Displaying all items after sorting
//        System.out.println("\n------ Items After Sorting by Quantity ------");
//        for (Item item : items) {
//            System.out.println(item.getName());
//        }
//
//        // Working with Clothing Inventory
//        System.out.println("\n------ Clothing Inventory Operations ------");
//        Inventory<Clothing> clothingInventory = new Inventory<>();
//        Clothing c1 = new Clothing("3", "t-shirt-1", 1200, 1, 20);
//        Clothing c2 = new Clothing("4", "t-shirt-2", 1200, 1, 40);
//        clothingInventory.addItem(c1);
//        clothingInventory.addItem(c2);
//
//        // Displaying clothing inventory before removal
//        System.out.println("Clothing Inventory (Before Removal):");
//        ArrayList<Clothing> clothingInventoryList = clothingInventory.getAllItems();
//        for (Clothing clothing : clothingInventoryList) {
//            System.out.println(clothing.getName());
//        }
//
//        // Removing an item from the clothing inventory
//        clothingInventory.removeItem(c2);
//        System.out.println("\nClothing Inventory (After Removal):");
//        ArrayList<Clothing> updatedClothingInventory = clothingInventory.getAllItems();
//        for (Clothing clothing : updatedClothingInventory) {
//            System.out.println(clothing.getName());
//        }
//
//        // Fetching a specific item from the inventory
//        System.out.println("\nFetching Specific Clothing Item (c1):");
//        System.out.println(clothingInventory.getItem(c1).getName());
//
//        // Working with Electronic Inventory
//        System.out.println("\n------ Electronic Inventory Operations ------");
//        Inventory<Electronic> electronicInventory = new Inventory<>();
//        Electronic e1 = new Electronic("3", "iron", 12.30, 11, 2);
//        Electronic e2 = new Electronic("4", "tv", 1300.34, 2, 4);
//        Electronic e3 = new Electronic("5", "led", 444, 4, 2);
//        Electronic e4 = new Electronic("6", "tube", 33, 0, 4);
//        electronicInventory.addItem(e1);
//        electronicInventory.addItem(e2);
//        electronicInventory.addItem(e3);
//        electronicInventory.addItem(e4);
//
//        // Displaying items filtered by availability
//        System.out.println("Electronics Available for Sale (Filtered by Quantity > 0):");
//        ArrayList<Electronic> availableElectronics = electronicInventory.filterByAvailability();
//        for (Electronic electronic : availableElectronics) {
//            System.out.println(electronic.getName() + " (Quantity: " + electronic.getQuantity() + ")");
//        }
//
//        // Displaying items filtered by price range
//        System.out.println("\nElectronics in Price Range 1 to 40:");
//        ArrayList<Electronic> priceFilteredElectronics = electronicInventory.filterByPriceRange(1, 40);
//        for (Electronic electronic : priceFilteredElectronics) {
//            System.out.println(electronic.getName() + " (Price: " + electronic.getPrice() + ")");
//        }
//
//        // Displaying all electronic items
//        System.out.println("\nAll Electronic Items:");
//        ArrayList<Electronic> allElectronics = electronicInventory.getAllItems();
//        for (Electronic electronic : allElectronics) {
//            System.out.println(electronic.getName());
//        }
//
//        // Removing an item from the electronic inventory
//        System.out.println("\nRemoving an Electronic Item (e2):");
//        electronicInventory.removeItem(e2);
//        ArrayList<Electronic> updatedElectronics = electronicInventory.getAllItems();
//        for (Electronic electronic : updatedElectronics) {
//            System.out.println(electronic.getName());
//        }
//
//        // Fetching a specific electronic item from the inventory
//        System.out.println("\nFetching Specific Electronic Items:");
//        System.out.println(electronicInventory.getItem(e1).getName());
//        System.out.println(electronicInventory.getItem(e3).getName());
//        System.out.println(electronicInventory.getItem(e4).getName());
//
//        // Working with Recently Viewed Items
//        System.out.println("\n------ Recently Viewed Items ------");
//        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
//        recentlyViewedItems.addRecentlyViewedItems(e1);
//        recentlyViewedItems.addRecentlyViewedItems(e2);
//        recentlyViewedItems.addRecentlyViewedItems(e3);
//        recentlyViewedItems.addRecentlyViewedItems(e4);
//        recentlyViewedItems.addRecentlyViewedItems(e2);  // Adding duplicate for testing
//
//        // Displaying recently viewed items
//        LinkedList<Item> recentlyVisited = recentlyViewedItems.getRecentlyViewedItems();
//        System.out.println("Recently Viewed Items:");
//        for (Item item : recentlyVisited) {
//            System.out.println(item.getName());
//        }
//
//        // Working with Orders and Order Processing
//        System.out.println("\n------ Order Processing ------");
//        Order o1 = new Order("1", false);
//        Order o2 = new Order("2", false);
//        Order o3 = new Order("3", true);
//        Order o4 = new Order("4", false);
//        Order o5 = new Order("5", false);
//        Order o6 = new Order("6", true);
//        Order o7 = new Order("7", false);
//        Order o8 = new Order("8", true);
//
//        OrderProcessor orderProcessor = new OrderProcessor();
//        orderProcessor.addOrder(o1);
//        orderProcessor.addOrder(o2);
//        orderProcessor.addOrder(o3);
//        orderProcessor.addOrder(o4);
//        orderProcessor.addOrder(o5);
//        orderProcessor.addOrder(o6);
//        orderProcessor.addOrder(o7);
//        orderProcessor.addOrder(o8);
//
//        // Displaying orders in priority queue (sorted by priority)
//        System.out.println("Orders (Sorted by Priority):");
//        PriorityQueue<Order> pq = orderProcessor.getPq();
//        for (Order order : pq) {
//            System.out.println("Order ID: " + order.getOrderID());
//        }
//
//    }
//}





package lab_session_3_e_commerce;

import java.util.*;

public class Client {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Inventory<Clothing> clothingInventory = new Inventory<>();
        Inventory<Electronic> electronicInventory = new Inventory<>();
        RecentlyViewedItems recentlyViewedItems = new RecentlyViewedItems();
        OrderProcessor orderProcessor = new OrderProcessor();

        while (true) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline character left by nextInt()

            switch (choice) {
                case 1:
                    addItem(items);
                    break;
                case 2:
                    showItemsBeforeSorting(items);
                    break;
                case 3:
                    sortItemsByQuantity(items);
                    break;
                case 4:
                    manageClothingInventory(clothingInventory);
                    break;
                case 5:
                    manageElectronicInventory(electronicInventory);
                    break;
                case 6:
                    manageRecentlyViewedItems(recentlyViewedItems);
                    break;
                case 7:
                    manageOrders(orderProcessor);
                    break;
                case 0:
                    System.out.println("Exiting the system...");
                    return;  // Exit the program
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n------ E-Commerce System ------");
        System.out.println("1. Add Item");
        System.out.println("2. Show Items Before Sorting");
        System.out.println("3. Sort Items by Quantity");
        System.out.println("4. Manage Clothing Inventory");
        System.out.println("5. Manage Electronic Inventory");
        System.out.println("6. Manage Recently Viewed Items");
        System.out.println("7. Manage Orders");
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }

    // Adding items dynamically
    private static void addItem(ArrayList<Item> items) {
        System.out.println("\nChoose the type of item to add:");
        System.out.println("1. Electronic");
        System.out.println("2. Book");
        System.out.println("3. Clothing");
        int typeChoice = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter Item ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Item Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Item Quantity: ");
        int quantity = scanner.nextInt();

        switch (typeChoice) {
            case 1:
                System.out.print("Enter Electronic Power: ");
                int warranty = scanner.nextInt();
                items.add(new Electronic(id, name, price, quantity, warranty));
                break;
            case 2:
                scanner.nextLine();  // Consume newline
                System.out.print("Enter Book Author: ");
                String author = scanner.nextLine();
                items.add(new Book(id, name, price, quantity, author));
                break;
            case 3:
                System.out.print("Enter Clothing Size: ");
                int size = scanner.nextInt();
                items.add(new Clothing(id, name, price, quantity, size));
                break;
            default:
                System.out.println("Invalid choice, no item added.");
        }
    }

    // Show items before sorting
    private static void showItemsBeforeSorting(ArrayList<Item> items) {
        System.out.println("\n------ Items Before Sorting ------");
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }

    // Sort items by quantity
    private static void sortItemsByQuantity(ArrayList<Item> items) {
        System.out.println("\n------ Sorting Items by Quantity ------");
        Collections.sort(items, new CompareByQuantity());
        for (Item item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
    }

    // Manage Clothing Inventory
    private static void manageClothingInventory(Inventory<Clothing> clothingInventory) {
        System.out.println("\n------ Manage Clothing Inventory ------");
        System.out.print("Enter Clothing ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Clothing Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Clothing Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Clothing Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Clothing Size: ");
        int size = scanner.nextInt();

        Clothing clothing = new Clothing(id, name, price, quantity, size);
        clothingInventory.addItem(clothing);
        System.out.println("Clothing item added to inventory.");

        // Show all clothing items
        System.out.println("All Clothing Items:");
        ArrayList<Clothing> clothingList = clothingInventory.getAllItems();
        for (Clothing c : clothingList) {
            System.out.println(c.getName());
        }

        // Removing clothing item
        System.out.print("Do you want to remove an item? (yes/no): ");
        scanner.nextLine();  // Consume newline
        String removeChoice = scanner.nextLine();
        if (removeChoice.equalsIgnoreCase("yes")) {
            System.out.print("Enter Clothing ID to remove: ");
            String removeId = scanner.nextLine();
            Clothing itemToRemove = clothingInventory.getItem(new Clothing(removeId, "", 0, 0, 0));  // Use ID to find the item
            clothingInventory.removeItem(itemToRemove);
            System.out.println("Clothing item removed.");
        }
    }

    // Manage Electronic Inventory
    private static void manageElectronicInventory(Inventory<Electronic> electronicInventory) {
        System.out.println("\n------ Manage Electronic Inventory ------");
        System.out.print("Enter Electronic ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Electronic Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Electronic Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Electronic Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Electronic Power: ");
        int warranty = scanner.nextInt();

        Electronic electronic = new Electronic(id, name, price, quantity, warranty);
        electronicInventory.addItem(electronic);
        System.out.println("Electronic item added to inventory.");

        // Show all electronics
        System.out.println("All Electronic Items:");
        ArrayList<Electronic> electronicList = electronicInventory.getAllItems();
        for (Electronic e : electronicList) {
            System.out.println(e.getName());
        }

        // Filtering and displaying by availability
        System.out.print("Do you want to filter electronics by availability? (yes/no): ");
        scanner.nextLine();  // Consume newline
        String filterChoice = scanner.nextLine();
        if (filterChoice.equalsIgnoreCase("yes")) {
            ArrayList<Electronic> availableItems = electronicInventory.filterByAvailability();
            for (Electronic e : availableItems) {
                System.out.println(e.getName() + " - Quantity: " + e.getQuantity());
            }
        }
    }

    // Manage Recently Viewed Items
    private static void manageRecentlyViewedItems(RecentlyViewedItems recentlyViewedItems) {
        System.out.println("\n------ Manage Recently Viewed Items ------");
        System.out.print("Enter Item ID to view: ");
        String id = scanner.nextLine();

        // Simulating an item lookup
        Item item = new Electronic(id, "Item " + id, 100, 10, 5); // Example placeholder
        recentlyViewedItems.addRecentlyViewedItems(item);

        System.out.println("Recently Viewed Items:");
        LinkedList<Item> recentlyViewed = recentlyViewedItems.getRecentlyViewedItems();
        for (Item viewedItem : recentlyViewed) {
            System.out.println(viewedItem.getName());
        }
    }

    // Manage Orders
    private static void manageOrders(OrderProcessor orderProcessor) {
        System.out.println("\n------ Manage Orders ------");
        System.out.print("Enter Order ID: ");
        String orderId = scanner.nextLine();
        System.out.print("Is the order processed? (yes/no): ");
        String processedInput = scanner.nextLine();
        boolean isProcessed = processedInput.equalsIgnoreCase("yes");

        Order order = new Order(orderId, isProcessed);
        orderProcessor.addOrder(order);

        // Displaying orders sorted by priority
        System.out.println("Orders (Sorted by Priority):");
        PriorityQueue<Order> pq = orderProcessor.getPq();
        for (Order orderItem : pq) {
            System.out.println("Order ID: " + orderItem.getOrderID());
        }
    }
}

