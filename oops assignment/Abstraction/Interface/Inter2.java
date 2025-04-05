interface PaymentMethod {
    boolean processPayment(double amount);
}

class CreditCard implements PaymentMethod {
    private String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing credit card payment of Rs : " + amount);
        return true;
    }
}

class GooglePay implements PaymentMethod {
    private String email;

    public GooglePay(String email) {
        this.email = email;
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing GooglePay payment of Rs : " + amount);
        return true;
    }
}

class BankTransfer implements PaymentMethod {
    private String bankAccount;

    public BankTransfer(String bankAccount) {
        this.bankAccount = bankAccount;
    }

    public boolean processPayment(double amount) {
        System.out.println("Processing bank transfer of Rs : " + amount);
        return true;
    }
}

public class Inter2 {
    public static void main(String[] args) {
        PaymentMethod paymentMethod1 = new CreditCard("1234-5678-9876-5432");
        PaymentMethod paymentMethod2 = new GooglePay("upi@gmail.com");
        PaymentMethod paymentMethod3 = new BankTransfer("123456789");
	System.out.println();
        paymentMethod1.processPayment(1025.245);
        paymentMethod2.processPayment(986.53);
        paymentMethod3.processPayment(84543.25);
    }
}