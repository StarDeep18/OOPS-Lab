class Bank {
    void bankDetails() {
        System.out.println("Bank: City Union Bank");
    }
}

class Branch extends Bank {
    void branchDetails() {
        System.out.println("Branch: Downtown City Branch");
    }
}

class Customer {
    void customerDetails() {
        System.out.println("Customer Name: Poojitha");
        System.out.println("Account Number: 1145780021");
    }
}

class Transaction extends Branch {
    Customer customer = new Customer();  

    void transactionDetails() {
        bankDetails();        
        branchDetails();     
        customer.customerDetails(); 
        System.out.println("Transaction: Deposited Rs.15,000");
    }
}

public class Hybrid2 {
    public static void main(String[] args) {
        Transaction txn = new Transaction();
        txn.transactionDetails();
    }
}
