package Lesson2_Homework.Triangle;

public class TriangleDemo {
    
    public static void main(String[] args) {
        
        Triangle noParameterTriangle = new Triangle();
        noParameterTriangle.sideA = 3;
        noParameterTriangle.sideB = 4;
        noParameterTriangle.hypotenuse = 5;

        noParameterTriangle.calculatePerimeter();
        noParameterTriangle.calculateArea();
        System.out.println(noParameterTriangle);


        Triangle parameterTriangle = new Triangle(3, 4, 5);
        parameterTriangle.calculateArea();
        parameterTriangle.calculatePerimeter();
        System.out.println(parameterTriangle);
    }
}
