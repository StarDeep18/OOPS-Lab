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

    public Polynomial add(Polynomial other) {
        int maxLength = Math.max(this.coefficients.length, other.coefficients.length);
        int[] result = new int[maxLength];

        for (int i = 0; i < maxLength; i++) {
            int coef1 = (i < this.coefficients.length) ? this.coefficients[i] : 0;
            int coef2 = (i < other.coefficients.length) ? other.coefficients[i] : 0;
            result[i] = coef1 + coef2;
        }

        return new Polynomial(result);
    }

    public Polynomial multiply(Polynomial other) {
        int newDegree = this.coefficients.length + other.coefficients.length - 2;
        int[] result = new int[newDegree + 1];

        for (int i = 0; i < this.coefficients.length; i++) {
            for (int j = 0; j < other.coefficients.length; j++) {
                result[i + j] += this.coefficients[i] * other.coefficients[j];
            }
        }

        return new Polynomial(result);
    }
}

public class OL3 {
    public static void main(String[] args) {
        int[] poly1 = {1, 2, 3};
        Polynomial p1 = new Polynomial(poly1);
        System.out.print("Polynomial 1: ");
        p1.displayPolynomial();

        int[] poly2 = {5, 0, 3, 4};
        Polynomial p2 = new Polynomial(poly2);
        System.out.print("Polynomial 2: ");
        p2.displayPolynomial();

        Polynomial sum = p1.add(p2);
        System.out.print("Sum of Polynomials: ");
        sum.displayPolynomial();

        Polynomial product = p1.multiply(p2);
        System.out.print("Product of Polynomials: ");
        product.displayPolynomial();
    }
}