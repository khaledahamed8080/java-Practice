package Function;
import java.util.*;
class Goo{
    public int calculate(int a,int b){
    if(b==0){
      return a;
    }
    return calculate(b,a%b);
    }
}
public class Gcd {
   public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("ENTER THE FIRST NUMBER.......");
    int a=s.nextInt();
    System.out.println("ENTER THE SECOND NUMBER......");
    int b=s.nextInt();
    Goo g=new Goo();
    int gcd=g.calculate(a, b);
    System.out.println("THE GCD OF THE NUMBERS ARE:"+gcd);
   } 
}
