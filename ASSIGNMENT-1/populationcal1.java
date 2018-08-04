/*
   documentation: 
 -calculating population of china for the next for years based on the given initial population
 -to estimate the population we are provided with birth rate, death rate and immigrants annually
 - initial pop=312032486 
 - One birth every 7 seconds
 - One death every 13 seconds
 - One new immigrant every 45 second
 - population prediction for next 5 years
*/
import java.util.Scanner;
class q1
{
   long cp;
   long spy;
   long pop;
   public q1() // constructor defination
   {
     cp=0;
     spy=0;
     pop=0;
     this.setSPY(spy);
     this.setCP(cp);
     this.setpop(pop);
   }
   //getters and setters 
   void setSPY(long spy) { this.spy=spy; }
   void setCP(long cp) { this.cp=cp; }
   void setpop(long pop) { this.pop=pop; }
   long getSPY() { return this.spy; }
   long getCP() { return this.cp;}
   long getpop() { return this.pop; }
    void calculate(int i)  // method to predict future population
   {
     this.setpop( this.getCP()+i*((this.getSPY()/7)+(this.getSPY()/45)-(this.getSPY()/13)));
   }
}
class populationcal1 {
   public static void main(String[] args) 
    {
       System.out.println("enter current population ");
       Scanner sc=new Scanner(System.in); // instance creation for scannner class
       long cp=sc.nextLong();
       q1 obj=new q1(); // object creation for class q1()
       obj.setCP(cp);
       obj.setSPY(31536000);
       for(int i=1;i<=5;i++)
        {
          obj.calculate(i);
          System.out.println("population after year-"+i+" : "+obj.getpop());
        }
    }
}