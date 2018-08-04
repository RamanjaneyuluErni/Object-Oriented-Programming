/*
  documentation:
  - here it is simple game ,th ecomputer generates three random numbers
  - we need to guess the three numbers ,program will displays the no of  strikes and balls 
  - strikes means th ecorrectly guessed values with its position
  - balls means correctly guessed numbers, but not its place
  -after exiting the program your score will be gets displayed based on formula  Score=(100-Attempts*5); 
*/
import java.io.*;
import java.util.Random;
import java.util.Scanner;
class q7
{
   int Attempts,Score,Balls,Strikes;
   int[] a= new int[3];
   int[] x=new int[3];
   boolean Status;
   public q7()
   {
     Attempts=0;Score=0;Balls=0;Strikes=0;Status=true;
     for(int i=0;i<3;i++)
     {
        a[i]=0;x[i]=0;
     }
     setAttempts(Attempts);
     setScore(Score);
     setBalls(Balls);
     setStrikes(Strikes);
     setStatus(Status);
   }
   void setStatus(boolean Status) { this.Status=Status;}
   void setA(int[] a) { for(int i=0;i<3;i++) this.a[i]=a[i]; }
   void setX(int[] x) { for(int i=0;i<3;i++) this.x[i]=x[i]; }
   void setAttempts(int Attempts) { this.Attempts=Attempts; }
   void setScore(int Score) { this.Score=Score; }
   void setBalls(int Balls) { this.Balls=Balls; }
   void setStrikes(int Strikes) { this.Strikes=Strikes; }
   int getAttempts() { return this.Attempts;}
   int getScore() { return this.Score;} 
   int getBalls() { return this.Balls; }
   int getStrikes() { return this.Strikes;}
   boolean getStatus() { return this.Status;}
   void playgame()
   {
      this.setAttempts(Attempts+1);
      this.setBalls(0);
      this.setStrikes(0);
      for(int i=0;i<3;i++) 
      { 
        if(x[i]==a[i]) { this.setStrikes(Strikes+1); }
        for(int j=0;j<3;j++) 
        {
          if(i!=j && x[i]==a[j]) { this.setBalls(Balls+1); break;}
         }
      }
      System.out.println("Strikes:"+this.getStrikes()+"  balls:"+this.getBalls());
      if(this.getStrikes()==3)
      {
        System.out.println("3 Strikes out");
        this.setScore(100-this.getAttempts()*5); 
        this.setStatus(false);
      }
   }
}
class classgame7
{
   public static void main(String args[])
   {
      Random object=new Random();
      Scanner sc =new Scanner(System.in);
      
      int Attempts=0,Balls=0,Strikes=0,Score=0,a[]=new int[3],x[]=new int[3];
      for(int i=0;i<3;i++) a[i]=object.nextInt(10);
      q7 obj=new q7();
      obj.setAttempts(Attempts);
      obj.setScore(Score);
      obj.setBalls(Balls);
      obj.setStrikes(Strikes);
      obj.setA(a);
      System.out.println("Random values are : "+a[0]+" "+a[1]+" "+a[2]);
      while(obj.getStatus()==true)
         {
             System.out.println("enter 3 numbers:");
             for(int i=0;i<3;i++) x[i]=sc.nextInt();
             obj.setX(x);
             obj.playgame();
         }
      System.out.println("Score : "+obj.getScore());
   }
}