package pl.twojekursy.bmicalculator.circle;

import pl.twojekursy.bmicalculator.bmi.BmiCalculation;
import pl.twojekursy.bmicalculator.bmi.BmiCalculatorResponse;

public record CircleResponse(Double field, Double perimeter) {

    public static CircleResponse from(CircleCalculation circleCalculation){
        return new CircleResponse(circleCalculation.getField(), circleCalculation.getPerimeter());
    }
}
