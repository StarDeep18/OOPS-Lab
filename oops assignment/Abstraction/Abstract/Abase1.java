abstract class Abs1 {
    abstract void Info();
}

class Management extends Abs1 {
    void Info() {
        String name = "Deepak";
        String rollno = "CH.SC.U4CSE24015";
        int age = 18;
        String gender = "Male";

        System.out.println("The name of the student is: " + name);
        System.out.println("The roll number of the student is: " + rollno);
        System.out.println("The age of the student is: " + age);
        System.out.println("The gender of the student is: " + gender);
    }
}

public class Abase1 {
    public static void main(String args[]) {
        Abs1 s = new Management();
        s.Info();
    }
}
