package oops;

public class Encapsulation {
    public static void main(String[] args) {
        Bank b=new Bank("AB234",500);

        System.out.println("Account Number is:"+b.getAccNum());
        System.out.println("Account Balance is:"+b.getbalance());

        b.deposit(500);
        System.out.println(b.getbalance());

        b.withdraw(90);
        System.out.println(b.getbalance());
        
    }
}
class Bank{
     private String  AccNum;
     private double balance;


     Bank(String AccNum,double balance){
        this.AccNum=AccNum;
        this.balance=balance;
     }

     public String getAccNum(){
        return AccNum;
     }

     public double getbalance(){
        return balance;
     }
    
    public void deposit(double amount){
        if (amount>0){
            balance+=amount;
            System.out.println("DEPOSITED AMOUNT $"+amount);
        }
    }

    public void withdraw(double amount){
        if (amount<=balance){
            balance-=amount;
           System.out.println("AMOUNT DEBITED");
        }else{
            System.out.println("INSUFFICIENT FUNDS..........");
        }
    }

}