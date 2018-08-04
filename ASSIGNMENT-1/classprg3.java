/*
  documentation:
 -this one is to find out the minimun distanced points from the given set of points by user
 -it will displays the minimum distanced points with corresponding  distance betweem them
 input points :
 -1 2 3 -1 -1 -1 5 2 1 3 0.5 9 3.5 2 -1.5 8 1.5 -3 -4 4 2 7 4 -0.5 
*/
import java.io.*;
import java.util.Scanner;  
class q3    //class containing points array and meethods to calculate minimum distance
{
    double mdist;   // minimum distance
    int a,b;        // indices of closest points
   public q3()      // constructor
   { 
       mdist=999;
   }
   double points[][]=new double[2][3];  // array containing points;
   public void setpoints(double a[][])  // method to set points in array
   {
       for (int i=0;i<8;i++)
       {
           System.arraycopy(a[i], 0, points[i], 0, 3);
       }    
   }
   public void getpoints(double a[][])  // method to view points in array
   {
       for (int i=0;i<8;i++)
       {
           for (int j=0;j<3;j++)
               a[i][j]=points[i][j];
       }
   }
   void min_distance()  // method to find minimum distance
   {
       double dist=0;
       for (int i=0;i<8;i++)
       {
           for (int j=0;j<8;j++)
           {
               if (j!=i)
               {
                  dist=Math.sqrt(Math.pow(points[i][0]-points[j][0], 2)+Math.pow(points[i][1]-points[j][1],2)+Math.pow(points[i][2]-points[j][2],2));
                  if (dist<mdist)  //stroing minimum distance and indices of closest distance points
                  {
                   a=i;   
                   b=j;
                   mdist=dist;
                  }
               }
           }
       }
   }
   public double getmindist()  // method to get minimum distance
   {
       
       return mdist;
   }
   public void getclosestpoints(int a[])  // method to get clsoest points
   {
       min_distance();
       a[0]=this.a;
       a[1]=b;
   }
}
public class classprg3  
{
    public static void main(String args[])   // main method
    { 
        Scanner s=new Scanner(System.in);  // Creating object for Scanner class   
        double p[][]=new double [8][3];
        System.out.print("Enter 8 points\n");
        for (int i=0;i<8;i++)
        {
           // System.out.print("Enter point "+ (i+1));
            for (int j=0;j<3;j++)
                p[i][j]=s.nextDouble();
        }
        q3 obj=new q3(); //creating instance of q3 class
        obj.setpoints(p);
        int b[]=new int[2];
        obj.getclosestpoints(b);
        System.out.print("closest points are "+"{"+p[b[0]][0]+","+p[b[0]][1]+","+p[b[0]][2]+"}"+" and {"+p[b[1]][0]+","+p[b[1]][1]+","+p[b[1]][2]+"}");
        System.out.print("\n distance between them is "+obj.getmindist());
    }
}