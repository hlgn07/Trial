/**
 * Created by Melikcan on 05/01/16.
 */
public class Main {
    public static void main(String[] args) {
        Product bread= new Product(123, "Bread", 0.75, 15.0, true);
        Product tomato= new Product(456, "Tomato", 0.5, 20.0, true);
        Product milk= new Product(789, "Milk", 2.75, 20.0, false);
        Product sprite= new Product(135, "Sprite", 1.75, 20.0, false);
        Product coffee= new Product(246, "Coffee", 3.75, 20.0, false);
        Product cooki= new Product(579, "Cookies", 4.75, 20.0, true);

        Product[] arr = {bread, tomato, milk, sprite, coffee, cooki};
        Store mig = new Store("migros", arr);

        mig.productList();
        mig.discount(579, 0.25);
        mig.addQuantity(123, 2.0);
        mig.productList();

    }
}
