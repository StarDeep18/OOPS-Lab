import java.io.*;
import java.util.*;

public class File4 {
    static final String FILE_NAME = "sample.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product name: ");
        String name = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        try (FileWriter fw = new FileWriter(FILE_NAME, true)) {
            fw.write(name + "," + price + "," + quantity + "\n");
            System.out.println("Product saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
