class University {
    void universityDetails() {
        System.out.println("University: Amrita Vishwa Vidyapeetham, Chennai");
    }
}

class Department extends University {
    void departmentDetails() {
        System.out.println("Department: Computer Science");
    }
}

class StudentInfo {
    void studentDetails() {
        System.out.println("Student Name: Deepak");
        System.out.println("Roll No: CH.SC.U4CSE24015");
    }
}

class StudentRecord extends Department {
    StudentInfo info = new StudentInfo();

    void displayRecord() {
        universityDetails();  
        departmentDetails();     
        info.studentDetails();   
        System.out.println("Result: Passed with Distinction");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        StudentRecord student = new StudentRecord();
        student.displayRecord();
    }
}
