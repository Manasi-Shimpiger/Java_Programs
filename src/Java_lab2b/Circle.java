package Java_lab2b;

public class Circle {
    float radius;
    public Circle(){

    }
    public Circle(float radius){
        this.radius=radius;
    }
    public void area(float radius){
        float a=(22/7) * radius*radius;
        System.out.println("Area is: "+a);
    }
    public void circumference(float radius){
        float c = 2*(22/7)*radius;
        System.out.println("Circumference is: "+c);
    }
}
