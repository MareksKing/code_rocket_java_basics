package Lesson2_Homework.Triangle;

public class Triangle {
    
    double sideA;
    double sideB;
    double hypotenuse;

    double perimeter;
    double area;

    public double calculatePerimeter(){
        perimeter = sideA + sideB + hypotenuse;
        return perimeter;
    }

    public double calculateArea(){
        area = (sideA + sideB)/2;
        return area;
    }
    public Triangle() {

    }

    public Triangle(double sideA, double sideB, double hypotenuse) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hypotenuse = hypotenuse;
    }
    

    @Override
    public String toString() {
        return "Triangle \n[sideA=" + sideA + ",\n sideB=" + sideB + ",\n hypotenuse=" + hypotenuse + ",\n perimeter=" + perimeter
                + ",\n area=" + area + "]";
    }



    

}
