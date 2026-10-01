package pl.twojekursy.bmicalculator.bmi;

import org.springframework.stereotype.Component;
import pl.twojekursy.bmicalculator.BmiNote;

@Component
public class BmiCalculator {
    public BmiCalculation calculate(Integer weight, Integer heightCm){
        double heightInMeters = heightCm / 100.0;
        double bmi = weight / heightInMeters / heightInMeters;

        BmiNote bmiNote;
        if(bmi>25){
            bmiNote = BmiNote.NADWAGA;
        } else if (bmi<25 && bmi>=20) {
            bmiNote = BmiNote.Ok;
        } else {
            bmiNote = BmiNote.NIEDOWAGA;
        }

        System.out.println("BMI: " + bmi);

        return new BmiCalculation(bmiNote, bmi);
    }
}
