public class MultiplicationTable {
   public static void main(String[] args) {
      int high = 10;
      
      for (int i = 0; i <= high; i++) {
         for(int j = 0; j <= high; j++) {
            System.out.print(i * j + "\t");
         }
         System.out.println();
      }
   }
}