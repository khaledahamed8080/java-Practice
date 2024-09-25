package AccessSpecifiers.Project.Bank;

import AccessSpecifiers.customer;
import AccessSpecifiers.Project.Account.account;

public class accountsTeam {
    public void auditaccounts(customer cus,account acc){
       System.out.println("ACCOUNTS TEAM AUDITING CUSTOMERS:"+cus.getName());
       System.out.println("ACCOUNT BALANCE $"+acc.getbalance());
    }

    void processpayroll(){
        System.out.println("PROCESSING PAYROLL......");
    }
}
