package Function;

class Odds{
    int sum;
    public void odd(int n){
        sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                sum+=i;
            }
            
        }
        System.out.println(sum);
    }
}
public class AddOdds{
    public static void main(String[] args) {
    Odds o=new Odds();
    o.odd(6);
    }
}
