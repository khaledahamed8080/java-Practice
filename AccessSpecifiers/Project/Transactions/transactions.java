package AccessSpecifiers.Project.Transactions;

import AccessSpecifiers.Project.Account.account;

public class transactions {
    public void deposit(account Acccount,double amount){
        Acccount.deposit(amount);
        System.out.println("Transaction deposited $"+amount);
    }
    public void withdraw(account Acccount,double amount){
        Acccount.withdraw(amount);
        System.out.println("Transaction withdrew $"+amount);
    }

    public void transfer(account frmacc,account toacc,double amount){
        if(frmacc.getbalance() >=amount){
            frmacc.withdraw(amount);
            toacc.deposit(amount);
            System.out.println("TRANSACTION: transferring $:"+amount);
        }else{
            System.out.println("TRANSACTION FAILED:INSUFFICIENT FUNDS");
        }
    }
}
