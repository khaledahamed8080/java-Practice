package Function;
class Greater{
    public void com(int a,int b){
        if(a>b){
            System.out.println("A IS THE GREATER NUMBER.......");
        }else{
            System.out.println("B IS THE GREATER NUMBER.....");
        }
    }
}
public class GreatestNumber {
    public static void main(String[] args) {
        Greater g=new Greater();
        g.com(7,6);

    }
    
}
