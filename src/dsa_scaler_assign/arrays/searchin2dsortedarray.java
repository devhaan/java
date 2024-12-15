package dsa_scaler_assign.arrays;

import java.util.ArrayList;

public class searchin2dsortedarray {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n = A.size(), m = A.get(0).size();
        int i = 0, j = m-1;

        while( i < n && j >= 0 ) {
            if( A.get(i).get(j) == B) {
                while(j > 0 && A.get(i).get(j-1) == B){
                    j--;
                }
                return (i+1) * 1009 + (j+1);
            } else if( A.get(i).get(j) > B) {
                j--;
            } else {
                i++;
            }
        }
        return -1;
    }
}
