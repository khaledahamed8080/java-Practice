package Arrays;

public class arrays {
    public static void main(String[] args) {
        //dynamic allocation type-int
        int[] arr=new int[10];
        //static allocation type-int
        // int[] arr={1,2,3,4,5,6,7,8,9};
        //string type
        // String[] r={"khaled","ahamed","suhail","shakir"};
        //assigning value
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;
        arr[4]=5;
        arr[5]=6;
        arr[6]=7;
        arr[7]=8;
        arr[8]=9;
        arr[9]=10;
        //accessing value
        int f=arr[7];
        System.out.println(f);
        //printing value
        for(int e:arr){
            System.out.println(e);
        }
        System.out.println(arr.length);
    }   
}
