package Lesson9_Homework.Shapes;

public class Circle extends Shape{

    private Double radius;
    private final Double pi = 3.14;

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
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", pi=" + pi +
                '}';
    }

    @Override
    public Double calculatePerimeter() {
        return (2*pi)*radius;
    }

    @Override
    public Double calculateArea() {
        return pi*Math.pow(radius, 2);
    }
    
}
