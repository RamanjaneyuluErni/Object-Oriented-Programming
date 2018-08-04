import java.io.*;
import java.util.*;
class CDAccount //creating class
{
    private long accountno;
    private ArrayList<Double> balance= new ArrayList<Double>();   //ArrayList of balances
    private int duration;
    private float rate;
    private String datecreated;
    public void setaccountno(long a)  //method to set account number
    {
        accountno=a;
    }
    public long getaccountno()  //method to get account nnumber
    {
        return accountno;
    }
    public void setbalance(double b)  // method to set balance 
    {
        balance.add(b);
    }
    public ArrayList<Double> getbalance()  // method to get balance
    {
        interest();
        System.out.print(balance.size()+"\n");
        return (balance);
    }
    public void setduration(int a)  // method to set duration
    {
        duration=a;
    }
    public int getduration()  //method to get duration
     {
        return duration;
    }
    public void setrate(float a)  //method to set rate of interest 
    {
        rate=a;
    }
    public float getrate()  //method to get rate of interest 
    {
        return rate;
    }
    public void setdatecreated(String s)  // method to set date created
    {
        datecreated=s;
    }
    public String getdatecreated()  //method to get date created
    {
        return datecreated;
    }
    private void interest()  //method to calculate balance for all months
    {
        for (int i=0;i<duration;i++)
        {
            if (i%3==0&&i!=0)
                rate+=0.5;
            setbalance(balance.get(i)+((balance.get(i)*rate)/100));  //updating balance in array list
        }
    }
}
public class prgrm  // main class
{
    public static void main(String args[])   //main method
     {
       ArrayList<CDAccount> a=new ArrayList<>();  // array list of objects
       for (int i=0;i<5;i++)
       {
          CDAccount d=new CDAccount();
          d.setaccountno((i+1)*1000);
          d.setbalance((i+1)*1000);
          d.setduration((i+1)*3);
          d.setrate(3);
          d.setdatecreated("Sun Jul 12 10:52:16 IST 2016");
          a.add(d);  // adding objects to array list 
       }
       for (int i=0;i<5;i++)
       {
           ArrayList<Double> c=new ArrayList();
           c=a.get(i).getbalance();
           System.out.print("-------------   --------------   -------   ------------\n");
           System.out.print("AccountNumber   InitialBalance   Rate(%)   Date Created\n");
           System.out.print("-------------   --------------   -------   ------------\n");
           System.out.print(a.get(i).getaccountno()+"            "+c.get(0)+"           "+a.get(i).getrate()+"         "+a.get(i).getdatecreated()+"\n");
           for (int j=1;j<c.size();j++)
           System.out.print("                Month "+(j)+"      "+Math.round(c.get(j)*100.00)/100.00+"\n");
           System.out.print("\n");
       }
    }
}