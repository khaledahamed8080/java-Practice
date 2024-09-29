package Function;
//Enter 3 numbers from the user & make a function to print their average.

class Maths{
    int sum;
    public void add(int a,int b,int c){
     sum=(a+b+c)/3;
     System.out.println("THE AVERAGE IS:"+sum);
    }
}
public class addnumbers{
    public static void main(String[] args) {
        Maths m=new Maths();
        m.add(3,7,5);
    } 
}
