/*
  documentation:
  - the program prompts the user to enter three cities 
  - displays them in ascending order
*/
import java.util.Scanner;
import java.io.*;
class q15
{
  // class properties
  String[] s=new String[3];
  // getter method string
  void setString(String[] s)
  {
    for(int i=0;i<3;i++) {this.s[i]=s[i];}
  }
  void compare() // sorting method 
  {
    for(int i=0;i<3;i++)
    {
     for(int j=i+1;j<3;j++)
     {
       if(this.s[i].compareToIgnoreCase(this.s[j])>0) { String temp=this.s[i];this.s[i]=this.s[j];this.s[j]=temp;}
     }
    }
  }
  void display()
  {
    for(int i=0;i<3;i++){ System.out.println(this.s[i]);}
  }
}
class ascending15 // main class
 {
    public static void main(String[] args)
      {
         Scanner Sc=new Scanner(System.in); // instance creation for scanner class
         System.out.println("enter 3 strings");
         String[] s=new String[3];
         for(int i=0;i<3;i++)
          {
             s[i]=Sc.nextLine();
          }
          q15 obj=new q15(); // object creation for class q15()
          obj.setString(s);
          obj.compare();
          System.out.println(" after sorting");
          obj.display();
        }
  }