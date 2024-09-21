package oops;
public class Implementation{
    public static void main(String[] args){
    // classes and objects
    // Student s1=new Student(12,"khaled");//calls the default constructor
    // s1.getInfo();

    // Student s2=new Student(s1);//copy constructor
    // System.out.println("copy constructor");
    // s2.getInfo();
    
    //  Car car1=new Car("green",200);
    //  car1.getattributes();

    //  Car car2=new Car("blue",300);
    //  car2.getattributes();

    //  Car car3=new Car("violet",400);
    //  car3.getattributes();


    //  Flight f1=new Flight();
    //  f1.displayFlightDetails();

    //  Flight f2=new Flight("HE12J3","SINGAPORE AIRLINES","MEXICO");
    //  f2.displayFlightDetails();

    //  Flight f3=new Flight("RUSSIA",400,7);
    //  f3.displayFlightDetails();

    }
}
// class Car{
//     String color;
//     int size;
    
//     void getattributes(){
//         System.out.println("color is:"+color+" size is:"+size);
//     }
//     //parameterized constructor
//     Car(String color,int size){
//         System.out.println("the car object is initialized");
//         this.color=color;
//         this.size=size;
//     }


//     //Explicit default constructor
//     Car(){
        
//         System.out.println("explicit default constructor");
//     }
// }



// class Student{
//   int age;
//   String name;
//   Student(int age,String name ){
//     System.out.println("constructor......");
//     this.age=age;
//     this.name=name;

//   }
//   copy constructor
//   Student(Student s1){
//     System.out.println("constructor......");
//     this.age=s1.age;
//     this.name=s1.name;

//   }
//   public  void  getInfo(){
//     System.out.println("AGE IS:"+age+ " AND NAME IS:"+name);
//   }
// }

// class Flight{
//     String Flightnumber;
//     String Flightname;
//     String origin;
//     String destination;
//     int capacity;
//     int Flightduration;
// //constructor overloading
//     Flight(){
//         System.out.println("Flight object is initialized........");
//         this.Flightnumber="UA29D3";
//         this. Flightname="ETHIHAD";
//         this.origin="New York";
//         this.destination="Australia";
//         this.capacity=600;
//         this.Flightduration=3;
        
//     }

//     Flight(String Flightnumber,String Flightname,String origin){
//         System.out.println("Flight object is initialized........");
//         this.Flightnumber=Flightnumber;
//         this. Flightname=Flightname;
//         this.origin=origin;
//         this.destination="India";
//         this.capacity=200;
//         this.Flightduration=1;
        
//     }
//     Flight(String destination,int capacity,int Flightduration){
//         System.out.println("Flight object is initialized........");
//         this.Flightnumber="UA29D3";
//         this. Flightname="ETHIHAD";
//         this.origin="New York";
//         this.destination=destination;
//         this.capacity=capacity;
//         this.Flightduration=Flightduration;
        
//     }
    
//     void displayFlightDetails() {
//         System.out.println("Flight Number: " + Flightnumber);
//         System.out.println("Airline: " + Flightname);
//         System.out.println("Origin: " + origin);
//         System.out.println("Destination: " + destination);
//         System.out.println("Passengers: " + capacity);
//         System.out.println("Flight Duration: " + Flightduration + " hours");
//         System.out.println();
//     }
// }