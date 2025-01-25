import java.util.Scanner;
class armstrong {
  public static void main(String[] args) {
    Scanner obj = new Scanner(System.in);
    System.out.println("Enter the number :");
    int num = obj.nextInt();

    int temp = num;
    int sum=0;

    while(temp>0) {
    int dig=temp%10;
    sum+=Math.pow(dig, 3);
    temp=temp/10;
    }

    if(num == sum) {
    System.out.println("The number "+num+" is a Armstrong number!");
    }
    else{
    System.out.println("The number "+num+" isn't a Armstrong number!");
    }
  }
}