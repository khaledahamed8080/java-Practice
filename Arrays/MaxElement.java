package Arrays;

public class MaxElement {
   public static void main(String[] args) {
    int[] arr={12,76,36,76,86,12,75,03,71};
    int max=arr[0];
    for(int i=0;i<=arr.length-1;i++){
        if(arr[i]>max){
        max=arr[i];
        }

    }
    System.out.println(max);
   } 
}
