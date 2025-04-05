abstract class Shape {
    public abstract double area();
}

class Person {
    private String name;
    private int age;     

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
        }
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

class Employee extends Person {
    private String position;

    public Employee(String name, int age, String position) {
        super(name, age); 
        this.position = position;
    }

    public void introduce() {
        System.out.println("Hi, I am " + super.getAge() + " years old. I work as a " + position + ".");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class En4 {
    public static void main(String[] args) {
        Person person = new Person("Raj", 29);
        Employee employee = new Employee("Sanjay", 21, "Civil Engineer");

        person.introduce();
        employee.introduce();
        System.out.println("Employee's age is: " + employee.getAge());
        employee.setAge(26);
        System.out.println("Updated Employee's age: " + employee.getAge());

        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(10, 4);
        System.out.println("Area of circle: " + circle.area());
        System.out.println("Area of rectangle: " + rectangle.area());

        Calculator calculator = new Calculator();
        System.out.println("Sum of 10 and 20: " + calculator.add(10, 20));
        System.out.println("Sum of 10, 20, and 30: " + calculator.add(10, 20, 30));
    }
}