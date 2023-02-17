package Lesson9_Homework.Tests;


import Lesson9_Homework.Shapes.Shape;

import java.util.Set;

public class ShapeValidationService {
    private Set<ShapeValidationRule> shapeValidationRules;

    public ShapeValidationService(Set<ShapeValidationRule> shapeValidationRules) {
        this.shapeValidationRules = shapeValidationRules;
    }

    public boolean validate(Shape shape) {
        if (shape == null) {
            return false;
        }
        for (ShapeValidationRule rule : shapeValidationRules) {
            if (!rule.validate(shape)) {
                return false;
            }
        }
        return true;
    }
}
