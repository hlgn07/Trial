import java.util.Scanner;

public class GuessNumber {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int num = (int)(Math.random() * 101);

      
      boolean correct = false;
      while(!correct) {
         System.out.print("Please enter a number (0 - 100): ");
         int user = input.nextInt();
         if(num == user) {
            correct = true;
         } else if (user < num) {
            System.out.println("Incorrect - too low");
         } else {
            System.out.println("Incorrect - too high");
         }
      }
      System.out.println("Congratulations! The number is " + num);
   }
}
