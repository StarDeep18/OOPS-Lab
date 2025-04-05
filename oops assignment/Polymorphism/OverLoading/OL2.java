class Employee {
        public double calculateSalary(int hoursWorked, double hourlyRate) {
        return hoursWorked * hourlyRate; 
    }

    public double calculateSalary(double monthlySalary) {
        return monthlySalary; 
    }

    public double calculateSalary(double baseSalary, double bonus) {
        return baseSalary + bonus;
    }
}

public class OL2 {
    public static void main(String[] args) {
        Employee employee = new Employee();

        System.out.println("Hourly Employee Salary: " + employee.calculateSalary(40, 15.5)); 
        System.out.println("Salaried Employee Salary: " + employee.calculateSalary(3000.0));   
        System.out.println("Employee with Bonus Salary: " + employee.calculateSalary(2500.0, 500.0)); 
    }
}