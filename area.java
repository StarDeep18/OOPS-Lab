import java.util.Scanner;
public class area  
 {  
   public static void main (String args[])  
    {   
	Scanner obj = new Scanner(System.in);
	Scanner obj2 = new Scanner(System.in);
	System.out.println("Enter the base : ");
	int b = obj.nextInt();
	System.out.println("Enter the height : ");
	int h = obj2.nextInt();       
        int area = ( b*h) / 2 ;  
        System.out.println("Area of Triangle is: "+area);  
    }}  