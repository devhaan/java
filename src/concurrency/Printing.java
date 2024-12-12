package concurrency;

public class Printing {
        public static void main(String[] args) {
                Thread t1 = new Thread(new RunablePrint(1));
                t1.start();

                for( int i = 0; i <= 1000000; i++) {
                        Thread t2 = new Thread(new RunablePrint(i));
                        t2.start();
                }

                for( int i = 0; i <= 1000000; i++) {
                        Thread t2 = new Thread(new RunablePrint(i));
                        t2.start();
                }
        }
}
