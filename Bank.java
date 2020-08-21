public class Bank {
   private String name, phone;
   private Account[] acctList = new Account[100];
   private int numAccounts = 0;
   
   public void addAccount(Account newAccount) {
      acctList[numAccounts++] = newAccount;
      
   }
   
   public boolean transferFunds(int fromAcct, int toAcct, double amount) {
      int fromIndex = -1, toIndex = -1;
      for(int i = 0; i < acctList.length; i++) {
         if (acctList[i].getAcctNum() == fromAcct)
            fromIndex = i;
         if (acctList[i].getAcctNum() == toAcct)
            toIndex = i;
      }
      if(fromIndex == -1 || toIndex == -1){
         System.out.println("Account not found");
         return false;
      } else if (acctList[fromIndex].getAmount() < amount) {
         System.out.println("Dude, I ain't got that!!");
         return false;
      } else {
         acctList[fromIndex].withdrawFunds(amount);
         acctList[toIndex].deposit(amount);
         return true;
      }
   }
}