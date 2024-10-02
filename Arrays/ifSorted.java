package Arrays;

public class ifSorted {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,7,6,8};
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[i+1]){
                continue;
            }else{
                System.out.println("THE ARRAY IS NOT SORTED IN THE INDEX OF:"+(i+1));
                break;
            }
        }
    }
}
