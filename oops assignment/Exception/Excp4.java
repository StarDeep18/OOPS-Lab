import java.util.Scanner;

public class Excp4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            System.out.println("Choose operation (+, -, *, /): ");
            char op = sc.next().charAt(0);

            double result;

            switch (op) {
                case '+': result = a + b; break;
                case '-': result = a - b; break;
                case '*': result = a * b; break;
                case '/': 
                    if (b == 0) throw new ArithmeticException("Cannot divide by zero.");
                    result = (double) a / b; break;
                default: 
                    throw new Exception("Invalid operator.");
            }

            System.out.println("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
