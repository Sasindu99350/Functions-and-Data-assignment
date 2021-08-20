//19001568

object Account extends App {
  
  class Account(id:String,accNo:Int,bal:Double){
     val NIC:String=id;
     val AccNo:Int=accNo;
     var Balance:Double=bal;
     override def toString="NIC: "+NIC+" Account No:"+AccNo+" Balance:"+Balance;
     def transfer(a1:Account,b:Double)={this.Balance=this.Balance-b; a1.Balance=a1.Balance+b;}
      }
  
   var acc1=new Account("1234",1234,2000.00);
   var acc2=new Account("2345",2345,9000.00);

   println("Account 1 Details: "+acc1);
   println("Account 2 Details: "+acc2);

   //now transfer 500.00 from acc1 to acc2
   acc1.transfer(acc2,500.00);
  println("After transfered Account 1 Details: "+acc1);
  println("After transfered Account 2 Details: "+acc2);


   
  
}