public class Quiz3 {

   public static void square (int n) {
      n = n * n;
   }
   
   public static void square (int[] n) {
      for(int i = 0; i < n.length; i++)
         n[i] = n[i] * n[i];
   }
   
   public static void randArr() {
      int[] array = new int[10];
      int max = 1, min = 100;
      for(int i = 0; i < 10; i++){
         int cur = 1 + (int)(Math.random() * 100);
         if(cur < min)
            min = cur;
         if(cur > max)
            max = cur;
         array[i] = cur;
         System.out.println(cur);
      }
      System.out.println("Min: " + min + "\nMax: " + max);
   }
   
   public static int[] fibonacci(int n) {
      if (n <= 0)
         return new int[0];
      int[] array = new int[n];
      array[0] = 0;
      if (n >= 2)
         array[1] = 1;
      if (n > 2)
         for(int i = 2; i < n; i++)
            array[i] = array[i-1] + array[i-2];
      return array;
         
   }
}