/**
 * Created by Melikcan Turkdemir on 05/01/16.
 */
public class Store {
    String name;
    Product[] products;

    public Store(String name, Product[] products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void productList() {
        System.out.println("ID\t\tName\tQty\t\tPrice");

        for (Product i: products) {
            System.out.print(i.getID() + "\t\t");
            System.out.print(i.getName() + "\t");
            System.out.print(i.getQuantity() + "\t");
            System.out.println(i.getPrice());
        }
    }

    public double sellProduct(int ID, double quantity) {
        for (Product i : products) {

            if (ID == i.getID()) {
                if (i.reduceQuantity(quantity)){
                    System.out.println(i.getName() +": " + quantity + " sold at " + i.getPrice());
                    return quantity * i.getPrice();
                } else return -1;
            }
        }

        System.out.println("Error: Cannot find the item!");
        return -1;
    }

    public boolean addQuantity(int ID, double quantity) {
        for (Product i : products) {

            if (ID == i.getID()) {
                if (i.increaseQuantity(quantity)) {
                    System.out.println(i.getName() +": " + quantity + " added");
                    return true;
                } else return false;
            }
        }

        System.out.println("Error: Cannot find the item!");
        return false;
    }

    public void discount(int ID, double percentage) {
        for (Product i : products) {

            if (ID == i.getID()) {
                i.setPrice(i.getPrice() * (1 - percentage));
                System.out.println(i.getName() + "'s new price: " + i.getPrice());
                return;
            }

        } System.out.println("Error: Cannot find the item!");
    }
}
