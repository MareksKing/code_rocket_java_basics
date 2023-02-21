package Lesson9_Homework.Tests;

import Lesson9_Homework.Shapes.Shape;

public class TriangleAreaCalculationRule implements ShapeValidationRule {

  @Override
  public boolean validate(Shape shape) {
    if (shape.calculateArea() == 6.0) {
      return true;
    }
    return false;
  }
}
