class Account {
    String accountHolder;

    void setHolder(String name) {
        accountHolder = name;
    }
}

class Paypal extends Account {
    String email;

    void pay(double amount) {
        System.out.println(accountHolder + " paid Rs." + amount + " using PayPal (" + email + ")");
    }
}

class UPI extends Account {
    String upiId;

    void pay(double amount) {
        System.out.println(accountHolder + " paid Rs." + amount + " using UPI (" + upiId + ")");
    }
}

public class Hira2 {
    public static void main(String[] args) {
        Paypal p = new Paypal();
        p.setHolder("Deep");
        p.email = "deep@paypal.com";
        p.pay(450.75);

        UPI u = new UPI();
        u.setHolder("Deeps");
        u.upiId = "deeps@upi";
        u.pay(230.50);
    }
}
