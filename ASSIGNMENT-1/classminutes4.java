/*
 documentation:
 -this program will asks the user to enter minutes,
   after providing minutes it converts the given minutes into years and days
*/
import java.util.Scanner;
class q4
{
  long Min;int Years,Days; // declaring class properties
  public q4() // onstructor defination
  {
    Min=0;Days=0;Years=0;
    setMin(Min);
    setDays(Days);
    setYears(Years);
   }
  // getters and setters 
  void setMin(long Min) { this.Min=Min; }
  void setDays(int Days){ this.Days=Days; }
  void setYears(int Years){ this.Years=Years;}
  long getMin() { return this.Min; }
  int getDays(){ return this.Days; }
  int getYears(){ return this.Years;}
  void cal() // this one for conversion 
  {
     this.setYears((int) this.getMin()/(1440*365));
     this.setMin(this.getMin()%(1440*365));
     this.setDays((int) this.getMin()/1440);
  }
}
class classminutes4 // main class
 {
     public static void main(String[] args)
      {
        Scanner sc =new Scanner(System.in); // instance creation for scnner class
        System.out.println("enter minutes:");
        long Min=sc.nextLong();
        q4 obj=new q4(); // object creation for class q4
        obj.setMin(Min);
        obj.cal();
        System.out.println("years = "+obj.getYears());
        System.out.println("days = "+obj.getDays());
      }
 }