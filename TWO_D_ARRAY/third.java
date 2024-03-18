package TWO_D_ARRAY;
// write a java program to create a class called circle with a radius attribute  
// you can access and modify this attribute calculate the area and circumference of the circle
class Circle{
    int radius;
    static float pi=3.14f;
    public Circle(int radius){
        this.radius=radius;
    }
    public void calculateAre(){
        System.out.println("calculate the area of circle:"+(radius*radius)*pi);

    }
    public void circumference(int radius){
        System.out.println("calculate the circumference:"+2*pi*(radius*radius));

    }
}
class third {
    public static void main(String[] args) {
        Circle object=new Circle(20);
        object.calculateAre();
        object.circumference(20);
        
    }
    
}