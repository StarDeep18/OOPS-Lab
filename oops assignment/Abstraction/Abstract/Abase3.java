import java.util.Scanner;

abstract class B {
    static abstract class C {
        abstract void myAbstractMethod();
    }
}

class D extends B {
    class E extends C {
        Scanner scan = new Scanner(System.in);

        void myAbstractMethod() {
            System.out.print("Enter your name: ");
            String name = scan.nextLine();

            System.out.print("Enter your roll number: ");
            String rollno = scan.nextLine();

            System.out.print("Enter your age: ");
            int age = scan.nextInt();

            System.out.println("\nYour name is: " + name);
            System.out.println("Your roll number is: " + rollno);
            System.out.println("Your age is: " + age);
        }
    }
}

public class Abase3 {
    public static void main(String[] args) {
        D outer = new D();
        D.E inner = outer.new E();
        inner.myAbstractMethod();
    }
}
