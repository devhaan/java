package lab_session_3_e_commerce;

public class Item implements Comparable<Item> {

    String id;
    String name;
    double price;
    int quantity;

    public Item(String id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public Item(Item i) {
        this.id = i.id;
        this.name = i.name;
        this.price = i.price;
        this.quantity = i.quantity;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int compareTo(Item i) {
        if (!this.name.equals(i.name)) {
            return this.name.compareTo(i.name);
        } else {
            return this.name.compareTo(i.name);
        }
    }
}
