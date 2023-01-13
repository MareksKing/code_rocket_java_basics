package Lesson2_Homework.Rectangle;

import java.util.Scanner;

public class Area {
    
    double sideA;
    double sideB;
    double area;

    
    
    public Area() {}


    public Area(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    public void setDim(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet abu malu garumus:");
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        this.sideA = sideA;
        this.sideB = sideB;
    }

     public double getArea(){
        area = sideA * sideB;
        return area;
     }

     public double returnArea(){
        Scanner input = new Scanner(System.in);
        System.out.println("Ievadiet abu malu garumus:");
        double sideA = input.nextDouble();
        double sideB = input.nextDouble();
        area = sideA * sideB;
        System.out.println("Rectangle of dimensions: " + sideA + " x " + sideB + " has an area of: " + area);
        return area;
     }


}
