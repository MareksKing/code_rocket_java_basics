package Lesson9_Homework.Tests;

import Lesson9_Homework.Shapes.Shape;

public class TrianglePerimeterCalculationRule implements ShapeValidationRule {

  @Override
  public boolean validate(Shape shape) {
    if (shape.calculatePerimeter() == 12.0) {
      return true;
    }
    return false;
  }
}
