package pl.twojekursy.bmicalculator.bmi;

import pl.twojekursy.bmicalculator.BmiNote;

public class BmiCalculatorResponse {
    private final double bmi;
    private final BmiNote bmiNote;

    public BmiCalculatorResponse(BmiNote bmiNote, double bmi) {
        this.bmiNote = bmiNote;
        this.bmi = bmi;
    }

    public double getBmi() {
        return bmi;
    }

    public BmiNote getBmiNote() {
        return bmiNote;
    }

    public static BmiCalculatorResponse from(BmiCalculation bmiCalculation){
        return new BmiCalculatorResponse(bmiCalculation.getBmiNote(), bmiCalculation.getBmi());
    }
}
