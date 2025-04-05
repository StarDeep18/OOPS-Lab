import java.io.FileWriter;
import java.io.IOException;

public class File1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt", true);
            writer.write("\nThis line was added later.");
            writer.close();
            System.out.println("Appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
