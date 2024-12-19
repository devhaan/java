package dsa_scaler_assign.arrays;

import java.util.ArrayList;

public class sumOfAllSubmatrices {
    public int solve(ArrayList<ArrayList<Integer>> A) {

        int n = A.size(), m = A.get(0).size(), ans = 0;


        for( int i = 0 ; i < n ; i++) {
            for( int j = 0 ; j < m ; j++) {
                ans += (i + 1) * ( j + 1) * ( n- i) * ( m - j) * A.get(i).get(j);
            }
        }
        return ans;
    }
}
