package dsa_scaler_assign.arrays;

import java.util.List;

public class RainTrapWater {
    public int trap(final List<Integer> A) {
        int result = 0 ;
        int lengthOfA = A.size();

        //O(n),O(n)
        // List<Integer> psum = new ArrayList<Integer>();
        // List<Integer> ssum = new ArrayList<Integer>(Collections.nCopies(lengthOfA, 0));

        // psum.add(A.get(0));

        // for(int i = 1; i < lengthOfA; i++) {
        //     psum.add(i, Math.max(psum.get(i-1) , A.get(i)));
        // }

        // ssum.set(lengthOfA-1, A.get(lengthOfA -1));

        //  for(int i = lengthOfA-2; i >= 0; i--) {
        //     ssum.set(i, Math.max(ssum.get(i+1) , A.get(i)));
        // }
        // // System.out.print(psum.toString() + ssum.toString());

        // for(int i = 0 ; i< lengthOfA; i++) {
        //     result += Math.max(0,Math.min(psum.get(i), ssum.get(i)) - A.get(i));
        // }


//        O(n),O(1)
        int left = 1, right = lengthOfA - 2, lmax = A.get(0), rmax = A.get(lengthOfA - 1 );

        while(left <= right) {
            if(lmax < rmax) {
                result += Math.max(0,lmax - A.get(left));
                if( lmax < A.get(left)) {
                    lmax = A.get(left);
                }
                left++;
            } else {
                result += Math.max(0,rmax - A.get(right));
                if( rmax < A.get(right)) {
                    rmax = A.get(right);
                }
                right--;
            }
        }

        return result;

    }
}
