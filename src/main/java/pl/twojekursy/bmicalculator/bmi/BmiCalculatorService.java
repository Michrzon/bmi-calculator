package pl.twojekursy.bmicalculator.bmi;

import org.springframework.stereotype.Service;
import pl.twojekursy.bmicalculator.BmiNote;

@Service
public class BmiCalculatorService {

    private final BmiCalculator bmiCalculator;

    public BmiCalculatorService(BmiCalculator bmiCalculator) {
        this.bmiCalculator = bmiCalculator;
    }

    public BmiCalculatorResponse calculate(Integer weight, Integer heightCm){

        BmiCalculation calculation = bmiCalculator.calculate(weight, heightCm);

        return BmiCalculatorResponse.from(calculation);
    }
}
