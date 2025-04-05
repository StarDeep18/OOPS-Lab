class Vehicle {
    int speed;
    int fuel;

    Vehicle(int speed, int fuel) {
        this.speed = speed;
        this.fuel = fuel;
    }

    void showStatus() {
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Fuel Level: " + fuel + "%");
    }

    void accelerate() {
        speed += 10;
        fuel -= 5;
        System.out.println("Vehicle accelerated.");
    }
}

class Car extends Vehicle {
    boolean airConditioningOn;

    Car(int speed, int fuel) {
        super(speed, fuel);
        this.airConditioningOn = false;
    }

    void toggleAC() {
        airConditioningOn = !airConditioningOn;
        System.out.println("AC turned " + (airConditioningOn ? "ON" : "OFF"));
        if (airConditioningOn) fuel -= 2;
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("Air Conditioning: " + (airConditioningOn ? "ON" : "OFF"));
    }
}

class SmartCar extends Car {
    String gpsLocation;

    SmartCar(int speed, int fuel, String gpsLocation) {
        super(speed, fuel);
        this.gpsLocation = gpsLocation;
    }

    void updateGPS(String newLocation) {
        gpsLocation = newLocation;
        System.out.println("GPS updated to: " + gpsLocation);
    }

    void showStatus() {
        super.showStatus();
        System.out.println("GPS Location: " + gpsLocation);
    }
}

public class Multi1 {
    public static void main(String[] args) {
        SmartCar myCar = new SmartCar(60, 80, "Downtown");

        System.out.println("--- Initial Status ---");
        myCar.showStatus();

        System.out.println("\n--- After Actions ---");
        myCar.accelerate();
        myCar.toggleAC();
        myCar.updateGPS("Uptown");

        System.out.println("\n--- Updated Status ---");
        myCar.showStatus();
    }
}
