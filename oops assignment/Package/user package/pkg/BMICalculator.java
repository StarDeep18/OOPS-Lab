package pkg;

public class BMICalculator {
    private double height; 
    private double weight; 
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double calculateBMI() {
        return (weight / (height * height));
    }

    public String getCategory() {
        double bmi = calculateBMI();
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 24.9) {
            return "Normal weight";
        } else if (bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}
