class Shape {
    void area() {
        System.out.println("Area calculation of shape...");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void area() {
        System.out.println("Area of Circle: " + (Math.PI * radius * radius));
    }
}

class Square extends Shape {
    int side;

    Square(int side) {
        this.side = side;
    }

    @Override
    void area() {
        System.out.println("Area of Square: " + (side * side));
    }
}

public class OR3 {
    public static void main(String[] args) {
        Shape s1 = new Circle(5.0);
        Shape s2 = new Square(4);

        s1.area();
        s2.area();
    }
}
