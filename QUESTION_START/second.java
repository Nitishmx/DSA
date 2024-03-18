package QUESTION_START;
// class Airplane{
//     int flightNumber;
//     int destination;
//     int departureTime;
//     public void CheckFlightStatus(){

//     }
//     public void Delay(){

//     }
// }
class Dog{
    String name;
    String Bread;
    public  Dog(String name,String Bread){
        this.name=name;
        this.Bread=Bread;
    }
    public void display(){
        System.out.println("dog name display:"+name);
        System.out.println("dog bread show: "+Bread);
    }
    public void setter(String name,String Bread){
        this.name=name;
        this.Bread=Bread;
    }
}



// write a java program to create a class called  dog with a name and bread attribute 
// create two instance of the dog class set their attributes using the constructor and modify
// the attributes using the setter methods and print the updated values
public class second {
    public static void main(String[] args) {
        // Airplane object= new Airplane()
        Dog object=new Dog("Kallu","Vodaphonewala");
        Dog object2= new Dog("lilu", "padegreewala");
        object.display();
        object2.display();
        object.setter("doggy","pug");
        object.display();
        object2.setter("sheru", "hye");
        object2.display();

        
        
        
    }
    
}
