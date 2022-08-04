package Java_lab2b;

import Java_lab2b.Triangle;
import Java_lab2b.Circle;
import Java_lab2b.Square;

import java.util.Scanner;

public class Shapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("MENU \n 1.Triangle \n 2.Circle \n 3.Square \n Enter your choice");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("Enter Base,Height,side1,side2");
                float b = sc.nextFloat();
                float h = sc.nextFloat();
                float s1 = sc.nextFloat();
                float s2 = sc.nextFloat();
                Triangle t =new Triangle(b,h);
                t.area(b,h);
            } else if (n==2) {
                System.out.println("Enter radius");
                float r = sc.nextFloat();
                Circle c = new Circle(r);
                c.area(r);
                c.circumference(r);
            } else if (n==3) {
                System.out.println("Enter side");
                float side = sc.nextFloat();
                Square s =new Square(side);
                s.area(side);
            }else{
                System.out.println("Invalid choice");
            }
        }
    }


}
