package executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);


        for( int i = 0 ;  i < 10 ; i++){
            RunablePrint runablePrint = new RunablePrint(i);
            executorService.submit(runablePrint);
        }


        for( int i = 0 ;  i < 10 ; i++){
            Adders adders  = new Adders(i, i+1);
            executorService.submit(adders);
        }


        List<Future<Integer>> sums = new ArrayList<Future<Integer>>();

        for( int i = 0 ;  i < 10 ; i++){
            AddersCallable addersCallable  = new AddersCallable(i, i+1);
            Future<Integer> sum = executorService.submit(addersCallable);
            sums.add(sum);
        }

        for( int i = 0 ;  i < 10 ; i++){

            System.out.println(sums.get(i).get());
        }

        executorService.shutdown();
    }
}
