package day10_Scanner;
import java.util.Scanner;
public class UsingNext {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("What is today ");
//        String day = input.nextLine();
//        System.out.println("Enter your first name: ");
//        String firstName = input.next();
//        System.out.println("Enter your last name: ");
//        String lastName = input.next();
//        input.nextLine();
//        System.out.println("What is your address");
//        String address = input.nextLine();
//        System.out.println("Today " +day);
//        System.out.println("First name: "+firstName);
//        System.out.println("Last name: "+lastName);
//        System.out.println("address "+address);
//

        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int number = input1.nextInt();

        boolean by2 = number % 2 == 0;
        boolean by3 = number % 3 == 0;
        boolean by5 = number % 5 == 0;

        System.out.println("100 is divisible by 2: " +by2);
        System.out.println("100 is divisible by 3: " +by3);
        System.out.println("100 is divisible by 5: " +by5);
     //   System.out.println("100 is divisible: "+by2+by3+by5%(2==0) );// todo











    }









}
