class BankAccount {
    protected String accountNumber;
    protected double balance;
    
    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    public void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
    
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;
    
    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("Interest added: $" + interest);
    }
    
    public void displayBalance() {
        System.out.println("Savings Account Balance: $" + balance);
        System.out.println("Interest Rate: " + (interestRate * 100) + "%");
    }
}

class CheckingAccount extends BankAccount {
    private double overdraftLimit;
    
    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
    
    public void withdraw(double amount) {
        if(amount <= (balance + overdraftLimit)) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Exceeds overdraft limit!");
        }
    }
    
    public void displayBalance() {
        System.out.println("Checking Account Balance: $" + balance);
        System.out.println("Overdraft Limit: $" + overdraftLimit);
    }
}

public class OR2 {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA001", 1000.0, 0.05);
        BankAccount checking = new CheckingAccount("CA001", 2000.0, 500.0);
        
        System.out.println("Initial Account Status:");
        System.out.println("----------------------");
        savings.displayBalance();
        System.out.println();
        checking.displayBalance();
        
        System.out.println("\nPerforming Transactions:");
        System.out.println("----------------------");
        savings.deposit(500.0);
        checking.withdraw(2300.0);
        
        ((SavingsAccount)savings).addInterest();
        
        System.out.println("\nFinal Account Status:");
        System.out.println("--------------------");
        savings.displayBalance();
        System.out.println();
        checking.displayBalance();
    }
}