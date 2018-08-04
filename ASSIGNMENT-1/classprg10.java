/*
  documentation:
  -this program  prompts the user to enter an integer for today’s day of the week 
      (Sunday is 0, Monday is 1… and Saturday is 6).
  -And also prompt the user to enter the number of days after today for a future day and display the future day of the week.
*/
import java.io.*;
import java.util.Scanner;
class q10
{
    private int presentdaynumber;
    private int daynumber;
    // setters and getters for present day
    public void setpresentdaynumber(int d)
    {
       presentdaynumber=d;
    }
    public int getpresentnumber()
    {
        return presentdaynumber;
    }
    // setters and getters for future  day number
    public void setdaynumber(int d)
    {
        daynumber=d;
    }
    public int getdaynumber()
    {
        return daynumber;
    }
   // alloting day numbers
    private String presentday(int d)
    {
        if (d==0)
            return "Sunday";
        else if (d==1)
            return "Monday";
        else if (d==2)
            return "Tuesday";
       else if (d==3)
            return "Wednesday";
       else if (d==4)
            return "Thursday";
       else if (d==5)
            return "Friday";
       else 
            return "Saturday";
    }
   //  elapsing the day to given future day number
    private String day()
    {
        daynumber=daynumber+presentdaynumber;
        daynumber=daynumber%7;
        return presentday(daynumber);
    }
    public String getdays()
    {
        return "today is "+presentday(presentdaynumber)+" and the future day is "+presentday(daynumber);
    }
}
public class classprg10
{
    public static void main(String args[])
    {
       Scanner s=new Scanner(System.in); // creating object for scanner class
       System.out.print("Enter today's day\n");
       int today=s.nextInt();
       System.out.print("Enter no. of days to elapsed\n");
       int days=s.nextInt();
       q10 d=new q10(); // object creation for class q10()
       d.setpresentdaynumber(today);
       d.setdaynumber(days);
       System.out.print(d.getdays());
    }
}