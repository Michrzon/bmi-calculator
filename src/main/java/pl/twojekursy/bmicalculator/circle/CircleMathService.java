package pl.twojekursy.bmicalculator.circle;

import org.springframework.stereotype.Service;

@Service
public class CircleMathService {

    private CircleCalculator circleCalculator;

    public CircleMathService(CircleCalculator circleCalculator) {
        this.circleCalculator = circleCalculator;
    }

    public CircleResponse calculate(Double r) {

        CircleCalculation calculation = circleCalculator.calculate(r);

        return CircleResponse.from(calculation);
    };
}
