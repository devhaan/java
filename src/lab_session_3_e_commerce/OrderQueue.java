package lab_session_3_e_commerce;

import java.util.PriorityQueue;

public class OrderQueue {
    PriorityQueue<Order> pq;

    public OrderQueue() {
        this.pq = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        pq.add(order);
    }

    public void processOrder(){
            PriorityQueue<Order> temp = new PriorityQueue<>();

            for(Order order : pq){
                if(!order.isExpress()){
                    temp.add(order);
                }
            }
            pq = temp;
    }
}
