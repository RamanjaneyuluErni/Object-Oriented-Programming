import problem1.*;
import java.util.Scanner;
import java.util.Random;
public class  Hangman{
  public static void main(String args[]) throws gameOvermessageException{

   Random rn=new Random();
   Scanner sc=new Scanner(System.in);
   int x=-1;char c;
   classB objB=new classB();
   while(true){
        
        x=rn.nextInt(7);
        System.out.println("ranadom value :"+x);
        objB.setranval(x);
        objB.setlength(x);
        System.out.print("(Guess)Enter a letter in word ");
        objB.setAsterisk();
        objB.print();
        int count=0;
        objB.setmissed(-objB.getmissed());
        while(true) {
        
         
          c=(sc.nextLine()).charAt(0);
          objB.update(c);
          objB.checkstatus();
          if(objB.getstatus()==true) 
          {
            
             System.out.println("The word is a "+objB.getword()+". You missed "+ objB.getmissed()+" times");
             objB.setmissed(-objB.getmissed());
             break; 
          }
          count++;
           try{
                    if(objB.getmissed()==3 && count ==3) { throw new gameOvermessageException("Game over");}
              }
           catch(gameOvermessageException e1){ 
                System.out.println("You missed first 3 times "+e1);
                break;
            }
          System.out.print("(Guess)Enter a letter in word ");
          objB.print();
          
        }
     System.out.println("\nDo you want to Guess another word ? enter y or n :");
     c=(sc.nextLine()).charAt(0);
     if(c=='n')break;
   } 

  }
}