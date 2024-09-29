package Function;
import java.util.Scanner;

class Vote{
   public void eligible(int a){
    if(a<18){
        System.out.println("YOU ARE NOT ELIGIBLE TO VOTE.........");
    }else{
        System.out.println("YOU ARE ELIGIBLE TO VOTE.........");
    }
   }
}
class get{
    public int give(){
    Scanner s=new Scanner(System.in);
    System.out.println("PLEASE ENTER YOUR AGE........");
    int age=s.nextInt();
    return age;
    }
}
public class Voting {
    public static void main(String[] args) {
        Vote v=new Vote();
        get g=new get();
        int age=g.give();
        v.eligible(age);




        
    }
    
}
