import java.io.*;
import java.util.*;

public class File2 {
    static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Person");
            System.out.println("2. View All Person");
            System.out.println("3. Search Person by Name");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addPerson(sc);
                case 2 -> viewPerson();
                case 3 -> searchPerson(sc);
                case 4 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 4);
    }

    static void addPerson(Scanner sc) {
        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();
            fw.write(name + "," + age + "\n");
            System.out.println("Person added.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void viewPerson() {
        try (Scanner fileScanner = new Scanner(new File(FILE_NAME))) {
            System.out.println("All Student Records:");
            while (fileScanner.hasNextLine()) {
                String[] data = fileScanner.nextLine().split(",");
                System.out.println("Name: " + data[0] + ", Age: " + data[1]);
            }
        } catch (FileNotFoundException e) {
            System.out.println("No person records found.");
        }
    }

    static void searchPerson(Scanner sc) {
        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();
        boolean found = false;

        try (Scanner fileScanner = new Scanner(new File(FILE_NAME))) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");
                if (data[0].equalsIgnoreCase(searchName)) {
                    System.out.println("Found: Name: " + data[0] + ", Age: " + data[1]);
                    found = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        if (!found) {
            System.out.println("Person not found.");
        }
    }
}
