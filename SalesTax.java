public class SalesTax {
   public static void main (String[] args) {
      double price = 22.5;
      double tax = price * 0.06;
      int whole = (int) tax;
      int frac = (int)((tax - whole) * 100);
//      int frac = (int)(tax * 100) % 100;
      System.out.println("The sales tax is: " +
         whole + "." + frac);
   }
}