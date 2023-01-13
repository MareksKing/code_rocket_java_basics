package Lesson2_Homework.Rectangle;

public class Rectangle {
    
    double sideA;
    double sideB;
    double area;

    public double calculateArea(){
        System.out.println("The dimensions of the rectangle are: " + sideA + " x " + sideB);
        area = sideA * sideB;
        return area;
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
        calculateArea();
    }

    @Override
    public String toString() {
        return "Rectangle [sideA=" + sideA + ", sideB=" + sideB + ", area=" + area + "]";
    }

    

    
}
