package TwoDimensionalArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr=new int[3][4];
       int[][] tr=new int[4][3];
       int k=0;
       for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr[i].length;j++){
            arr[i][j]=k+2;
            k+=2;
        }
    }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                tr[j][i]=arr[i][j];
            }
        }
        for(int i=0;i<tr.length;i++){
            for(int j=0;j<tr[i].length;j++){
                System.out.print(tr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
