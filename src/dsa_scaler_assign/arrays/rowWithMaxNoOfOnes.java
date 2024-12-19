package dsa_scaler_assign.arrays;

import java.util.ArrayList;

public class rowWithMaxNoOfOnes {
    public int solve(ArrayList<ArrayList<Integer>> A) {

        int n = A.size();

        int  i = 0, j = n-1, ans = -1;

        while(i < n && j >=0 ) {
            while( j >= 0 && A.get(i).get(j) == 1) {
                j--;
                ans = i;
            }
            i++;
        }
        return ans;
    }
}
