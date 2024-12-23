package lab_session_3_e_commerce;

import java.util.LinkedList;

public class RecentlyViewedItems {
    LinkedList<Item> recentlyViewedItems;
    static int MAX_SIZE = 3;

    public RecentlyViewedItems() {
        this.recentlyViewedItems = new LinkedList<>();
    }

    public LinkedList<Item> getRecentlyViewedItems() {
        return recentlyViewedItems;
    }

    public void addRecentlyViewedItems(Item item) {
        recentlyViewedItems.remove(item);
        recentlyViewedItems.addFirst(item);
        if(recentlyViewedItems.size() > MAX_SIZE) {
            recentlyViewedItems.removeLast();
        }
    }
}
