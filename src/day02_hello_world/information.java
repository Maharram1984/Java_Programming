package day02_hello_world;

import java.util.Scanner;

public class information {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String firstName, lastName, fullName, email, street, state, city, address, contacts;
        int age, zipCode;
        double  height, weight;
        boolean isMarried;
        long  workPhoneNumber ,personalPhoneNumber;


        System.out.println("\nEnter your email");
        email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("\nEnter your street");
        street = scan.nextLine();


        System.out.println("Enter your city ");
        city = scan.nextLine();
        state = "\nEnter your city " + city;
        System.out.println("Enter your state ");
        state = scan.nextLine();
        state += "\nWhat is your state? " + state;
        System.out.println("Enter your address ");
        address = scan.nextLine();
        state += "\nEnter your address " + address;
        System.out.println("Enter your zipCode ");
        zipCode = scan.nextInt();
        state += "\nEnter your zip code " + zipCode;



        System.out.println("Enter your firstname ");
        firstName = scan.nextLine();
        state += "\nWhat is yor firstname? " + firstName;
        System.out.println("Enter your lastname ");
        lastName = scan.nextLine();
        state += "\nWhat is your lastname? " + lastName;
        System.out.println("Enter your fullname ");
        fullName = scan.nextLine();
        state += "\nWhat is your fullname? " + fullName;


        System.out.println("Enter your contacts ");
        contacts = scan.nextLine();
        state += "\nEnter your contacts? " + contacts;
        System.out.println("Enter your age ");
        age = scan.nextInt();
        state += "\nWhat is your age? " + age;

        System.out.println("Enter your height ");
        height = scan.nextDouble();
        state += "\nWhat is your height? " + height;
        System.out.println("Enter your weight ");
        weight = scan.nextDouble();
        state += "\nWhat is your weight? " + weight;
        System.out.println("Are you married? ");
        isMarried = scan.nextBoolean();
        state += "\nAre you married? " + isMarried;
        System.out.println("Enter your phone number ");
        workPhoneNumber = scan.nextLong();
        state += "\nEnter your work phone number " + workPhoneNumber;
        System.out.println("Enter your personalPhoneNumber ");
        personalPhoneNumber = scan.nextLong();
        state += "\nEnter your personalPhoneNumber " + personalPhoneNumber;

        System.out.println("\n\t******************************************\n" + state);





















    }
}
