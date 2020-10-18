/**
 * Created by Melikcan Turkdemir on 05/16/16.
 */
public class Account {
    private String acctNum, pin;
    private double balance;
    boolean loggedIn;
    private int key;

    public Account(String acctNum, String pin, double balance) {
        this.acctNum = acctNum;
        setPin(pin);
        this.balance = balance;
        loggedIn = false;
    }

    public String getAcctNum() {
        return acctNum;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public int getKey() {
        return key;
    }

    public void setPin(String pin) {
        key = 1 + (int)(Math.random() * 9);
        String encryptedPin = "";
        for (int i= 0; i < pin.length(); i++) {
            encryptedPin += (char)(pin.charAt(i) + key);
        }
        this.pin = encryptedPin;
    }

    public boolean logIn(String acctNum, String pin) {
        String encryptedPin = "";
        for (int i= 0; i < pin.length(); i++) {
            encryptedPin += (char)(pin.charAt(i) + key);
        }
        loggedIn = acctNum.equals(this.acctNum) && encryptedPin.equals(this.pin);
        return loggedIn;
    }

    public void logOut() {
        loggedIn = false;
    }

    public double withdrawFunds(double amount) {
        if (!loggedIn) return -3;
        if (amount < 0)  return -2;
        if (amount > balance) return -1;
        balance -= amount;
        return balance;
    }

    public void deposit(double amount) {
        if (loggedIn && amount > 0)
            balance += amount;
    }
}
