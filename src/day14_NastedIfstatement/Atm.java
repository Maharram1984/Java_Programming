package day14_NastedIfstatement;

import java.util.Enumeration;
import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("****Welcome to ATM****\nPlease enter your card and then type your pin code");
        int pinCod = scan.nextInt();

        int expectedPin = 1000;
        double balance = 10000;


        if (pinCod == expectedPin) {
            System.out.println("Logged in");
            System.out.println("Select a number");
            System.out.println("\t1)Check balance");
            System.out.println("\t2)Withdraw");
            System.out.println("\t3)Deposit");
            int option = scan.nextInt();

            if (option == 1) {
                System.out.println("Your balance is : $ " +balance);
            } else if (option == 2) {
                System.out.println("How much do you want to withdraw?");
                double money = scan.nextDouble();
                System.out.println("Withdrawing " + money);
                System.out.println("Your  balance is: $" + (balance - money));

            } else if (option == 3) {
                System.out.println("Please deposit the money");
                double money1 = scan.nextDouble();
                System.out.println("Your  balance is: $" + (balance + money1));
            } else {
                System.out.println("Invalid selection.Exiting account");
            }


        } else {
            System.out.println("Invalid pin. Please try again");
        }


    }
}
