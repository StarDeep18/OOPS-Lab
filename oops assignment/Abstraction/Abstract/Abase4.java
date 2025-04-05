import java.util.Scanner;

abstract class Movie{
abstract void hero();
abstract void antiHero();
abstract void villain();
}

abstract class character extends Movie{
Scanner scan = new Scanner(System.in);
public void hero(){
System.out.print("Enter a quote for the hero : ");
String hero = scan.nextLine();
System.out.println("Quote of the hero is : "+hero);
}
}

class character2 extends character{
void antiHero(){

System.out.print("Enter a quote for the anti-hero : ");
String antiHero = scan.nextLine();
System.out.println("Quote of the anti-hero is : "+antiHero);
}

void villain(){

System.out.print("Enter a quote for the villain : ");
String villain = scan.nextLine();
System.out.println("Quote of the villain is : "+villain);
}
}

class Abase4 {
public static void main(String[] args) {
character2 c = new character2();
c.hero();
System.out.println("------------------------------------");
c.antiHero();
System.out.println("------------------------------------");
c.villain();
System.out.println("------------------------------------");
}
}