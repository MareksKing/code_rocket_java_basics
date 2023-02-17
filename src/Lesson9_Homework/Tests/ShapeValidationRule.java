package Lesson9_Homework.Tests;

import Lesson9_Homework.Shapes.Shape;

public interface ShapeValidationRule {


    boolean validate(Shape shape);

    default boolean validateUserNull(Shape shape) {
        return shape == null;
    }

}
