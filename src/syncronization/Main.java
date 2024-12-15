package syncronization;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Counter counter = new Counter();
        Lock lock = new ReentrantLock();
        Thread t1 = new Thread(new Adder(counter, lock));
        Thread t2 = new Thread(new Subtractor(counter, lock));

        t1.start();
        t2.start();
        t2.join();
        t1.join();

        System.out.println(counter.count);
    }
}
