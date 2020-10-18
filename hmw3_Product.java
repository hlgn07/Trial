/**
 * Created by Melikcan Turkdemir on 05/01/16.
 */
public class Product {
    int ID;
    String name;
    double price, quantity;
    boolean isPartitial;

    public Product(int ID, String name, double price, double quantity, boolean isPartitial) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isPartitial = isPartitial;

        if (isPartitial)
            this.quantity = Math.floor(quantity);
    }

    public int getID() {
        return ID;
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

    public double getQuantity() {
        return quantity;
    }

    public boolean reduceQuantity(double q) {
        if (q < 0)
            System.out.println("Error: Quantity cannot be negative!");
        else if (q > quantity)
            System.out.println("Error: Not enough items!");
        else if (isPartitial && (q != Math.floor(q)))
            System.out.println("Error: A whole number is required!");
        else {
            quantity -= q;
            return true;
        } return false;
    }

    public boolean increaseQuantity(double q) {
        if (q < 0)
            System.out.println("Error: Quantity cannot be negative!");
        else if (isPartitial && (q != Math.floor(q)))
            System.out.println("Error: A whole number is required!");
        else {
            quantity += q;
            return true;
        } return false;
    }
}
