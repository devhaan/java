package syncronization;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable{
    Counter counter;
    Lock lock;
    Subtractor(Counter counter, Lock lock){
        this.counter = counter;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i = 0; i < 100000; i++){
            lock.lock();
            counter.count -= 1;
            lock.unlock();
        }
    }
}
