import java.util.Scanner;

public class Excp2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String correctUsername = "admin";
        String correctPassword = "1234";

        try {
            System.out.print("Enter username: ");
            String username = sc.nextLine();

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (!username.equals(correctUsername) || !password.equals(correctPassword)) {
                throw new Exception("Invalid username or password.");
            }

            System.out.println("Login Successful!");

        } catch (Exception e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
}
