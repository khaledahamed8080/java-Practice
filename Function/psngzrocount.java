package Function;
import java.util.*;
public class psngzrocount {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int pos=0;
        int neg=0;
        int zero=0;

        while(true){
            System.out.println("ENTER A NUMBER OR ENTER EXIT TO END THE LOOP");
            String input=s.nextLine();

            if (input.equalsIgnoreCase("exit")){
                break;
            }

            int number=Integer.parseInt(input);
            if(number>0){
                pos++;
            }else if(number<0){
                neg++;

            }else{
                zero++;
            }
       
        }
        System.out.println("POSITIVE "+pos+" NEGATIVE " +neg+" ZEROES"+zero);

        s.close();
    }
}
