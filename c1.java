import java.util.Scanner;
public class c1 {
    public static void main (String args[]){
        Scanner k=new Scanner(System.in);
        System.out.println("What is the day?");
        int day=k.nextInt();
        switch (day){
            case 1:
            System.out.println("sunday");
            break;
            case 2:
            System.out.println("monday");
            
            case 3:
            System.out.println("tuesday");
            break;
            case 4:
            System.out.println("wednesday");
            break;
            case 5:
            System.out.println("thrusday");
            break;
            case 6:
            System.out.println("friday");
            break;
            case 7:
            System.out.println("saturday");
            break;
        }

    }
    
}
