package day19_StringMethods;

import java.util.Locale;
import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        /*create a class UserAndPass
        ask the user to enter a username and password. Check if they are valid
        based on the following requirements:
        - The password cannot be less than 5 characters
        If it is less print: "Password cannot be less than 5 characters"
        If it is more than or equal to 5 print: "Valid password"
                - Also, the password should not contain the username
        If the password has the username in it print: "Invalid password,
        username should not be in it" and in that case change the password to have
        the value: "password"
        Print the information in the end */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the username");
        String userName = scan.nextLine();
        // userName = userName.toUpperCase();
        System.out.println("Please enter your password");
        String passWord = scan.nextLine();

        if (passWord.length() < 5 || passWord.contains(userName)) {
            if (passWord.length() < 5) {
                System.out.println("Password cannot be less than 5 characters");
            }
            if (passWord.contains(userName)) {
                System.out.println("Invalid password,username should not be in it");
            }
        } else {
            System.out.println("Valid number");
        }


    }
}