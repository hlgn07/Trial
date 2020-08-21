public class Pen {
   //attributes and getter and setters
   double amount;
   double inkPerChar = 0.01;
   
   public int write(int numChars){
      amount -= inkPerChar * numChars;
      if (amount < 0) {
         int notWritten = (int)(- amount / inkPerChar);
         amount = 0;
         return numChars - notWritten;
      } else {
         return numChars;
      }
   }
}