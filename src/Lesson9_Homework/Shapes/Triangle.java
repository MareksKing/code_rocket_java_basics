package Lesson9_Homework.Shapes;

public class Triangle extends Shape{

    private Double side1,side2;
    private Double hypotenuse;

    public Double getSide1() {
        return side1;
    }

    public void setSide1(Double side1) {
        this.side1 = side1;
    }

    public Double getSide2() {
        return side2;
    }

    public void setSide2(Double side2) {
        this.side2 = side2;
    }

    public Triangle(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
        this.hypotenuse = Math.sqrt(Math.pow(side1, 2) + Math.pow(side2, 2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public Double calculatePerimeter() {
        return side1+side2+hypotenuse;
    }

    @Override
    public Double calculateArea() {
        return (side1 *side2)/2;
    }
    
}
