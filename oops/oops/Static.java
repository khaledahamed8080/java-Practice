package oops;
//STATIC VARIABLES
// class Employee{
//     static String company="TechCorp";
//     String name;
//     int empId;

//     public Employee(String name,int empId){
//         this.name=name;
//         this.empId=empId;
//     }
//     public void displaydetails(){
//         System.out.println("COMPANY:"+company+" NAME:"+name+" EMPLOYEE ID:"+empId);
//     }

// }


//STATIC METHOD
// class Maths{
//     static int add(int a,int b){
//         return a+b;
//     }
// }


//STATIC BLOCKS
// class DataBase{
//     static String dbms;

//     static{
//         dbms="jdbc:mysql://localhost:3306/mydb";
//         System.out.println("STATIC BLOCK EXECUTED,STATIC VARIABLE SET......");
//     }
//     static void displaydbms(){
//         System.out.println("Database URL:"+dbms);
//     }
// }


//NESTED STATIC CLASS
// class OuterClass{
//     static String value="static value is accessed";

//     static class NestedClass{
//         static void display(){
//             System.out.println("ACCESSING THE STATIC CLASS="+value);
//         }
//     }
// }

//Static and Non-static Interaction
// class Students{
//     static int stdcnt=0;

//     String name;
//     public Students(String name){
//         this.name=name;
//         stdcnt++;
//     }

//     public void displayinfo(){
//         System.out.println("NAME:"+name+"\nTOTAL STUDENTS:"+stdcnt);
//     }
//     static void total(){
//         System.out.println("THE TOTAL COUNT IS:"+stdcnt);
//     }
// }

public class Static{
    public static void main(String[]args){
        // Employee e=new Employee("khaled",234);
        // e.displaydetails();
        // Employee.company="FACEBOOK";
        // e.displaydetails();

        //    int result=Maths.add(2,5);
        //    System.out.println(result);

        // DataBase.displaydbms();
        // OuterClass.NestedClass nested = new OuterClass.NestedClass();
        // nested.display(); 
        // Students s=new Students("khaled");
        // Students n=new Students("ahamed");
        // s.displayinfo();
        // Students.total();


    }
}