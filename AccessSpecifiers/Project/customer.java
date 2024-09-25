package AccessSpecifiers.Project;

public class customer {
    private String name;
    private String CustomerId;


    public customer(String name,String CustomerId){
        this.name=name;
        this.CustomerId=CustomerId;
    }

    public String getname(){
        return name;
    }
    public String getCustomerId(){
        return CustomerId;
    }
}
