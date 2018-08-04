/*
  documentation:
  -This program prompt the user to enter the first 9 digits 
  -displays the 10-digit ISBN (including leading zeros).
  
*/
import java.util.Scanner;
import java.util.Random;
class q11
{
  long sum; // class property
  public q11() //constructor defination
  {
    sum=0;
    setSum(sum);
  }
  // getters and setters
  void setSum(long sum) { this.sum=sum;}
  long getSum() { return this.sum;}
  // to find out the 10th digit 
  void convert(int ch[])
  {
     for(int i=0;i<9;i++)
       {
         this.setSum(this.getSum()+(ch[i])*(i+1));
       }
  }

}
class classprg11 // main class
 {
   
   public static void main(String args[])
    {
      Scanner obj=new Scanner(System.in); // instance for scanner class
      System.out.println("enter first 9 digits of ISBN as integer");
      int[] ch=new int[9];
      for(int i=0;i<9;i++) { ch[i]=obj.nextInt();}
      q11 o=new q11(); // object creation for class q11()
      o.convert(ch);
      System.out.println("The ISBN integer is %d");
      for(int i=0;i<9;i++) { System.out.printf("%d",ch[i]);
      int x=(int)o.getSum()%11;
      if(x==10) System.out.printf("x");
       else System.out.printf("%d",x);
     }
 }
