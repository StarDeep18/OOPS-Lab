class Shape {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    public double calculateArea(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }
}

public class OL1 {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println("Area of Circle: " + shape.calculateArea(7.0));          
        System.out.println("Area of Rectangle: " + shape.calculateArea(5.0, 8.0));  
        System.out.println("Area of Triangle: " + shape.calculateArea(6.0, 4.0, true));
    }
}