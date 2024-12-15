package executors.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;

public class MergeSort implements Callable<List<Integer>> {

        final List<Integer> unsortedArray;
        final ExecutorService executorService;


        public MergeSort(List<Integer> unsortedArray, ExecutorService executorService) {
            this.unsortedArray = unsortedArray;
                this.executorService= executorService;

        }

        public List<Integer> sort() throws ExecutionException, InterruptedException{

            int len = unsortedArray.size();
            if(len <= 1){
                return unsortedArray;
            }
            int mid = len/2;
            List<Integer> leftUnsorted = unsortedArray.subList(0, mid);
            List<Integer> rightUnsorted = unsortedArray.subList(mid, len);

            Future<List<Integer>> leftSortedFuture = executorService.submit(new MergeSort(leftUnsorted, executorService));
            Future<List<Integer>> rightSortedFuture = executorService.submit(new MergeSort(rightUnsorted, executorService));


            List<Integer> sortedArray = new ArrayList<>();
            List<Integer> leftSorted = leftSortedFuture.get();
            List<Integer> rightSorted = rightSortedFuture.get();
            int i = 0, j = 0;

            while( i < leftSorted.size() && j < rightSorted.size() ) {
                sortedArray.add(leftSorted.get(i) < rightSorted.get(j) ? leftSorted.get(i++) : rightSorted.get(j++));
            }

            while(i < leftSorted.size()){
                sortedArray.add(leftSorted.get(i++));
            }
             while( j < rightSorted.size()){
                 sortedArray.add(rightSorted.get(j++));
             }

             return sortedArray;

        }

        @Override
        public List<Integer> call() throws Exception {
            return sort();
        }


}
