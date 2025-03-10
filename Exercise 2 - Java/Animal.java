class dog extends Animal{
    @Override
    void make_sound(){
        System.out.println("Woof Woof...");
}
}

class cat extends Animal{
    @Override
    void make_sound(){
        System.out.println("Meow Meow...");
    }
}

public class Animal {

    void make_sound(){
        System.out.println("Sound...");
    }
    
    public static void main(String[] args) {
        Animal woof = new dog();
        Animal meow = new cat();
        woof.make_sound();
        meow.make_sound();
    }
}