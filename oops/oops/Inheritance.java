package oops;

public class Inheritance {
    public static void main(String [] args){
    // Triangle t=new Triangle();
    // t.color="RED";
    // t.print();
     
    // Birds b=new Birds();
    // b.display();
    // b.show();
    // b.fly();

    // Triangle t=new Triangle();
    // Circle c=new Circle();

    // t.print();
    // t.sides();

    // c.print();
    // c.radius();
     
    // Explore e=new Explore();
    // e.kill();
    // e.nature();

    // Shakir s=new Shakir();
    // s.family();
    // s.house();
    }
} 
//Multilevel Inheritance
// class Animal{
//     void display(){
//         System.out.println("Animals are ferocious");
//     }
// }
// class Cat extends Animal{
//     void show(){
//         System.out.println("cats are soo cute");
//     }
// }
// class Birds extends Cat{
//     void fly(){
//         System.out.println("birds have the ebility to fly");
//     }
// }


// Single-Level Inheritance

//class Shape{
//   String color;

// }
// class Triangle extends Shape{
//    void print(){
//System.out.println(color);
//}
// }

//Hierarchial Inheritance


// class Shape{
//     void print(){
//         System.out.println("shapes initialized");
//   }
// }
// class Triangle extends Shape{
//      void sides(){
//          System.out.println("has three sides");
//      }
// }
// class Circle extends Shape{
//     void radius(){
//         System.out.println("radius * 2 is the diameter ");
//     }
// }


// interface Animal{
// Multiple Inheritance
//     default void kill(){
//         System.out.println("animals ususlly kill");
//     };
// }

// interface Jungle{
//     void nature();
// }

// class Explore implements Animal ,Jungle{
     
//     @Override
//     public void nature() {
//         System.out.println("Nature is very beautiful");
//     }
   
// }

// interface khaled{
//     void family();
// }

// interface suhail extends khaled{
//     void house();
// }
// class Shakir implements suhail{
//     @Override
//     public void family() {
// System.out.println("we are a happy family");        
//     }
//     @Override
//     public void house() {
// System.out.println("our house in in valasaravakkam");        
//     }
// }