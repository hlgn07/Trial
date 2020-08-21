import java.util.Scanner;
import java.util.Arrays;

public class MidTermAns {
   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Which question would you like to see ('ALL' for all)? ");
      String q = in.nextLine();
      int i = in.nextInt();
      
      if (q.equals("ALL")) {
         all();
      } else if (q.equals("Q1")) {
         q1();
      } else if (q.equals("Q3")) {
         q3();
      } else if (q.equals("Q4")) {
         q4();
      } else if (q.equals("Q5")) {
         System.out.println("Enter N: ");
         int n = in.nextInt();
         q5(n);
      } else if (q.equals("Q6")) {
         int[] arr = {0, 1, 0, 3, 12, 2};
         System.out.println(Arrays.toString(arr));
         q6(arr);
         System.out.println(Arrays.toString(arr));
      } else if (q.equals("B")) {
         System.out.print("Enter an integer: ");
         int n = in.nextInt();
         if(bonus(n) == 1)
            System.out.println(n + " is palindromic");
         else
            System.out.println(n + " is not palindromic");
      }

      

   }
   
   public static void all() {
      q1();
      q3();
      q4();
   }
   public static void q1() {
      System.out.println("Q1-a)");
      int i = 2;
      while (i <= 5) {
         int num = 1;
         for (int j = 1; j <= i+1; j++) {
            System.out.print(num +"\t");
            num *= 3;
         }
         System.out.println();
         i++;
      }

      System.out.println("\nQ1-b)");
      int sum = 0;
      for (i = 0; i < 7; i++)
         sum += ++i;
      System.out.println(sum);
   }
   
   public static void q3() {
      int x = 5, y = 5;
      System.out.println("\nQ3 for x = " + x + " and y = " + y);
      q3Eval(x, y);
      x = 20;
      System.out.println("\nQ3 for x = " + x + " and y = " + y);
      q3Eval(x, y);
      x = 40;
      System.out.println("\nQ3 for x = " + x + " and y = " + y);
      q3Eval(x, y);
      y = 40;
      System.out.println("\nQ3 for x = " + x + " and y = " + y);
      q3Eval(x, y);
      x = 20;
      System.out.println("\nQ3 for x = " + x + " and y = " + y);
      q3Eval(x, y);
   }
   
   public static void q3Eval(int x, int y) {
      if (x >= 50) {
         System.out.println("S1");
      } else if (x < 30 && y > 20) {
         System.out.println("S2");
      } else if (x >= 10 && y <= 20) {
         System.out.println("S3");
      } else if (x <= 20) {
         if (y >= 15)
            System.out.println("S4");
         else
            System.out.println("S5");
      } else {
         System.out.println("S6");
      }
   }
   
   public static void q4() {
      int sum = 0;
      int item = 0;
      do {
         item++;
         sum += item;
         if (sum > 4) break;
      } while (item < 5);
      System.out.println("\nQ4-5 sum value:\n" + sum);
      
      System.out.println("Q4-8 lists:");
      int[][] list = {{1, 2, 3, 4, 5}, {12, 3, 45}, {12345}};
      list[2] = list[1];
      list[1][0] = list[0][1];
      list[1][2] = list[2][1];
      for (int i = 0; i < list[2].length; i++)
         System.out.print(list[2][i] + "\t");
   }
   
   public static void q5(int n) {
      for(int i = 0; i < n; i++) {
         for(int j = 0; j < n; j++)
            if(j >= n - i - 1)
               System.out.print("*");
            else
               System.out.print(" ");
         System.out.println();
      }
   }
   
   public static void q6(int[] arr) {
      int j = 0;
      for(int i = 0; i < arr.length; i++)
         if(arr[i] != 0)
            arr[j++] = arr[i];
//      System.out.println(j);
      while(j < arr.length)
         arr[j++] = 0;
   }
   
   public static int bonus(int n) {
      int len = digitCount(n);
//       System.out.println(n + " has " + len + " digits");
//       System.out.println(n + " has " + digitCount2(n) + " digits");
//       for (int i = 0; i < len; i++)
//          System.out.println(getDigit(n, i));
      for (int i = 0; i < len / 2; i++)
         if (getDigit(n, i) != getDigit(n, len - i - 1))
            return 0;
      return 1;
   }
   
   public static int digitCount(int n) {
      return (int)Math.ceil(Math.log(n + 1) / Math.log(10));
   }

   public static int digitCount2(int n) {
      int i;
      for (i = 0; n > 0; n /= 10, i++);
      return i;
   }
   
   public static int getDigit(int n, int i) {
      return n / (int)Math.pow(10, i) % 10;
   }
   
}

