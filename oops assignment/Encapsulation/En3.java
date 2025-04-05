import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds or invalid amount.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    public void checkOut() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book '" + title + "' has been checked out.");
        } else {
            System.out.println("Sorry, the book '" + title + "' is not available.");
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book '" + title + "' has been returned.");
        } else {
            System.out.println("This book was not checked out.");
        }
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }
}

class Student {
    private String name;
    private double[] grades;
    private int gradeCount;

    public Student(String name, int maxGrades) {
        this.name = name;
        grades = new double[maxGrades];
        gradeCount = 0;
    }

    public void addGrade(double grade) {
        if (gradeCount < grades.length) {
            grades[gradeCount++] = grade;
        } else {
            System.out.println("Cannot add more grades.");
        }
    }

    public double calculateAverage() {
        double sum = 0;
        for (int i = 0; i < gradeCount; i++) {
            sum += grades[i];
        }
        return (gradeCount > 0) ? sum / gradeCount : 0;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Average Grade: " + calculateAverage());
    }
}

class Employee {
    private String name;
    private String position;
    private double salary;

    public Employee(String name, String position, double salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            salary += amount;
            System.out.println("Salary raised by: $" + amount);
        } else {
            System.out.println("Invalid raise amount.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee: " + name);
        System.out.println("Position: " + position);
        System.out.println("Salary: $" + salary);
    }
}

public class En3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("Ben Dover", 20000);
        Book book = new Book("Heaven and Hell", "Deepak");
        Student student = new Student("Vaishnav", 5);
        Employee employee = new Employee("Sanjay", "Detective", 50000);

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Bank Account");
            System.out.println("2. Library System");
            System.out.println("3. Student Grades");
            System.out.println("4. Employee Management");
            System.out.println("5. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nBank Account Operations:");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdraw");
                    System.out.println("3. Display Info");
                    System.out.print("Choice: ");
                    int bankChoice = sc.nextInt();
                    switch (bankChoice) {
                        case 1:
                            System.out.print("Enter deposit amount: ");
                            double deposit = sc.nextDouble();
                            account.deposit(deposit);
                            break;
                        case 2:
                            System.out.print("Enter withdrawal amount: ");
                            double withdrawal = sc.nextDouble();
                            account.withdraw(withdrawal);
                            break;
                        case 3:
                            account.displayAccountInfo();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 2:
                    System.out.println("\nLibrary System Operations:");
                    System.out.println("1. Check out Book");
                    System.out.println("2. Return Book");
                    System.out.println("3. Display Book Info");
                    System.out.print("Choice: ");
                    int bookChoice = sc.nextInt();
                    switch (bookChoice) {
                        case 1:
                            book.checkOut();
                            break;
                        case 2:
                            book.returnBook();
                            break;
                        case 3:
                            book.displayBookInfo();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 3:
                    System.out.println("\nStudent Grades Operations:");
                    System.out.println("1. Add Grade");
                    System.out.println("2. Display Student Info");
                    System.out.print("Choice: ");
                    int studentChoice = sc.nextInt();
                    switch (studentChoice) {
                        case 1:
                            System.out.print("Enter grade: ");
                            double grade = sc.nextDouble();
                            student.addGrade(grade);
                            break;
                        case 2:
                            student.displayStudentInfo();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 4:
                    System.out.println("\nEmployee Management Operations:");
                    System.out.println("1. Give Raise");
                    System.out.println("2. Display Employee Info");
                    System.out.print("Choice: ");
                    int empChoice = sc.nextInt();
                    switch (empChoice) {
                        case 1:
                            System.out.print("Enter raise amount: ");
                            double raise = sc.nextDouble();
                            employee.giveRaise(raise);
                            break;
                        case 2:
                            employee.displayEmployeeInfo();
                            break;
                        default:
                            System.out.println("Invalid choice.");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}