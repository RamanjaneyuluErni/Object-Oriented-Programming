/*
   documentation:
  -this one is for calculating the average of giver integers and doubled values
  -the main intension of this program is to demonstrate the overloading concept 
     by taking to function names are same with different return types and parameters
*/ 
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
class q2 
{
   int size1,size2; // class properties declaration
   public q2()  // constructor defination
   {
     size1=0;size2=0;
     setSize1(size1);
     setSize2(size2);
   }
   void setSize1(int size1){ this.size1=size1; }
   void setSize2(int size2){ this.size2=size2; }
   int getSize1(){ return this.size1; }
   int getSize2(){ return this.size2; }
   public int average(int[] array1)  // evaluates average of integer values
     {
       int sum=0;
       System.out.println("generated random values");
       for(int i=0;i<this.getSize1();i++) 
         {
            System.out.printf("%d ",array1[i]);
            sum=sum+array1[i];
         } 
       return (sum/this.getSize1());
   } 
   public double average(double[] array2) // evaluates average of doubled values
     {
        double sum=0.0;
        System.out.println("generated random values");
        for(int i=0;i<this.getSize2();i++) 
         {
           String s=" ";
           s=s.format("%.2f",array2[i]);
           System.out.printf(s+"  ");
           sum=sum+array2[i];
         } 
        return (double)Math.round((sum/this.getSize2())*100.0)/100.0;
     }
}
class classaverage2  // main class 
{
    public static void main(String[] args) 
     {
        int size1,size2;
        Scanner Sc=new Scanner(System.in); // instance creation of scanner class
        Random object=new Random();    // instance creation for random class
        System.out.println("enter size1 value:");
        size1=Sc.nextInt();
        int[] array1=new int[size1];
        for(int i=0;i<size1;i++) array1[i]=object.nextInt(101);
        System.out.println("enter size2 value:");
        size2=Sc.nextInt();
        double[] array2=new double[size2];
        for(int i=0;i<size2;i++) 
         {
            double y= Math.random()+object.nextInt(49);  // generating random double value 
            array2[i]=(double)(Math.round(y*100.0)/100.0);  // roundig upto 2 decimal places 
         }
       q2 obj=new q2();  // object creation for class q2()
       obj.setSize1(size1);
       obj.setSize2(size2);
       System.out.println("\nint type avg :"+obj.average(array1));
       System.out.println("\ndouble type avg :"+obj.average(array2));

     }
}