package generics;

public class genericPair <F,S>{
    F first;
    S second;
    public genericPair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    static <F,S> void doSomething(F f , S s) {
        System.out.println(f + " " + s);
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
