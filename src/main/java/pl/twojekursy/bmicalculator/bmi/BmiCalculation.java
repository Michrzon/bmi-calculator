package pl.twojekursy.bmicalculator.bmi;

import pl.twojekursy.bmicalculator.BmiNote;

public class BmiCalculation {

    private final double bmi;
    private final BmiNote bmiNote;

    public BmiCalculation(BmiNote bmiNote, double bmi) {
        this.bmiNote = bmiNote;
        this.bmi = bmi;
    }

    public double getBmi() {
        return bmi;
    }

    public BmiNote getBmiNote() {
        return bmiNote;
    }

}
