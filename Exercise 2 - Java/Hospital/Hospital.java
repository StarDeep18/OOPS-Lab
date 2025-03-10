class Person{
    String name;
    int age;
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    void display(){
        System.out.println("Name is : "+name);
        System.out.println("Age is : "+age);
    }
}

class Doctor extends Person{
    String special;
    
    Doctor(String name,int age,String special){
        super(name,age);
        this.special = special;
    }
    
    @Override
    void display(){
        super.display();
        System.out.println("Specialazation is : "+special);
    }
}
        
public class Hospital {

    public static void main(String[] args) {
        Doctor doc = new Doctor("Deepak",18,"Neurologists");
        doc.display();
    }
}