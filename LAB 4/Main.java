import java.util.Scanner;

abstract class Shape {
    protected int dimension1; 
    protected int dimension2; 

  
    abstract void printArea();
}


class Rectangle extends Shape {
    public Rectangle(int length, int width) {
        this.dimension1 = length;
        this.dimension2 = width;
    }

   
    void printArea() {
        int area = dimension1 * dimension2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {
    public Triangle(int base, int height) {
        this.dimension1 = base;
        this.dimension2 = height;
    }

    void printArea() {
        double area = 0.5 * dimension1 * dimension2;
        System.out.println("Area of Triangle: " + area);
    }
}

// Circle class extending Shape
class Circle extends Shape {
    public Circle(int radius) {
        this.dimension1 = radius; // We only need one dimension for a circle
        this.dimension2 = 0; // Not used
    }

    void printArea() {
        double area = Math.PI * dimension1 * dimension1;
        System.out.println("Area of Circle: " + area);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter length of the rectangle: ");
        int rectLength = scanner.nextInt();
        System.out.print("Enter width of the rectangle: ");
        int rectWidth = scanner.nextInt();
        Shape rectangle = new Rectangle(rectLength, rectWidth);
        rectangle.printArea();

        
        System.out.print("Enter base of the triangle: ");
        int triBase = scanner.nextInt();
        System.out.print("Enter height of the triangle: ");
        int triHeight = scanner.nextInt();
        Shape triangle = new Triangle(triBase, triHeight);
        triangle.printArea();

        
        System.out.print("Enter radius of the circle: ");
        int circleRadius = scanner.nextInt();
        Shape circle = new Circle(circleRadius);
        circle.printArea();

        scanner.close();
    }
}