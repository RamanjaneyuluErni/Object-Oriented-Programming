import problem5.*;
import java.util.Scanner;
import java.util.Random;
class ConnectFive{

   public static void main(String args[]){
     
     int x=-1,flag=0;
     Scanner sc=new Scanner(System.in);
     Random rn=new Random();
     generate5B obj5B=new generate5B();
     obj5B.printgrid();
     
    while(true) {
 
     for(int i=1;i<=4;i++) {

       System.out.print("Player"+i+"-Drop colored disk(Enter column):");
       x=sc.nextInt();
       obj5B.setcolumn(x);

       try{ obj5B.DropColoredDisk();}
       catch(illegalexception e1) { System.out.println("Entered Illegal position  "+e1);}
     
       obj5B.printgrid();
       obj5B.checkdraw();
       if(obj5B.getstatus()==true) { System.out.println("Game Draw");break;}
       if(obj5B.check()==0) { System.out.println("You Won (RedColoredDisk)"); break;}

     }
     if(obj5B.getstatus()==true || obj5B.check()==0) break;
  }
  }
}