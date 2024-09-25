package AccessSpecifiers.Project.Account;

public class checkingAccount extends account{
    private double OverdraftLimit=500.0;
    public checkingAccount(String AccountNumber,String AccountHolderName){
       super(AccountNumber,AccountHolderName);

    }

    @Override
    public void withdraw(double amount){
    if (amount<=getbalance()+OverdraftLimit){
        deposit(-amount);
        System.out.println("widrew $"+amount+" with the over draft limit");
    }else{
        System.out.println("INSUFFICIENT FUNDS");
    }

    }
    @Override
    public void displayAccountDetails() {
     System.out.println("THE ACCOUNT HOLDERS NAME IS:"+AccountHolderName);
     System.out.println("BALANCE IS $"+getbalance());
    }
    
}
