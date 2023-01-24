import java.util.Scanner;
public class comparision{
public static void main(String args[]){
//Create object of Scanner
Scanner scan = new Scanner(System.in);
System.out.println("Enter a number");
//getting integer value from keyboard
int num = scan.nextInt();
//checking if number is greater than 5
if (num > 5){
System.out.println("the number is greater than 5");
}
else if (num == 5){
System.out.println("the number is equal to 5");
}

else {
System.out.println("the number is less than 5");

}
}
}