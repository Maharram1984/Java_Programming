package day29_Array;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccountArray {
    public static void main(String[] args) {
        String[] bankAccountOne = {"Brad Pitt", "Checking", "1004567890", "100,000"};

        System.out.println(bankAccountOne.length);                  // 4 length of size
        System.out.println("Whole Array: " + Arrays.toString(bankAccountOne));//Whole Array: [Brad Pitt, Checking, 1004567890, 100,000]
        System.out.println("Name: " + bankAccountOne[0]);           //Name: Brad Pitt
        System.out.println("Account type: " + bankAccountOne[1]);   //Account type: Checking
        System.out.println("Account number: " + bankAccountOne[2]); //Account number: 1004567890
        System.out.println("Balance: " + bankAccountOne[3]);        //Balance: 100,000

        String[] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo));//[null, null, null, null]
        bankAccountTwo[0] = "James Bond";
        bankAccountTwo[1] = "Savings";
        bankAccountTwo[2] = "123654865";
        bankAccountTwo[3] = "100,000";
        System.out.println(Arrays.toString(bankAccountTwo));//[James Bond, Savings, 123654865, 100,000]

        String[] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name");
        String firstName = input.nextLine();
        bankAccountThree[0] = firstName;                  // without this you will get null
        System.out.println("Enter your account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Enter your account number");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3] = input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));//[Jimmy, Saving, 1009026768, 100,000]


        String[] bankAccountFour = new String[4];
        String[] information = {"full name", "account type", "account number", "balance"};

        for (int i = 0; i < bankAccountFour.length; i++) {
            System.out.println("enter your " + information[i]);
            bankAccountFour[i] = input.nextLine();
//            System.out.println(Arrays.toString(bankAccountFour)); // u will see how process is going [m, 1, 2, null]
        }
        System.out.println(Arrays.toString(bankAccountFour));  //enter your + balance -> 1000 ->   [m, 1, 1, 1000]




    }
}
