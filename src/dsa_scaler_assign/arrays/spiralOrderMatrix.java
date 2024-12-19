package dsa_scaler_assign.arrays;

import java.util.ArrayList;
import java.util.Collections;

public class spiralOrderMatrix {
    public ArrayList<ArrayList<Integer>> generateMatrix(int A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

        for( int i = 0 ; i < A; i++) {
            ArrayList<Integer> inner = new ArrayList<>(Collections.nCopies(A,0));
            result.add(inner);
        }

        int i = 0 , j = 0, count = 1;

        while( A > 1) {

            for( int k = 1 ; k < A; k++) {
                result.get(i).set(j, count);
                count++;
                j++;
            }

            for( int k = 1 ; k < A; k++) {
                result.get(i).set(j, count);
                count++;
                i++;
            }

            for( int k = 1 ; k < A; k++) {
                result.get(i).set(j, count);
                count++;
                j--;
            }

            for( int k = 1 ; k < A; k++) {
                result.get(i).set(j, count);
                count++;
                i--;
            }
            A -= 2;
            i++;
            j++;
        }
        if ( A == 1) {
            result.get(i).set(j, count);
        }
        return result;
    }
}
