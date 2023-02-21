package Lesson9_Homework.Tests;

import Lesson9_Homework.Shapes.Shape;

public class ShapeSidesNotNegative implements ShapeValidationRule {

  @Override
  public boolean validate(Shape shape) {
    if (shape.calculatePerimeter() > 0) {
      return true;
    } else {
      return false;
    }
  }
}
