package Lesson9_Homework.Shapes;

public class Rectangle extends Shape {

    private Double side1,side2;
    private Double perimeter = 0.00;

    @Override
    public String toString() {
        return "Rectangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    private Double area = 0.00;

    public Rectangle(Double side1, Double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeter = 2*(side1+side2);
        this.perimeter = perimeter;
        return perimeter;
    }

    @Override
    public Double calculateArea() {

        Double area = side1*side2;
        this.area = area;
        return area;
    }
    
}
