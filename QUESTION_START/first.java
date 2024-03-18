package QUESTION_START;

import java.util.Scanner;

// write a java program to create a class called person with a name and age attribute create two instances of the person
//  class set their attributes using the constructor and print their  name and age
class Person{
    int age ;
    String name;
   
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("person name is:"+name);
        System.out.println("person age is:"+age);
    }
}
public class first {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Person obj= new Person("rahul",60);
        Person obj2= new Person("sonu", 200);
        obj.display();
        obj2.display();
    
        
    }
    
}
