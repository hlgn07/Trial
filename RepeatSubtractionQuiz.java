import java.util.Scanner;

public class RepeatSubtractionQuiz {
   public static void main(String[] args) {
      int number1 = (int)(Math.random() * 10);
      int number2 = (int)(Math.random() * 10);
      if (number1 < number2) {
         int temp = number1;
         number1 = number2;
         number2 = temp;
      }
      System.out.print("What is " + number1 +
      " - " + number2 + "? ");
      boolean correct = false;
      int guesses = 0;
      Scanner input = new Scanner(System.in);
      while (!correct){
         int answer = input.nextInt();
         guesses++;      
         if(answer == number1 - number2) {
            System.out.println("You are correct!!!");
            correct = true;
         }
         else
            System.out.println("You are not correct. Try again.");
        
      }
//         System.out.println("Your answer is incorrect.\n" +
  //       number1 + " - " + number2 + " is " + (number1 - number2));
   }
}