package Function;
import java.util.*;
public class power{
    public static int mul(int b, int p){
        int ans=1;
        for(int i=1;i<=p;i++){
            ans*=b;
        }
        return ans;
    }
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        System.out.println("PLEASE ENTER THE BASE NUMBER:");
        int b=s.nextInt();
        System.out.println("PLEASE ENTER THE POWER");
        int p=s.nextInt();
        int result=mul(b ,p);
        System.out.println("THE RESULT IS :"+result);
        
        
    }
}