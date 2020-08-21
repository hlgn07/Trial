import java.util.Scanner;

public class Decimal2HexConversion {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a decimal integer: ");
      int decNum = input.nextInt();
      
      System.out.println("Decimal number " + decNum + " is:");
      decimalToHexLedet(decNum);
      System.out.println(" using the means in class.");
      
      System.out.println(decimalToHex(decNum) + " using the means from the textbook.");
      
      
      
   }
   
  public static void decimalToHexLedet(int decNum) {
  /*********************************************************/
  /* Name: Joseph Ledet                                    */
  /* Date: 23-Mar-2016                                     */
  /*                                                       */
  /* decimalToHex - Convert a decimal to a hex as a string */
  /* @param decimal - integer - decimal number to convert  */
  /* @return String - Hex number                           */
  /*********************************************************/
      
      int power = 0;
      for ( ; decNum >= Math.pow(16, power + 1); power++);
      for ( ; power >= 0; power--) {
         int sixteenPower = (int)Math.pow(16, power);
         System.out.print(getHexDigit((char)(decNum / sixteenPower)));
         decNum %= sixteenPower;
      }
  }

  public static String decimalToHex(int decimal) {
  /*********************************************************/
  /* Name: Textbook                                        */
  /* Date: 23-Mar-2016                                     */
  /*                                                       */
  /* decimalToHex - Convert a decimal to a hex as a string */
  /* @param decimal - integer - decimal number to convert  */
  /* @return String - Hex number                           */
  /*********************************************************/
    String hex = "";
    
    while (decimal > 0) {
      int hexValue = decimal % 16; 
      hex = getHexDigit(hexValue) + hex;
      decimal = decimal / 16;
    }
    
    return hex;
  }

   public static char getHexDigit(int decNum) {
      char hexDigit;
      if (decNum < 10)
         hexDigit = (char)('0' + decNum);
      else
         hexDigit = (char)('A' + (decNum - 10));
      return hexDigit;   
   }
}