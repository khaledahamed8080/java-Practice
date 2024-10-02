package Arrays;
import java.util.*;
public class Occurence {
   public static void main(String[] args) {
    int[] arr={2,4,7,4,3,3,3,3,5,7,9,5,4,3,3};
    int count=0;
    Scanner s=new Scanner(System.in);
    int element=s.nextInt();

    for(int i=0;i<arr.length;i++){
        if(arr[i]==element){
            count++;
        }
    }
    System.out.println(count);
   } 
}
