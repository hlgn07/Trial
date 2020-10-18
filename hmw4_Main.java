/**
 * Created by Melikcan on 05/16/16.
 */
public class Main {
    public static void main(String[] args) {
        Account a = new Account("5678", "1234", 1000);

        System.out.println("With key: " + a.getKey() + " PIN is " + a.getPin());
        System.out.println("Not logged in withdrawal: " + a.withdrawFunds(20));
        System.out.println("Login attempt with encrypted PIN value: " + a.logIn(a.getAcctNum(), a.getPin()));
        System.out.println("Not logged in withdrawal: " + a.withdrawFunds(20));
        System.out.println("Login attempt with parameters in wrong order: " + a.logIn("1234", "5678"));
        System.out.println("Not logged in withdrawal: " + a.withdrawFunds(20));
        System.out.println("Login attempt with correct PIN value: " + a.logIn("5678", "1234"));
        System.out.println("Negative value withdrawal: " + a.withdrawFunds(-20));
        System.out.println("Too much withdrawal: " + a.withdrawFunds(1200));
        System.out.println("Valid withdrawal: " + a.withdrawFunds(20));
        a.deposit(300);
        a.logOut();
        a.deposit(100);
        System.out.println("Final balance: " + a.getBalance());
    }
}
