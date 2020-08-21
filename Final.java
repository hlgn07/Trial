public class Final {
//    public static void main(String[] args) {
//       String s1 = "Hello";
//       String s2 = "Hello";
//       String s2 = s1;
//       String s3 = new String("Hello");
//       
// 
//       s2 = "Something Else";
//       if (s1 == s2)
//          System.out.println("s1 == s2");
//       if (s2 == s3)
//          System.out.println("s2 == s3");
//       if (s1.equals(s2))
//          System.out.println("s1.equals(s2)");
//       if (s2.equals(s3))
//          System.out.println("s2.equals(s3)");
//       if (s1.equals(s2) == (s1 == s2))
//          System.out.println("s1.equals(s2) == (s1 == s2)");
//       if (s2.equals(s3) == (s1 == s2))
//          System.out.println("s2.equals(s3) == (s1 == s2)");
//       if (s1.equals(s2) == (s2 == s3))
//          System.out.println("s1.equals(s2) == (s2 == s3)");
//    }
    
//    public static void main(String[] args) {
//       String[] tokens = "Welcome to Java".split("o");
//       for (int i = 0; i < tokens.length; i++) {
//          System.out.print(tokens[i] + "\n");
//       }
//    }

//    public static void main(String[] args) {
//       System.out.println("A,B;C".replaceAll(",;", "#"));
//       System.out.println("A,B;C".replaceAll("[,;]", "#"));
//    }
   
//    public static void main(String[] args) {
//       StringBuilder strBuf = new StringBuilder("ABCDEFG");
//          //Display ABCRRRRDEFG
//       strBuf.insert(3, "RRRR");
//       System.out.println(strBuf);
//       strBuf = new StringBuilder("AEFG");
//          //Display AEFG
//       strBuf.delete(0, 0);
//       System.out.println(strBuf);
//    }

   public static void main(String[] args) {
      System.out.println(reverse("1234"));
      System.out.println(reverse2("5678"));
      
   }

    public static String reverse(String s) {
       String s2 = "";
       for(int i = s.length() - 1; i >= 0; i--) {
          s2 += s.charAt(i);
       }
       return s2;
    }
 
    public static String reverse2(String s) {
       StringBuilder s2 = new StringBuilder(s);
       s2.reverse();
       return s2.toString();
    }
}