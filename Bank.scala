//19001568


object Bank extends App {

    
  class Account(id:String,accNo:Int,bal:Double){
     val NIC:String=id;
     val AccNo:Int=accNo;
     var Balance:Double=bal;
     override def toString="NIC: "+NIC+" Account No:"+AccNo+" Balance:"+Balance;
     def transfer(a1:Account,b:Double)={this.Balance=this.Balance-b; a1.Balance=a1.Balance+b;}
      }

  
   var Bank:List[Account]=List();
   
   val find=(accNo:String,Accs:List[Account])=>Accs.filter(x=>x.AccNo.equals(accNo));
   val negBal=(Accs:List[Account])=>Accs.filter(x=>x.Balance<0);
   val allBalance=(Accs:List[Account])=>(Accs.map(x=>x.Balance)).reduce((x,y)=>x+y);
   val interest=(Accs:List[Account])=>Accs.map(x=>if(x.Balance<0) x.Balance+(x.Balance*0.1) else x.Balance+(x.Balance*0.5));
   
   var accList=List(new Account("1234",1234,2000.00),new Account("2345",2345,1000.00),new Account("1245",1245,2600.00),new Account("9866",9876,-2000.00),new Account("1789",1718,5000.00),new Account("1673",1661,8000.00),new Account("6272",1621,-3000.00),new Account("5661",2888,4000.00));
  println("\n");
   println("All accounts Details :\n"+accList);
  println("------------------------------------------------------------------------------------------");
   println("All accounts which has negative Balance : \n"+negBal(accList));
println("------------------------------------------------------------------------------------------");
println("Total Balance of All accounts : "+allBalance(accList));
println("------------------------------------------------------------------------------------------");
println("After adding interest balances are  : "+interest(accList));


    
  
}