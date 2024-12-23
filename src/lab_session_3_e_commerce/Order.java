package lab_session_3_e_commerce;

public class Order {
    String OrderID;
    boolean isExpress;

    public Order(String orderID, boolean isExpress) {
        OrderID = orderID;
        this.isExpress = isExpress;
    }

    public String getOrderID() {
        return OrderID;
    }

    public void setOrderID(String orderID) {
        OrderID = orderID;
    }

    public boolean isExpress() {
        return isExpress;
    }

    public void setExpress(boolean express) {
        isExpress = express;
    }
}
