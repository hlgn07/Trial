public class Account {
   private String name, phone, type;
   private int acctNum;
   private double amount;
   
   public int getAcctNum(){
      return acctNum;
   }
   
   public double getAmount(){
      return amount;
   }
   
   public double withdrawFunds(double amountReq){
      if (amount >= amountReq){
         amount -= amountReq;
         return amountReq;
      } else {
         System.out.println("Not enough");
         return 0;
      }
   }
   
   public void deposit(double depAmount) {
      amount += depAmount;
   }
}