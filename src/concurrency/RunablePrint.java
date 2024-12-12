package concurrency;

public class RunablePrint implements Runnable{
    final int count;
    public RunablePrint(int count) {
        this.count = count;
    }
    @Override
    public void run() {
        System.out.println("Printing from a thread " + count + " name : " + Thread.currentThread().getName());
    }
}
