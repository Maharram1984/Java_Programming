package day22_loops;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to ATM");

        double balance = 1000;
        int validPin = 1234;
        int userPin;
        int attempts = 0;

        do {
            System.out.println("ENTER YOUR PIN");
            userPin = scan.nextInt();
            attempts++;

        } while (attempts < 3 && validPin != userPin);

        if (validPin == userPin) {
            System.out.println("LOGGED IN,SELECT A NUMBER\n1)CHECK A BALANCE\n2)WITHDRAW\n3)DEPOSIT");
            int option = scan.nextInt();
            if (option == 1) {
                System.out.println("YOUR BALANCE IS: $" + balance);
            } else if (option == 2) {
                System.out.println("HOW MUCH DO YOU WANT WITHDRAW?");
                double money = scan.nextDouble();
                System.out.println("WITHDRAWING: " + money);
                System.out.println("YOUR BALANCE IS: $" + (balance - money));
            } else if (option == 3) {
                System.out.println("ENTER YOUR DEPOSIT");
                double deposit = scan.nextInt();
                System.out.println("YOUR BALANCE IS: $" + (deposit + balance)+ "\nHAVE A GREAT DAY!");
            } else {
                System.out.println("WRONG SELECTION!\nHAVE A GREAT DAY!");
            }

        } else {
            System.out.println("INVALID NUMBER,LOCKED OUT\nPLEASE TRY AGAIN");
        }


    }
}
