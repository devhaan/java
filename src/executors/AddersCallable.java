package executors;

import java.util.concurrent.Callable;

public class AddersCallable implements Callable<Integer> {
    int first;
    int second;

    public AddersCallable(int first, int second){
        this.first = first;
        this.second = second;
    }
    @Override
    public Integer call() {
        return first + second;
    }
}
