import java.util.Scanner;
public class simpleinterest{
public static void amount(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter Principal:");
int prin=sc.nextInt();

System.out.println("Enter Rate:");
int rate=sc.nextInt();

System.out.println("Enter Time:");
int time=sc.nextInt();

double si=(prin*rate*time)/100;
double amou=prin*(1+(time*rate)/100);
 System.out.println("The Simple Intrest:"+si);
System.out.println("Total Amount:"+amou);
}
public static void main (String args[]){
amount();
}}