package generics;

public class Client {
    public static void main(String[] args) {

        genericPair<Integer,Integer> pair = new genericPair<>(1,2);
        genericPair<String,Integer> p2 = new genericPair<>("Number : ",2);

        System.out.println(pair.getFirst() + " " + pair.getSecond());
        System.out.println(p2.getFirst() + " " + p2.getSecond());


        pair.<Integer,Integer>doSomething(1,2);


    }
}
