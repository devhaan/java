package executors;

public class Adders  implements Runnable{

    int first;
    int seccond;

    public Adders(int first, int seccond){
        this.first = first;
        this.seccond = seccond;
    }
    @Override
    public void run() {
        System.out.println("Adders  " + Thread.currentThread().getName() + " is running = " + (first + seccond));
    }
}
