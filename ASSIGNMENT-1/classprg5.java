/*
  documentation:
  -This program  prompts the user to enter a phone number as a string.
  - The input number may contain letters. 
  -The program translates a letter (upper- or lowercase) to a digit and leaves all other characters intact. 
  -its just like creating mobile keypad  
*/
import java.io.*;
import java.util.Scanner;
class q5
{
    String s;
    // setter for string
    void setstring(String a) { s=a;} 
    // getter for string
    String getstring() 
    {
        convert(); return s;
    }
    char getnumber(char c)  // changing the letters to their corresponding number
    {
        if (c>='A'&&c<='C') 
            c='2';
        else if(c>='D'&&c<='F')
            c='3';
        else if(c>='G'&&c<='I')
            c='4';
        else if(c>='J'&&c<='L')
            c='5';
        else if(c>='M'&&c<='O')
            c='6';
        else if(c>='P'&&c<='S')
            c='7';
        else if(c>='T'&&c<='V')
            c='8';
        else if(c>='W'&&c<='Z')
            c='9';
           return c;
    }
    void convert() // converting into mobile keypad
    {
        char c[]=s.toCharArray();
        for (int i=0;i<c.length;i++)
        {
            if (c[i]>='a'&&c[i]<='z')
            {
                int b=c[i];
                b-=32;
                c[i]=(char)(b);
            }
            if (c[i]>='A'&&c[i]<='Z')
                c[i]=getnumber(c[i]);
        }
        s=new String(c);
    }
}
class classprg5 // main class
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in); // instance for scaner class
        System.out.println("enter string:");
        String s1=s.next(); // taking string input
        q5 obj=new q5(); // instance for classq5()
        obj.setstring(s1);
        System.out.print("after conversion "+obj.getstring());
    }
}