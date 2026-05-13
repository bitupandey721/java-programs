
class Account{
    private double balance;
//set method
     public void setBalance(double balance) {
        this.balance=balance;
     }
//return the valu by using of get method
        public double getBalance(){
            return balance;
        }

        public void displayBalance(){
            System.out.println("Account balance is="+balance);
        }
}
public class accountbalance {
    public static void main(String[] args){
        Account acc=new Account();

       acc.setBalance(10000.45);

       double bal=acc.getBalance();
       System.out.println("Account balance="+bal);
//diplay method call
       acc.displayBalance();
    }
    
}
