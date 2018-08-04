package problem3;
public class generate3A implements I3{

   int dice1,dice2,dicesum,x,y;
   public generate3A(){

    dice1=0;
    dice2=0;
    dicesum=0;
    x=0;y=0;
    setdice1(dice1);
    setdice2(dice2);
   }
   public void setdice1(int dice1){ this.dice1=dice1;}
   public void setdice2(int dice2){ this.dice2=dice2;}
   public void setdicesum(){ this.dicesum=this.getdice1()+this.getdice2();}
   public int getdice1(){ return (this.dice1);}
   public int getdice2(){ return (this.dice2);}
   public int getdicesum(){ return(this.dicesum);}
   public void createpoint(){
      x=this.getdice1();
      y=this.getdice2();
   }
   public int getxdice1(){ return this.x;}
   public int getydice2(){ return this.y;}
}