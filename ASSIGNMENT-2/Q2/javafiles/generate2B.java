package problem2;
abstract class generate2A implements I2{
   
   char [][]grid=new char[6][7];
   int column;
   int tag=0;
   public generate2A() {
       column=-1;
       tag=0;
       setcolumn(column);
       setgrid(grid);
       settag(tag);
    }
    
    public void setgrid(char [][]grid) {
      for(int i=0;i<6;i++) {
       for(int j=0;j<7;j++) grid[i][j]='0';
      }
    }
    public void setcolumn(int column) { this.column=column;}
    public int getcolumn() { return this.column;}
    public void settag(int tag) { this.tag=tag;}
    public int gettag() { return this.tag;}
    
    //method to drop colored disk on grid
    public void DropColoredDisk() throws illegalexception{ 

     try {
            if(grid[0][this.getcolumn()]!='0') { throw new illegalexception("Illegal position");}
      
            for(int i=5;i>=0;i--) {
               if(grid[i][this.getcolumn()]=='0') {
                 if(this.gettag()==0) { grid[i][this.getcolumn()]='R'; break; }
                 else { grid[i][this.getcolumn()]='Y'; break; }
               }
            }
          this.settag((this.gettag()+1)%2);
      }
      catch(ArrayIndexOutOfBoundsException e1) { System.out.println("Invalid column entry"); }
     }
}
public class generate2B extends generate2A implements I2 {
   
   boolean status;
   public generate2B() {
      status=false;
   }
   public void setstatus(boolean status) { this.status=status;}
   public boolean getstatus() { return this.status;}
   public void printgrid(){
    for(int i=0;i<6;i++) {
        for(int j=0;j<7;j++) {
          if(grid[i][j]=='0')System.out.print("|"+" ");
          else System.out.print("|"+grid[i][j]);
         }
         System.out.println("|");
     }
     System.out.println("---------------");
   }
  
  // game status cheking method
   public int check() {

   //horizontal checking 
     for(int i=5;i>=0;i--) { 
       for(int j=0;j<4;j++) {
         if(grid[i][j]==grid[i][j+1] && grid[i][j+1]==grid[i][j+2] && grid[i][j+2]==grid[i][j+3]  && grid[i][j+3]!='0') 
          { return 0; }
        }
     }
   // vertical checking 
     for(int i=0;i<7;i++) { 
       for(int j=5;j>=3;j--) {
         if(grid[j][i]==grid[j-1][i] && grid[j-1][i]==grid[j-2][i] && grid[j-2][i]==grid[j-3][i]  && grid[j-3][i]!='0') 
          { return 0; }
        }
     }
  // diagonal checking 
     for(int i=0;i<6;i++) {
       for(int j=0;j<7;j++)  {
          if(i+3 < 6 && j+3 < 7) {
            if(grid[i][j]==grid[i+1][j+1] && grid[i+1][j+1]==grid[i+2][j+2] && grid[i+2][j+2]==grid[i+3][j+3]  && grid[i+3][j+3]!='0')
              { return 0;}  
         } 
       }
     }
     for(int i=5;i>=0;i--) {
       for(int j=0;j<7;j++)  {
          if(i-3>=0 && j+3 < 7) {
            if(grid[i][j]==grid[i-1][j+1] && grid[i-1][j+1]==grid[i-2][j+2] && grid[i-2][j+2]==grid[i-3][j+3]  && grid[i-3][j+3]!='0')
              { return 0;}  
          } 
       }
     }
     return -1;
   }
 
  //draw condition checking
  public void checkdraw() {
    int flag=0,i=0,j=0;
    for(i=0;i<6;i++) {
     for(j=0;j<7;j++) { if(grid[i][j]=='0') { flag=1;this.setstatus(false); break;}}
    }
    if(flag==0) this.setstatus(true);
  }
}