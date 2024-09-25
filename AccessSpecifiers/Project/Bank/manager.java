package AccessSpecifiers.Project.Bank;

public class manager {
    private String managerName;
    protected String department;

    public manager(String managerName,String department){
        this.managerName=managerName;
        this.department=department;
    }

    public void overseeOperations(){
        System.out.println(managerName+" is overseeing the "+department+" department");
    }

    protected void manageTeams(){
        System.out.println(managerName+" is managing the team");
    }
}
