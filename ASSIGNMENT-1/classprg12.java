/*
  documentation:
  - the popular scissor-rockpaper game
  -  game rules:
      1.A scissor can cut a paper
      2.A rock can knock a scissor
      3.A paper can wrap a rock.
  - numbers given like this scissor(0)  rock(1)  paper(2)
  -The program randomly generates a number 0, 1, or 2 representing scissor, rock, and paper. 
  -The program prompts the user to enter a number 0, 1, or 2 and displays a message indicating whether the user or the computer wins, loses, or draws
*/
import java.util.Scanner;
import java.util.Random;
import java.io.*;
class q12
{
  int a,b; String s[]={"scissor","rock","paper"};
  // getter and setter for class properties
  void setA(int a) { this.a=a;}
  int getA() { return this.a;}
  void setB(int a) { this.b=b;}
  int getB() { return this.b;}
  void print() 
  {
    System.out.printf("The computer is "+ s[this.getA()] +" .You are "+s[this.getB()]);
    if(this.getA()==b) System.out.println(" too.It is draw");
    else if(this.getA()==0 && this.getB()==2 || this.getA()==1 && this.getB()==0 || this.getA()==2 && this.getB()==1) //computer win condition
            System.out.println(". Computer won");
    else if(this.getA()==2 && this.getB()==0 || this.getA()==0 && this.getB()==1 || this.getA()==1 && this.getB()==2) // player win condition
          System.out.println(". You won");
  }
}
class classprg12
 {
    public static void main(String[] args)
      {
         Scanner obj=new Scanner(System.in); // instance creation for scanner class
         Random object=new Random(); // instance creation for random class
         System.out.println("enter -1 to quit");
         q12 o=new q12(); // object creation for class q12()
         while(true)
         {
           int a=object.nextInt(3);
           o.setA(a);
           System.out.println("scissor(0)  rock(1)  paper(2) ");
           int b=obj.nextInt();
           o.setB(b);
           if(b==-1) break;
           o.print();
         }
       }
}