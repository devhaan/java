package lab_session_3_e_commerce;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Item> {
    @Override
    public int compare(Item i1, Item i2) {
        if(i1.getPrice() > i2.getPrice()){
            return 1;
        }
        if(i1.getPrice() < i2.getPrice()){
            return -1;
        }
        return 0;
    }
}
