public class Toy {
   private String name, type;
   private int eyes, legs;
   
   public Toy(String nameIn, String typeIn, int eyesIn, int legsIn) {
      name = nameIn;
      type = typeIn;
      if(eyesIn < 0)
         eyes = 0;
      else
         eyes = eyesIn;
      legs = legsIn;
   }
   
   public int getEyes(){
      return eyes;
   }
   
   public void setEyes(int eyesIn){
      if(eyesIn < 0)
         eyes = 0;
      else
         eyes = eyesIn;
   }
   
   
}