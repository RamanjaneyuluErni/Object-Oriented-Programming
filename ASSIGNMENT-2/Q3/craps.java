import problem3.*;
import java.util.Scanner;
import java.util.Random;
public class craps{

     public static void main(String args[]){
     
     int dice1=0,dice2=0;
     int count=0;
     Scanner sc=new Scanner(System.in);
     Random rn=new Random();
     generate3A obj2=new generate3A();
     while(true) {
     
        dice1=1+rn.nextInt(7);  
        dice2=1+rn.nextInt(7);
        System.out.println("dice1 value : "+dice1+"\ndice2 value : "+dice2); 
        obj2.setdice1(dice1);
        obj2.setdice2(dice2);
        obj2.setdicesum();
        System.out.println("dice sum : "+obj2.getdicesum());
        if(count==0) {
           if(obj2.getdicesum()==7 || obj2.getdicesum()==11) {
            System.out.println("It's Natural.You won"); break;
           }

           if(obj2.getdicesum()==2 || obj2.getdicesum()==3 || obj2.getdicesum()==12) {
            System.out.println("It's craps.You lossed"); break;
           }
        }

        else {
                 if(count==0) { obj2.createpoint(); System.out.println("Point is created");}
                 else {
                   if(obj2.getdicesum()==7 ||(obj2.getdice1()==obj2.getxdice1() && obj2.getdice2()==obj2.getydice2()))
                        System.out.println("You lossed");
                   else System.out.println("You won");
                   break;
                 }
        }
          count++;
    }

 }
}