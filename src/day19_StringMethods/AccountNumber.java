package day19_StringMethods;

import java.util.Scanner;

public class AccountNumber {
    public static void main(String[] args) {
        /*create a class AccountNumber
        ask the user enter an account number and check if the account number is
        valid. Accounts are valid if:
        handle empty inputs. If there is an empty input, do not check anything
        else and print: "Empty input given"
                - If the account number begins with a "2" the account number should
        be 7 characters long
        Print: "Valid 7-digit account number"
        Otherwise: "Valid 7-digit account number"
                - If the account number begins with a "5" the account number should
        be 10 characters long
        Print: "Valid 5-digit account number"
        Otherwise: "Invalid 5-digit account number"
        â If the account number does not begin with a 2 or a 5 OR the
        account number lengths do not meet the expected results print âInvalid
        account number
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your account number");
        String accountNum = input.nextLine();

        if (accountNum.isEmpty()) {
            System.out.println("Empty input given");

        } else if (accountNum.startsWith("2")) {
            if (accountNum.length() == 7) {
                System.out.println(" 7-digit account number is valid");
            } else {
                System.out.println(" 7-digit account number is invalid");
            }
        } else if (accountNum.startsWith("5")) {
            if (accountNum.length() == 10) {
                System.out.println(" 10 digit account number is valid");
            } else {
                System.out.println(" 10 digit account number is invalid");
            }
        } else if (accountNum.startsWith("1")) {
            if (accountNum.length() == 3) {
                System.out.println(" 3 digit account number is valid");
            } else {
                System.out.println(" 3 digit account number is invalid");
            }
        } else {
            System.out.println("invalid number");
        }


    }
}
