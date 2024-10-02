package Arrays;

public class Secondmax {
   
    public static void main(String[] args) {
        int[] arr={10,43,28,54,69,49,87,52,77,98};
        int fmax=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>fmax){
                smax=fmax;
                fmax=arr[i];
            }else if(arr[i]>smax && arr[i]!=fmax){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
