package lab_session_3_e_commerce;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Client implements Comparable<Client>{

    int test;

    public Client(int test) {
        this.test = test;
    }

    @Override
    public int compareTo(Client c) {
        if(c.test == this.test){
            return 0;
        }
        if (c.test > this.test) {
            return 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        ArrayList<Client> test = new ArrayList<>();
        Client c0 = new Client(3);
        Client c1 = new Client(2);
        Client c2 = new Client(1);

        test.add(c0);
        test.add(c1);
        test.add(c2);

        Collections.sort(test, new Client());





    }
}
