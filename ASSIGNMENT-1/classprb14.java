import java.io.*;
import java.util.Scanner;
class loan  // class containing properties and methods
{
    private double loanamount;  
    private float years;
    private double rate;  // anual rate of interest
    private  double monthlypayment; 
    private double interest;  // monthly interest
    private double balance;  // remaining balance after each payment
    private double principle;  // principle paid each month
    public void setloan(double a)  // method to set loan amount
    {
        loanamount=a;
        balance=loanamount;
    }
    public double getloan()  // method to get loan amount
    {
        return loanamount;
    }
    public void setyears(float a)  // method to set number of years
    {
        years=a;
    }
    public float getyears() // method to get number of years
    {
        return years;
    }
    public void setrate(double a) // method to set rate of interest 
    {
        rate=a;
    }
    public double getrate() // method to get rate of interest
    {
        return rate;
    }
    private double monthlypayment() // method to calculate monthly payment
    {
        rate=rate/(12*100);
        monthlypayment=loanamount*((rate*Math.pow(1+rate,(years*12))/(Math.pow(1+rate,years*12)-1)));
        return monthlypayment;
    }
    public double getmonthlypayment()  // method to get monthly payment
    {
        return monthlypayment();
    }
    public double gettotalpayment() // method to get total payment
    {
        return monthlypayment*(years*12);
    }
    private void interest()  // method yo calculate interest every month
    {
        interest=balance*(rate);
        principle=monthlypayment-interest;
        balance-=principle;
    }
    public double getprincipal()  // method to get pprinciple
    {
        return principle;
    }
    public double getbalance()  // method to get balanace
    {
        return balance;
    }
    public double getinterest()  // method to get interest
    {
         interest();
         return interest;
    }
}
public class classprb14 // main class 
{
    public static void main(String args[]) // main method
    {
        Scanner s=new Scanner(System.in);
        loan l=new loan();
        System.out.print("Enter loan amount\n");
        double loan=s.nextDouble();
        System.out.print("Enter rate of interest(annual)\n");
        double rate=s.nextDouble();
        System.out.print("Enter number of years\n");
        float years=s.nextFloat();
        l.setloan(loan);
        l.setrate(rate);
        l.setyears(years);
        int i=1;
        System.out.print("Monthly payment:--  ");
        System.out.print(Math.round(l.getmonthlypayment()*100D)/100D);
        System.out.print("\nTotal payment:--");
        System.out.print(Math.round(l.gettotalpayment()*100D)/100D);
        System.out.print("\nPayment      interest      Principle      Balance\n");
        while(true)
        {
            if (l.getbalance()<1)
                break;
          System.out.print(i+"               ");
          System.out.printf("%.2f          %.2f        %.2f",l.getinterest(),l.getprincipal(),l.getbalance());
          System.out.print("\n");
        }
    }
}