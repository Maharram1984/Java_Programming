package day14_NastedIfstatement;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your PIN code");
        int actualPin = input.nextInt();
        System.out.println("Please enter the last of your SSN ");
        int actualSSN = input.nextInt();

        int expectedPin = 0001;
        int expectedSSN = 0000;



        if(actualPin == expectedPin && actualSSN== expectedSSN){
            System.out.println("Authentication successful!");
        }else {
            System.out.println("Authentication failed!");

            if (actualPin != expectedPin) {
                System.out.println("Incorrect PIN CODE!");
            }
            if (actualSSN != expectedSSN) {
                System.out.println("Incorrect SSN!");
            }

        }






























    }
}
