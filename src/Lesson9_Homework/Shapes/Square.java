package Lesson9_Homework.Shapes;

public class Square extends Shape {

    private Double side1,side2;

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

    public Square(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public String toString() {
        return "Square{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                '}';
    }

    @Override
    public Double calculatePerimeter() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Double calculateArea() {
        // TODO Auto-generated method stub
        return null;
    }
    
}
