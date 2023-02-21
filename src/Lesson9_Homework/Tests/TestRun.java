package Lesson9_Homework.Tests;

import Lesson9_Homework.Shapes.Shape;
import Lesson9_Homework.Shapes.Triangle;
import java.util.HashSet;
import java.util.Set;

public class TestRun {

  public static void main(String[] args) {
    Set<ShapeValidationRule> rules = new HashSet<>();
    rules.add(new ShapeSidesNotNegative());
    rules.add(new TriangleAreaCalculationRule());
    rules.add(new TrianglePerimeterCalculationRule());

    Shape triangle = new Triangle(3.0, 4.0);
    ShapeValidationService shapeValidationService = new ShapeValidationService(
      rules
    );
    boolean result = shapeValidationService.validate(triangle);

    System.out.println(result);
  }
}
