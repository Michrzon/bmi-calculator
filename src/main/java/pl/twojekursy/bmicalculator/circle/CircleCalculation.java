package pl.twojekursy.bmicalculator.circle;

import java.util.Objects;

public final class CircleCalculation {
    private final Double field;
    private final Double perimeter;

    public CircleCalculation(Double field, Double perimeter) {
        this.field = field;
        this.perimeter = perimeter;
    }

    public Double getField() {
        return field;
    }

    public Double getPerimeter() {
        return perimeter;
    }
}
