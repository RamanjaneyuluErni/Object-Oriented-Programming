import java.util.Scanner;
class q14
{
  int Amount,Nofyears,Interest;
  public q14()
  {
    Amount=0;Nofyears=0;Interest=0;
    setAmount(Amount);
    setNofyears(Nofyears);
    setInterest(Interest;
   }
  void setAmount(int Amount){ this.Amount=Amount;}
  void setNofyears(int Nofyears){ this.Nofyears=Nofyears; }
  void setInterest(int Interest){ this.Interest=Interest; }
  int getAmount(){ return this.Amount; }
  int getNofyears(){ return this.Nofyears; }
  int getInterest(){ return this.Interest; }
  void claculate()
  {
    double balance =(double)this.getAmount();
    double interest,principal;
    String s=" ";
    for(int i=1;balance>0;i++)
    {
      interest=(double)(this.getInterest()*balance/100.0);




    }
  }
}
class minterest14
 {
    public static void main(String[] args)
      {
         Scanner Sc=new Scanner(System.in);
         System.out.println("enter 3 strings");
         int Amount,Nofyears,Interest;
         System.out.println("enter loan amount:");
         Amount=Sc.nextInt();
         System.out.println("enter no of years:");
         Nofyears=Sc.nextInt();
         System.out.println("enter annual interest:");
         Interest=Sc.nextInt();
  }