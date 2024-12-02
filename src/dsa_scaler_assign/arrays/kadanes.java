package dsa_scaler_assign.arrays;
public class kadanes {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int currentSum = 0,
                globalMaxSum = Integer.MIN_VALUE;

        for(int elementData : A) {
            currentSum += elementData;
            globalMaxSum = Math.max(currentSum, globalMaxSum);
            currentSum = Math.max(currentSum, 0);
        }
        return globalMaxSum;
    }
}
