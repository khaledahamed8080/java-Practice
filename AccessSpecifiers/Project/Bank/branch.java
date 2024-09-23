package AccessSpecifiers.Project.Bank;

public class branch extends bank{
     protected String branchManagerName;
     public branch(String branchLocation,String branchManagerName) {
        super(branchLocation);
        this.branchManagerName=branchManagerName;
       
    }

    @Override
     public void displayBranchDetails() {
         System.out.println("BRANCH MANAGER"+branchManagerName);
         System.out.println("BRANCH LOCATION"+branchLocation);
         
     }
     
}   
