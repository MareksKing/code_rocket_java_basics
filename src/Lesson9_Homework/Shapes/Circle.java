package Lesson9_Homework.Shapes;

public class Circle extends Shape{

    private Double radius;
    private final Double pi = 3.14;
    private Double perimeter = 0.00;

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    private Double area = 0.00;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    public Double getPi() {
        return pi;
    }

    public Circle(Double radius) {
        this.radius = radius;
    }


    @Override
    public Double calculatePerimeter() {
        Double perimeter = (2*pi)*radius;
        this.perimeter = perimeter;
        return perimeter;

    }

    @Override
    public Double calculateArea() {
        Double area = pi*Math.pow(radius, 2);
        this.area = area;
        return area;
    }
    
}
