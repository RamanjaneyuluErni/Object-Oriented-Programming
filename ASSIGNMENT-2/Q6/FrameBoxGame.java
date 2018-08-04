import problem6.*;
import java.util.Scanner;
import java.util.Random;
public class FrameBoxGame{
 
  
  public static void main(String args[]){
    
    define6 obj1=new define6();
    int a[][]=new int[10][10];
    obj1.printgrid(a);
    while(true){
      try{
        if(obj1.input(a,1))break;
        if(obj1.input(a,-1))break;}
      catch(exception6 e1){System.out.println("exception: "+e1);}
      //break;
    }
  }
}