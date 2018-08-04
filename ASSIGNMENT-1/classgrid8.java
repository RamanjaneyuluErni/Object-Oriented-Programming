/*
   documentation:
   -this  program will provides a menu with 3 options: 
        1 for take input for a grid 
        2. Generating grid values and displaying continuously with yes/no to display next grid with the same size of grid or he wants to stop.
        3. Exit to quit from the program
  -grid will be created with random values as based on the size as you are given
  -finally you will see grid with size you entered

*/
import java.util.Scanner;
import java.util.Random;
class q8
{
   int Size; // declaring class poperty
   public q8() // constructor defination
   {
     this.Size=0;
     setSize(Size);
   }
  // setters and getters
  void setSize(int Size) { this.Size=Size;}
  int getSize() { return this.Size; }
  // this one will prints the grid
  void printGrid(int grid[][])
    {
      for(int i=0;i<this.getSize();i++)
       {
         System.out.printf("-");
         for(int k=0;k<this.getSize();k++) {  System.out.printf("---"); }
         System.out.printf("-\n|");
         for(int j=0;j<this.getSize();j++) { System.out.printf("%d ",grid[i][j]); }
         System.out.printf("|\n");
       }
      System.out.printf("-");
      for(int k=0;k<this.getSize();k++) { System.out.printf("---"); } 
      System.out.printf("-");
    }
}
class classgrid8 // main class
{
   
   public static void main(String args[])
    {
      int a,Size;
      Scanner Sc=new Scanner(System.in); // instance creation for scanner class
      Random Rn=new Random();// instance creation for random class
      q8 obj=new q8(); // object creation for class q8()
      while(true)
       {
         System.out.println("Select the choice");
         System.out.println("1: Enter the grid size\n2: Generate the grid\n3: Exit");
         a=Sc.nextInt();
         System.out.println("You have selected option "+a);
         if(a==3)break;
         if(a==1)
          {
             System.out.printf("Please enter the size for the grid:");
             Size=Sc.nextInt();
             obj.setSize(Size);
             int[][] grid=new int[Size][Size];
             System.out.println("The grid with size "+Size+"x"+"Size is");
             while(true)
             {
                for(int i=0;i<Size;i++)
                 {
                    for(int j=0;j<Size;j++) grid[i][j]=10+Rn.nextInt(90);
                 }
                obj.printGrid(grid);
                System.out.println("\nDo You want to continue (Y/N)?");
                char ch=(Sc.next()).charAt(0);
                if(ch=='N')break;
             } 
           }
        }
     }
 }
