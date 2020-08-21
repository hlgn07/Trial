import java.util.Scanner;

public class Lottery {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter a 2 digit number: ");
      int user = input.nextInt();
      int u_o = user % 10;
      int u_t = user / 10;
      
      int lottery = (int)(Math.random() * 100);
      int l_o = lottery % 10;
      int l_t = lottery / 10;
      
      int award;
      if (user == lottery)
         award = 10000;
      else if (u_o == l_t && u_t == l_o)
         award = 3000;
      else if (u_o == l_t || u_o == l_o ||
               u_t == l_o || u_t == l_t)
         award = 1000;
      else
         award = 0;
      
      System.out.println("The number was " + lottery);
      System.out.println("Your award is " + award);
   }
}
