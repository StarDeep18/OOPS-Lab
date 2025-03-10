class Vehicle{
     void display(){
        System.out.println("Vehicle goes Vroom...");
    }
     void engine(){ // it can be modified
    }
}

class bike extends Vehicle{
    @Override
    void display(){
        System.out.println("Bike goes Vroom...");
    }
    @Override
    void engine(){ // im modifying it 
        System.out.println("mehhhhh");
    }
}

class car extends Vehicle{
    @Override
    void display(){
        System.out.println("Car go meow...");
    }
}
public class Poly {

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        Vehicle b = new bike();
        Vehicle c = new car();
        b.display();
        c.display();
        v.display();
        b.engine();
    }
}