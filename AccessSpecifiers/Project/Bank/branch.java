package AccessSpecifiers.Project.Bank;

public class branch extends bank{
     protected String branchManagerName;
     String branchCode;

     public branch(String branchLocation,String branchManagerName,String branchCode) {
        super(branchLocation);
        this.branchManagerName=branchManagerName;
        this.branchCode=branchCode;
       
    }

    @Override
     public void displayBranchDetails() {
         System.out.println("BRANCH MANAGER:"+branchManagerName);
         System.out.println("BRANCH LOCATION:"+branchLocation);
         System.out.println("BRANCH CODE:"+branchCode);
         
     }
     
}   
