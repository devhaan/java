package lab_session_3_e_commerce;

public class Clothing extends Item{
    int size;

    public Clothing(Item i, int size) {
        super(i);
        this.size = size;
    }

    public Clothing(String id, String name, double price, int quantity, int size) {
        super(id, name, price, quantity);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
