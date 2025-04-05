import java.util.ArrayList;

class Polynomial {
    private int[] coefficients;

    public Polynomial(int[] coefficients) {
        this.coefficients = coefficients;
    }

    public void displayPolynomial() {
        for (int i = coefficients.length - 1; i >= 0; i--) {
            if (coefficients[i] != 0) {
                if (i != coefficients.length - 1 && coefficients[i] > 0) {
                    System.out.print("+");
                }
                System.out.print(coefficients[i]);
                if (i > 0) {
                    System.out.print("x^" + i);
                }
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.length; i++) {
            result += coefficients[i] * Math.pow(x, coefficients.length - i - 1);
        }
        return result;
    }

    public ArrayList<Double> findRoots(double start, double end, double tolerance) {
        ArrayList<Double> roots = new ArrayList<>();
        double mid;

        while ((end - start) > tolerance) {
            mid = (start + end) / 2;
            double midValue = evaluate(mid);

            if (Math.abs(midValue) < tolerance) {
                roots.add(mid);
                break;
            }

            if (evaluate(start) * midValue < 0) {
                end = mid;
            } else {
                start = mid;
            }
        }
        return roots;
    }
}

public class OL4 {
    public static void main(String[] args) {
        int[] poly = {-4, 0, 1};
        Polynomial p = new Polynomial(poly);
        System.out.print("Polynomial: ");
        p.displayPolynomial();

        ArrayList<Double> roots = p.findRoots(0, 3, 0.01);
        System.out.println("Roots found in the range [0, 3]: " + roots);
    }
}