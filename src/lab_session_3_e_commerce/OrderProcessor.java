package lab_session_3_e_commerce;

import java.util.PriorityQueue;

public class OrderProcessor {
    PriorityQueue<Order> pq;

    public OrderProcessor() {
        this.pq = new PriorityQueue<>();
    }

    public void addOrder(Order order) {
        pq.add(order);
    }

    public void processOrder(){
           pq.poll();
    }

    public PriorityQueue<Order> getPq() {
        return pq;
    }
}
