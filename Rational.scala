//19001568

object Rational extends App {
  
  class Rational (x:Int,y:Int){


    
      def numer=x;
      def denom=y;
    
    
    
     
       def +(r:Rational)=new Rational(this.numer*r.denom+r.numer*this.denom,this.denom*r.denom);
       def neg=new Rational(-this.numer,this.denom);
       def -(r:Rational)= this+r.neg;
       

       override def toString=(numer+"/"+denom)
  }
  

    
       var x=new Rational(3,4);
       var y=new Rational(5,8);
       var z=new Rational(2,7);
       
       val ans=x-y-z;
       println("(3/4)-(5/8)-(2/7)="+ans);
       
    


}