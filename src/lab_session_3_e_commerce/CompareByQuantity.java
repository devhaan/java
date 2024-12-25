package lab_session_3_e_commerce;

import java.util.Comparator;

public class CompareByQuantity implements Comparator <Item> {
    @Override
    public int compare(Item i1, Item i2) {
        if (i1.getQuantity() > i2.getQuantity()) {
            return 1;
        }
        if (i1.getQuantity() < i2.getQuantity()) {
            return -1;
        }
        return 0;
    }
}
