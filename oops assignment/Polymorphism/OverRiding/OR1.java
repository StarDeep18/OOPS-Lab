class Shape {
    public double getArea() {
        return 0.0;
    }
    
    public void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getArea() {
        return length * width;
    }
    
    @Override
    public void draw() {
        System.out.println("Drawing a rectangle with length: " + length + " and width: " + width);
    }
}

public class OR1 {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        
        System.out.println("Shape Areas:");
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
        
        System.out.println("\nDrawing Shapes:");
        circle.draw();
        rectangle.draw();
        
        Shape[] shapes = {new Circle(3), new Rectangle(2, 5)};
        
        System.out.println("\nProcessing shapes array:");
        for(Shape shape : shapes) {
            shape.draw();
            System.out.println("Area: " + shape.getArea());
        }
    }
}