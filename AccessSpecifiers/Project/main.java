package AccessSpecifiers.Project;

import AccessSpecifiers.customer;
import AccessSpecifiers.Project.Account.checkingAccount;
import AccessSpecifiers.Project.Account.savingsAccount;
import AccessSpecifiers.Project.Bank.accountsTeam;
import AccessSpecifiers.Project.Bank.manager;
import AccessSpecifiers.Project.Bank.techTeam;
import AccessSpecifiers.Project.Transactions.transactions;

public class main {
    public static void main(String[] args) {
        techTeam tt=new techTeam();
        accountsTeam at=new accountsTeam();
        manager m=new manager("khaled","tech");


        customer c=new customer("kavitha","KA34");
        savingsAccount sa=new savingsAccount("SA34",c.getname());
        checkingAccount ca=new checkingAccount("CA34",c.getname());


        transactions tc=new transactions();
        tc.deposit(sa, 1000);
        tc.withdraw(sa, 500);
        tc.transfer(sa, ca, 1200);


        sa.displayAccountDetails();
        ca.displayAccountDetails();


        tt.manageSecurity();
        at.auditaccounts(c,sa);
        m.overseeOperations();
    }
}
