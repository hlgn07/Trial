public class TestBank {
   public static void main(String[] args) {
      Bank b = new Bank("CS102 Bank", "05316038079", 
         new Account[] {});

      b = new Bank("CS102 Bank", "05316038079", 
         new Account[] {new Account("John", "05123456789", "Savings", 987654321, 1000),
          new Account("Can", "05987654321", "Savings", 123456789, 2000),
          new Account("Jane", "05246813579", "Invest", 135792468, 3000),
          new Account("Ceren", "05135792468", "Invest", 246813579, 4000)
         });
      
      Account[] accts = new Account[] {new Account("John", "05123456789", "Savings", 987654321, 1000),
          new Account("Can", "05987654321", "Savings", 123456789, 2000),
          new Account("Jane", "05246813579", "Invest", 135792468, 3000),
          new Account("Ceren", "05135792468", "Invest", 246813579, 4000)
         };
      b = new Bank("CS102 Bank", "05316038079", accts);
      
      System.out.println(b.toString());
      System.out.println(b.numAccounts());
      
      if(b.transferFunds(987654321, 246813579, 1250))
         System.out.println("Transfer Successful.");
      else
         System.out.println("Transfer Failed.");

      System.out.println(b.toString());

      if(b.transferFunds(246813579, 987654321, 1250))
         System.out.println("Transfer Successful.");
      else
         System.out.println("Transfer Falied.");

      System.out.println(b.toString());
      
//       b.acctList[2].withdrawFunds(100);
// 
//       System.out.println(b.toString());
      
      accts[2].withdrawFunds(100);

      System.out.println(b.toString());
   }
}