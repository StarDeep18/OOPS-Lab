class Order {
    String customerName;
    String item;

    Order(String name, String item) {
        this.customerName = name;
        this.item = item;
    }

    void showOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Item: " + item);
    }
}

class OnlineOrder extends Order {
    String deliveryAddress;

    OnlineOrder(String name, String item, String address) {
        super(name, item);
        this.deliveryAddress = address;
    }

    @Override
    void showOrder() {
        super.showOrder();
        System.out.println("Delivery Address: " + deliveryAddress);
    }
}

public class OR4 {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("Deepak", "Wireless Keyboard", "Chennai, 600001");
        order.showOrder();
    }
}
