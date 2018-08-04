package problem6;
import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Random;

public class define6 implements i6{
  public void printgrid(int a[][]){
    System.out.println("  0 1 2 3 4 5 6 7 8 9 ");
    for(int i=0;i<10;i++){
      System.out.print(i+" ");
      for(int j=0;j<10;j++){
	if(a[i][j]==0){System.out.print("_ ");}
	else if(a[i][j]==1){System.out.print("R ");}
	else{System.out.print("Y ");}
      }
      System.out.println();
    }
  }
  public boolean input(int a[][],int n) throws exception6{
    if(n==1){System.out.println("Red's turn");}
    else{System.out.println("Yellow's turn");}
    int x,y;
    Scanner in=new Scanner(System.in);
    System.out.print("X-coordinate: ");
    x=in.nextInt();
    System.out.print("Y-coordinate: ");
    y=in.nextInt();
    try{
      if(a[x][y]!=0){throw new exception6("Disc already present");}
      a[x][y]=n;
    }catch(ArrayIndexOutOfBoundsException e1){System.out.println("Out of bounds "+e1);}
    printgrid(a);
    if(checksquare(a,n) || checkrhombus(a,n)){
      if(n==1){System.out.println("Red's won");}
      else{System.out.println("Yellow's won");}
      return true;
    }
    return false;
  }
  public boolean checkrow(int a[][],int i,int j,int k,int n){
    boolean status=true;
    if(i+k-1>9 || j+k-1>9)return false;
    for(int p=0;p<k;p++){
      if(a[i][j+p]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i+p][j]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i+k-1][j+p]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i+p][j+k-1]!=n)status=false;
    }
    return status;
  }
  public boolean checkdiagonal(int a[][],int i,int j,int k,int n){
    boolean status=true;
    if(i-(k-1)<0 || i+k-1>9 ||j+2*k-2>9)return false;
    for(int p=0;p<k;p++){
      if(a[i+p][j+p]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i-p][j+p]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i-p][j+2*k-2-p]!=n)status=false;
    }
    for(int p=0;p<k;p++){
      if(a[i+p][j+2*k-2-p]!=n)status=false;
    }
    return status;
  }
  public boolean checksquare(int a[][],int n){
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        for(int k=2;k<10;k++){
          if(checkrow(a,i,j,k,n))return true;
        }
      }
    }
    return false;
  }
  public boolean checkrhombus(int a[][],int n){
    for(int i=0;i<10;i++){
      for(int j=0;j<10;j++){
        for(int k=2;k<10;k++){
          if(checkdiagonal(a,i,j,k,n))return true;
        }
      }
    }
    return false;
  }
}

