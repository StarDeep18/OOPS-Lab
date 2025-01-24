import java.util.Scanner;
class factorial{  
 public static void main(String args[]){  	
  Scanner obj = new Scanner(System.in);
  int fact=1; 
  System.out.println("Enter the number : ");
  int number = obj.nextInt();
  
  for(int i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  