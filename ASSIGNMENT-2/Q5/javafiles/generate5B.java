package problem5;
abstract class generate5A implements I5{
   
   char [][]grid=new char[9][9];
   int column;
   int tag=0;
   public generate5A() {
       column=-1;
       tag=0;
       setcolumn(column);
       setgrid(grid);
       settag(tag);
    }
    
    public void setgrid(char [][]grid) {
      for(int i=0;i<9;i++) {
       for(int j=0;j<9;j++) grid[i][j]='0';
      }
    }
    public void setcolumn(int column) { this.column=column;}
    public int getcolumn() { return this.column;}
    public void settag(int tag) { this.tag=tag;}
    public int gettag() { return this.tag;}
 
    public void DropColoredDisk() throws illegalexception{ 
      
      try {
           if(grid[0][this.getcolumn()]!='0' ) { 
               throw new illegalexception("Illegal position");
             }
        
     
         for(int i=8;i>=0;i--) {
                 if(grid[i][this.getcolumn()]=='0') {
                    if(this.gettag()==0) { grid[i][this.getcolumn()]='R'; break; }
                    else if(this.gettag()==1){ grid[i][this.getcolumn()]='Y'; break; }
                    else if(this.gettag()==2) { grid[i][this.getcolumn()]='B'; break; }
                    else { grid[i][this.getcolumn()]='G'; break; }
                  }
          }
       
          this.settag((this.gettag()+1)%4);
        }
      catch (ArrayIndexOutOfBoundsException e1) {   System.out.println("Invalid column entry"); }

      }
}
public class generate5B extends generate5A implements I5 {
   
   boolean status;
   public generate5B() {
      status=false;
   }
   public void setstatus(boolean status) { this.status=status;}
   public boolean getstatus() { return this.status;}
   public void printgrid(){
    for(int i=0;i<9;i++) {
        for(int j=0;j<9;j++) {
          if(grid[i][j]=='0')System.out.print("|"+" ");
          else System.out.print("|"+grid[i][j]);
         }
         System.out.println("|");
     }
     System.out.println("-------------------");
   }

   public int check() {

     for(int i=8;i>=0;i--) { 
       for(int j=0;j<5;j++) {
         if(grid[i][j]==grid[i][j+1] && grid[i][j+1]==grid[i][j+2] && grid[i][j+2]==grid[i][j+3] && grid[i][j+3]==grid[i][j+4] && grid[i][j+4]!='0') 
          { return 0; }
        }
     }
     for(int i=0;i<9;i++) { 
       for(int j=8;j>=4;j--) {
         if(grid[j][i]==grid[j-1][i] && grid[j-1][i]==grid[j-2][i] && grid[j-2][i]==grid[j-3][i] && grid[j-3][i]==grid[j-4][i]  && grid[j-4][i]!='0') 
          { return 0; }
        }
     }
     for(int i=0;i<9;i++) {
       for(int j=0;j<9;j++)  {
          if(i+4 < 9 && j+4 < 9) {
            if(grid[i][j]==grid[i+1][j+1] && grid[i+1][j+1]==grid[i+2][j+2] && grid[i+2][j+2]==grid[i+3][j+3] && grid[i+3][j+3]==grid[i+4][j+4] && grid[i+4][j+4]!='0')
              { return 0;}  
         } 
       }
     }
     for(int i=8;i>=0;i--) {
       for(int j=0;j<9;j++)  {
          if(i-4>=0 && j+4 < 9) {
            if(grid[i][j]==grid[i-1][j+1] && grid[i-1][j+1]==grid[i-2][j+2] && grid[i-2][j+2]==grid[i-3][j+3] && grid[i-3][j+3]==grid[i-4][j+4] && grid[i-4][j+4]!='0')
              { return 0;}  
          } 
       }
     }
     return -1;
   }
  public void checkdraw() {
    int flag=0,i=0,j=0;
    for(i=0;i<9;i++) {
     for(j=0;j<9;j++) { if(grid[i][j]=='0') { flag=1;this.setstatus(false); break;}}
    }
    if(flag==0) this.setstatus(true);
  }
}
