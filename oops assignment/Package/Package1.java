import java.io.FileWriter;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Package1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter website (e.g., www.example.com):");
        String website = scanner.nextLine();

        try {
            InetAddress inet = InetAddress.getByName(website);
            String ip = inet.getHostAddress();

            LocalDateTime timestamp = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            String log = "Website: " + website + "\nIP Address: " + ip + 
                         "\nTimestamp: " + timestamp.format(formatter) + "\n\n";

            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(log);
            writer.close();

            System.out.println("Website info logged successfully!");
        } catch (UnknownHostException e) {
            System.out.println("Website not found!");
        } catch (IOException e) {
            System.out.println("Error writing to file.");
        }
    }
}
