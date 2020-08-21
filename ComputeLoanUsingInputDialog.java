import javax.swing.JOptionPane;

public class ComputeLoanUsingInputDialog {
   public static void main(String[] args) {
      String annIntRateStr = JOptionPane.showInputDialog(
            "Enter annual interest rate: ");
      
      double annIntRate = Double.parseDouble(annIntRateStr);
      
      double monthIntRate = annIntRate / 1200;
      
      String numYearsStr = JOptionPane.showInputDialog(
            "Enter number of years: ");
      
      int numYears = Integer.parseInt(numYearsStr);
      
      String loanStr = JOptionPane.showInputDialog(
            "Enter loan amount: ");
      
      double loan = Double.parseDouble(loanStr);
      
      double monthPayment = loan * monthIntRate / (1 -
                        1 / Math.pow(1 + monthIntRate, numYears
                        * 12));
      double totalPayment = monthPayment * 12 * numYears;
      
      System.out.println("Monthly Payment: " + monthPayment);
      System.out.println("Total Payment: " + totalPayment);
      
      
      
   }
}