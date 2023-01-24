import java.util.Scanner;
public class calc{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter your name:");
String name = sc.nextLine();
System.out.println("welcome"+name);
System.out.print("Enter a first number:");
int num1 = sc.nextInt();
System.out.print("Enter a second number:");
int num2 = sc.nextInt();
int sum= num1 + num2 ;
System.out.print("sum="+sum);
}
}
