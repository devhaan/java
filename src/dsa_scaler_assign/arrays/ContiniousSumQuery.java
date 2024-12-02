package dsa_scaler_assign.arrays;
import java.util.*;

public class ContiniousSumQuery {
        public ArrayList<Integer> solve(int A, ArrayList<ArrayList<Integer>> B) {
            ArrayList<Integer> resultContinuousSum = new ArrayList<Integer>(Collections.nCopies(A,0));

            for( int i = 0 ; i < B.size(); i++) {
                int left = B.get(i).get(0),
                        right = B.get(i).get(1),
                        ammount = B.get(i).get(2);

                resultContinuousSum.set(left-1, resultContinuousSum.get(left-1) + ammount);

                if( right < A) {
                    resultContinuousSum.set(right, resultContinuousSum.get(right) + (-1 * ammount));
                }

            }

            for( int i = 1 ; i < A; i++) {
                resultContinuousSum.set(i, resultContinuousSum.get(i) + resultContinuousSum.get(i-1));
            }

            return resultContinuousSum;

        }

}
