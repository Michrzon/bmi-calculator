package pl.twojekursy.bmicalculator.bmi;

public class BmiCalculatorRequest {
    private final Integer weight;
    private final Integer height;

    public BmiCalculatorRequest(Integer weight, Integer height) {
        this.weight = weight;
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public Integer getHeight() {
        return height;
    }
}
