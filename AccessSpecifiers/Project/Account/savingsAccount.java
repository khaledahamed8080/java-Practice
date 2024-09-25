package AccessSpecifiers.Project.Account;

public class savingsAccount  extends account{

    
    public savingsAccount(String AccountNumber, String AccountHolderName) {
        super(AccountNumber,AccountHolderName);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void displayAccountDetails() {
       System.out.println("THE ACCOUNT HOLDERS NAME IS:"+AccountHolderName);
       System.out.println("BALANCE IS $"+getbalance());
        
    }
    
}
