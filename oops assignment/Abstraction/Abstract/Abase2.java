abstract class Subject {
    Subject() { 
      System.out.println("Subjects : "); 
    }
  
      abstract void syllabus();
  
      void Learn(){
          System.out.println("Learning!!!");
    }
}

class College extends Subject {
  void syllabus(){
    System.out.println("Java , HTML , Python");
  }
}

class Abase2 {
    public static void main(String[] args) {
        Subject s = new College();
      
          s.syllabus();
          s.Learn();
    }
}