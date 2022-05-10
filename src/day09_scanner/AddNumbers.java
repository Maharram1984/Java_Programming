package day09_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Number1: ");
        int num1 = input.nextInt();

        System.out.println("Number2: ");
        int num2 = input.nextInt();

        System.out.println("Number3: ");
        int num3 = input.nextInt();

        System.out.println("Summary of numbers: " +(num1+num2+num3));


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 numbers ");
        int numb1 = scan.nextInt();
        int numb2 = scan.nextInt();
        int numb3 = scan.nextInt();
        System.out.println("Calculate all numbers: " +(numb1+numb2+numb3));





    }
}
