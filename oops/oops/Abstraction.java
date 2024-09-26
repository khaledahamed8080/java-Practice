package oops;
public class Abstraction{
    public static void main(String [] args){
    //  Vehicle c=new Car();
    //  c.start();
    //  c.stop();


    //  Vehicle b=new Bike();
    //  b.start();
    //  b.stop();
    Family h=new Home();
    h.kids();
    h.parents();
    h.end();
 
    }
}
// ABSTRACTION
// abstract class Vehicle{
//     abstract void start();

//     void stop(){
//         System.out.println("VEHICLE HAS STOPPED............");
//     }
// }

// class Car extends Vehicle{
//     @Override
//     void start() {
//       System.out.println("CAR STARTS BOTH WITH KEYS AND THROUGH REMOTE CONTROL........");        
//     }
// }


// class Bike extends Vehicle{
//     @Override
//     void start() {
//         System.out.println("NOWADAYS EVEN BIKES ARE BEING STARTED THROUGH REMOTE CONTROLS.......");
//     }
// }

//INTERFACES
interface Family{
    void kids();
    void parents();
    default void end(){
        System.out.println("this makes this a complete family");
    }
}

class Home implements Family{
     @Override
     public void kids() {
     System.out.println("khaled and suhail are kids");         
     }

     @Override
     public void parents() {
     System.out.println("farzana and shakir are parents");
         
     }
}