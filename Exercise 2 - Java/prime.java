import java.util.Scanner;
public class prime{

  public static void main(String[] args) {

    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = obj.nextInt();

    int i = 2;
    boolean flag = false;
    
    if (num == 0 || num == 1) {
        flag = true;
    }
    
    while (i <= num / 2) {

      if (num % i == 0) {
        flag = true;
        break;
      }

      ++i;
    }

    if (!flag)
      System.out.println(num + " is a prime number.");
    else
      System.out.println(num + " is not a prime number.");
  }
}