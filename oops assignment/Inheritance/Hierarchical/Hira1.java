class Appliance {
    String location;

    void setLocation(String location) {
        this.location = location;
    }
}

class Fan extends Appliance {
    void switchOn() {
        System.out.println("Fan in " + location + " is ON.");
    }
}

class Light extends Appliance {
    void dim(int level) {
        System.out.println("Light in " + location + " dimmed to " + level + "% brightness.");
    }
}

public class Hira1 {
    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setLocation("Living Room");
        fan.switchOn();

        Light light = new Light();
        light.setLocation("Bedroom");
        light.dim(40);
    }
}
