package day11_IF_Else;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your balance?");        // second version
        double balance = input.nextDouble();
        System.out.println("How much is your withdrawing?");
        double withdraw = input.nextDouble();

//        double balance = 400;             // hard code version
//        double withdraw = 500;
        // withdraw some amount of money from my balance
        balance -= withdraw;


        if (balance < 0) {
            System.out.println("Took out too much money,100$ overdraft applied ");
            System.out.println("Balance before fee: " + balance);
            balance -= 100; // balance = balance -100$
        }
        System.out.println("Balance $" + balance);


    }
}
