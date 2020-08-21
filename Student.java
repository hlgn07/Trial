public class Student {
   String name;
   int ID;
   String dept;
   int year;
   double grades, credits;
   
   public Student(String nameIn, int IDIn, String deptIn, int yearIn) {
      name = nameIn;
      ID = IDIn;
      dept = deptIn;
      year = yearIn;
   }
   
   public int getID(){
      return ID;
   }
   
   public void setID(int IDIn) {
      ID = IDIn;
   }
   
   public void setCredits(double credIn) {
      credits = credIn;
   }
   
   public void setGrades(double gradesIn) {
      grades = gradesIn;
   }
   
   public double getGPA() {
      return grades / credits;
   }
}