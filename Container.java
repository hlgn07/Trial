public class Container {
   private String type;
   private double amount, capacity;
   
   public void fill(){
      amount = capacity;
   }
   
   public void drink(double sip){
      if (sip > amount)
         amount = 0;
      else
         amount -= sip;
   }
}