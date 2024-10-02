package Function;

class Fibo{
    public int fib(int a,int b,int count){
     if (count<1){
        return b;
     }
     System.out.print(a+" ");
     return fib(b,a+b,count-1);

    }
}
public class Fibonacci {
    public static void main(String[] args) {
        Fibo f=new Fibo();
       f.fib(0, 1,20);
    }
}
