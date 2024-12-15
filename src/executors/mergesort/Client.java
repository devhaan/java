package executors.mergesort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args)throws ExecutionException, InterruptedException  {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Integer> list = List.of(8, 1, 4, 2, 3, 0, 5, 6, 10, 11, 18, 20, 11);
        MergeSort mergeSort = new MergeSort(list, executorService);
        System.out.println(executorService.submit(mergeSort).get());
    }
}
