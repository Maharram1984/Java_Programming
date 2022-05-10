package day17_String_Class;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the username");
        String userName = scan.nextLine();
        userName = userName.toUpperCase();    //method changing
        System.out.println("Please enter the password");
        String password = scan.nextLine();

        if(password.length() >= 8 && password.equals("maharram")){
            System.out.println("Logged in with: " +userName);
        }else {
            System.out.println("Invalid number");
        }



















    }
}
