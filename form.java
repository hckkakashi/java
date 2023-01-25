import java.util.Scanner;
public class  form {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("What is your Name..?");
String name=sc.nextLine();
System.out.println("Welcome to pcps Mr."+name);
System.out.println("Are you studiying in pcps Mr"+name);
Boolean ans=sc.nextBoolean();
if(ans==true){
System.out.println("which level");
int level=sc.nextInt();
if (level==4){
System.out.println("Hope you will work hard");}
else if (level==5){
System.out.println("keep up the hard work");}
else if (level==6){
System.out.println("Congralution your hard work paid off");}
else{
System.out.println("invalid level");
}}
else if (ans==false){
    System.out.println("exit");
}
else{
    System.out.println("invalid input");

}
}}

