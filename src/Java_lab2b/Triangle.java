package Java_lab2b;

public class Triangle {
    float base,height;
    public Triangle(){

    }
    public Triangle(float base,float height){

        this.base=base;
        this.height=height;
    }
    public void area(float base,float height){
        float a= (float) 0.5 * base * height;
        System.out.println("Area is: "+a);
    }
}
