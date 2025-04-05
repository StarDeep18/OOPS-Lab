import pkg.BMICalculator;
import java.util.Scanner;

public class Userpk2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        BMICalculator calculator = new BMICalculator(height, weight);
        double bmi = calculator.calculateBMI();
        String category = calculator.getCategory();

        System.out.printf("Your BMI is: %.2f\n", bmi);
        System.out.println("You are classified as: " + category);
    }
}
