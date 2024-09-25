package AccessSpecifiers.Project.Account;

public abstract class account {
    private String AccountNumber;
    private double balance;
    protected String AccountHolderName;

    public account(String AccountNumber,double balance,String AccountHolderName){
        this.AccountNumber=AccountNumber;
        this.balance=0.0;
        this.AccountHolderName=AccountHolderName;
    }

    public void deposit(double amount){
        if(amount>0){
            balance+=amount;
            System.out.println("DEPOSITED $ "+amount+" to the account");
        }
    }

    protected void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            System.out.println("WITHDREW $ "+amount+" FROM THE ACCOUNT");

        }else{
            System.out.println("INSUFFICIENT BALANCE");
        }
    }

    public double getbalance(){
        return balance;
    }

    public abstract void displayAccountDetails();
}
