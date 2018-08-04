package problem1;
abstract class classA implements I1{

  String words[]={"raman","anjierni","rajesh","narsimha","vijay","ajay","saikumar"};
  int ranval,length;

  public classA(){

    ranval=0;
    length=0;
    setranval(ranval);
    setlength(length);

  }

  public void setranval(int ranval){ this.ranval=ranval;}
  public int getranval(){return (this.ranval);}
  public void setlength(int ranval){ this.length=words[ranval].length();}
  public int getlength(){ return (this.length);}
  public String getword(){ return (this.words[this.getranval()]);}

}
public class classB extends classA implements I1{
   
   char []array1=new char[10];
   char []array2=new char[10];
   boolean status;
   int missed;
   int count;
   public classB(){

     status=false;
     missed=0;
     count=0;
     setstatus(status);
     setmissed(missed);
   }
  public void setstatus(boolean status) { this.status=status;}
  public boolean getstatus(){ return this.status; }
  public void setmissed(int missed) { this.missed+=missed;}
  public int getmissed(){ return (this.missed);}

  public void setAsterisk(){
    
    
    for(int i=0;i<this.getlength();i++) 
             array1[i]='*';
     array2 = this.words[this.getranval()].toCharArray();
     
   } 

  public void checkstatus() {
       
      int i;
      for(i=0;i<this.getlength();i++) {
          if(array1[i]=='*') break;
        }
     if(i==this.getlength()) setstatus(true);
     else setstatus(false);
  }

  public void update(char ch){
  
     int flag=0;
     for(int i=0;i<this.getlength();i++) {

       if(array2[i] == ch) { 
           array1[i]=ch;
           flag=1;
       }

     } 
    if(flag==0) setmissed(1);
  }
  
  public void print(){
    for(int i=0;i<this.getlength();i++) System.out.print(array1[i]);
    System.out.print("  ");
  }

}