package Arrays;

public class Sum {
   public static void main(String[] args) {
    int[] arr={2,5,3,4,8};
    int s=0;
    for(int i=0;i<=arr.length-1;i++){
        s+=arr[i];
    }
    System.out.println(s);
   } 
}
