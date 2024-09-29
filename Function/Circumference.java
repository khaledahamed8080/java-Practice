package Function;
class Circle{
    double radius;
    public void cir(int r ){
      radius=2*3.14*r;
      System.out.println("THE RADIUS OF THE CIRCLE IS:"+radius);
    }
}
public class Circumference {
  public static void main(String[] args) {
    
  
    Circle c=new Circle();
    c.cir(4);
}
}
