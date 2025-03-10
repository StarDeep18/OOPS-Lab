import java.util.Scanner;
class palindrome {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = obj.nextInt();

    int temp = num;
    int rev=0;

    while(num>0) {
    int dig=num%10;
    rev=rev*10+dig;
    num=num/10;
    }

    if(temp == rev) {
    System.out.println("The number "+rev+" is a palindrome!");
    }
    else{
    System.out.println("The number "+rev+" isn't a palindrome!");
    }
  }
}