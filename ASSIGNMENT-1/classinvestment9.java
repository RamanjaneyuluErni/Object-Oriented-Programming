/* 
  documentation:
  - this program reads the investment amount, annual interest rate, and number of years
  - displays the future investment value using the following formula: 
     futureInvestmentValue = investmentAmount * (1 + monthlyInterestRate)numberOfYears*12 
*/
import java.util.Scanner;
import java.lang.Math;
class q9
{
  // class properties declaration
  double fIValue;
  double IAmount;
  int nofyears;
  double mInterest;
  public q9() // constructor defination
  {
    fIValue=0.0;
    IAmount=0.0;
    nofyears=0;
    mInterest=0.0;
    setfIValue(fIValue );
    setIAmount(IAmount ); 
    setnofyears(nofyears ); 
    setmInterest(mInterest); 
  }
  // getter and setter methods
  void setfIValue( double fIValue ) { this.fIValue=fIValue; }
  void setIAmount( double IAmount ) { this.IAmount=IAmount;}
  void setnofyears( int nofyears ) { this.nofyears=nofyears; }
  void setmInterest( double mInterest) { this.mInterest=mInterest; }
  double getfIValue() { return this.fIValue; }
  double getIAmount() { return this.IAmount;}
  int getnofyears() { return this.nofyears; }
  double getmInterest() { return this.mInterest; }
  // final investment value claculation 
  void evaluate ()
  {
    this.setfIValue(this.getIAmount() * (1 +this.getmInterest())*this.getnofyears()*12);
  }

}
class classinvestment9 // main class
 {
   public static void main(String args[])
    {
      Scanner sc =new Scanner(System.in); // scanner object creation
      System.out.println("enter investmentAmount:");
      double IAmount=sc.nextDouble();
      System.out.println("enter numberOfYears:");
      int nofyears=sc.nextInt();
      System.out.println("enter monthlyInterestRate:");
      double mInterest=sc.nextDouble();
      q9 obj=new q9(); // creating object for class q9()
      obj.setIAmount(IAmount); 
      obj.setnofyears(nofyears); 
      obj.setmInterest(mInterest);
      obj.evaluate();
      String s=" "; // rounding of the value upto 2 decimals
      System.out.printf("futureInvestmentValue:$"+ s.format("%.2f",obj.getfIValue()/68.15));
      
    }
     
 }
 