package AccessSpecifiers.Project.Bank;

public abstract class bank {
    private String bankName;
    protected String branchLocation;


    public bank(String branchLocation){
     this.bankName="khaledBank";
     this.branchLocation=branchLocation;
    }
    
    public String getbankName(){
        return bankName;
    }
    public abstract void displayBranchDetails();
}
