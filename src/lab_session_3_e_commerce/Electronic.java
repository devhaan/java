package lab_session_3_e_commerce;

public class Electronic extends  Item {
    int warranty;

    public Electronic(String id, String name, double price, int quantity, int warranty) {
        super(id, name, price, quantity);
        this.warranty = warranty;
    }

    public Electronic(Item i, int warranty) {
        super(i);
        this.warranty = warranty;
    }

    public int getWarranty() {
        return warranty;
    }

    public void setWarranty(int warranty) {
        this.warranty = warranty;
    }
}
