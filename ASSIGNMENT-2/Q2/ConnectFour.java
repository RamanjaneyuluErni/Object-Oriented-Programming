import java.util.Scanner;
import java.util.Random;
import problem2.*;
public class ConnectFour{

     public static void main(String args[]){
     
     int x=-1;int k=0;
     Scanner sc=new Scanner(System.in);
     Random rn=new Random();
     generate2B obj2B=new generate2B();
     obj2B.printgrid();
     
     while(true) {
 
      
      System.out.print("Player1-Drop colored disk(Enter column):");
      x=sc.nextInt();
      obj2B.setcolumn(x);

      try{ obj2B.DropColoredDisk();}
      catch(illegalexception e1) { System.out.println("Entered Illegal position  "+e1);}
     
      obj2B.printgrid();
      obj2B.checkdraw();
      if(obj2B.getstatus()==true) { System.out.println("Game Draw");break;}
      if(obj2B.check()==0) { System.out.println("You Won "); break;}
      System.out.print("Player2-Drop colored disk(Enter column):");
      x=sc.nextInt();
      obj2B.setcolumn(x);

      try{ obj2B.DropColoredDisk();}
      catch(illegalexception e1) { System.out.println("Entered Illegal position  "+e1);}
     
      obj2B.printgrid();
      obj2B.checkdraw();
      if(obj2B.getstatus()==true) { System.out.println("Game Draw");break;}
      if(obj2B.check()==0) { System.out.println("You Won "); break;}

     }

 }
}