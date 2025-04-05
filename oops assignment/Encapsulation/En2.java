class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }

    public void giveRaise(double raiseAmount) {
        if (raiseAmount > 0) {
            salary += raiseAmount;
            System.out.println("Salary raised by: " + raiseAmount);
        } else {
            System.out.println("Invalid raise amount.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
    }
}

public class En2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Vaishnav", "Civil Engineer", 6000);
        emp.displayEmployeeInfo();
        emp.giveRaise(2500);
        emp.displayEmployeeInfo();
    }
}
