public class Rectangle {
   double length, width;
//    double[] sides = new double[2];
   
   public Rectangle(double l, double w) {
      if (l < w){
         length = w;
         width = l;
      } else {
         length = l;
         width = w;
      }
      
//       sides[0] = l;
//       sides[1] = w;
   }
   
   public double[] getSides() {
      double[] arr = {length, width};
      return arr;
      
//       return sides;
   }
   
   public void setLength(double newL) {
      length = newL;
      
      //sides[0] = newL;
   }
   
   public void setWidth(double newW) {
      width = newW;
      
      //sides[0] = newL;
   }

   public double getArea() {
      return length * width;
   }

   public double getPerimeter() {
      return 2 * (length + width);
   }
}