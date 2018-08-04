/*
  documentationn:
  -The program reads three edges for a triangle and computes the perimeter if the input is valid
  - Otherwise, display that the input is invalid. 
  -The input is valid if the sum of every pair of two edges is greater than the remaining edge. 
*/
import java.util.Scanner;
import java.io.*;
class q13
{
   // class properties
   int a;
   int b;
   int c;
   int perimeter;
   public q13()  // constructor defination
   {
      a=0;b=0;c=0;perimeter=0;
      this.setA(a);
      this.setB(b);
      this.setC(c);
      this.setperimeter(perimeter);
   }
    // setter and getter methods
    void setA(int a) { this.a=a; }
    void setB(int b) { this.b=b; }
    void setC(int c) { this.c=c; }
    void setperimeter(int perimeter) { this.perimeter=perimeter; }
    int getA() { return this.a; }
    int getB() { return this.b; }
    int getC() { return this.c; }
    int  getperimeter() { return this.perimeter; }
  // testing and perimeter clculation if the sides satisfies triangle property
   void testing()
   {
      if( this.getA()+this.getB()>this.getC() && this.getA()+this.getC()>this.getB() && this.getB()+this.getB()>this.getA() )
         {
            System.out.println("valid Input");
            this.setperimeter(this.getA()+this.getB()+this.getC());
         }
      else System.out.println("Invalid input");
   }

}
class computeperimeter13 // main class
 {
    public static void main(String[] args)
      {
         System.out.println("enter side1 side2 side3 ");
         Scanner sc=new Scanner(System.in); // scanner class instance creation
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         q13 obj=new q13(); // object creation for class q13()
         obj.setA(a);
         obj.setB(b);
         obj.setC(c);
         obj.testing();
         System.out.println("perimeter is : "+obj.getperimeter());
       }
 }