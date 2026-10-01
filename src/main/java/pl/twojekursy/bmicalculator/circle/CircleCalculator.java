package pl.twojekursy.bmicalculator.circle;

import org.springframework.stereotype.Component;

@Component
public class CircleCalculator {
    public CircleCalculation calculate(Double r) {

        double field = Math.PI * r * r;
        double perimeter = 2*Math.PI*r;

        return new CircleCalculation(field, perimeter);
    };
}
