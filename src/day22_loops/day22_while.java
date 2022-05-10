package day22_loops;

import java.util.Scanner;

public class day22_while {
    public static void main(String[] args) {

//        //  write a program that will add all the numbers from 1 to 500
//        System.out.println();
//        int a = 1;
//        while (a <= 500) {
//            System.out.print(" " + a);
//            a++;
//        }
//
//        //write a program that will print all the alphabet letters in lowercase from 'a' to 'z'
//        System.out.println();
//        char lowerCaseUp = 'a';
//
//        while (lowerCaseUp <= 'z') {
//            System.out.print(" " + lowerCaseUp); // 97-122
//            lowerCaseUp++;
//        }
//
//        // write a program that will print all the alphabet letters in uppercase from 'A' to 'Z'
//        System.out.println();
//        char upperCaseUp = 'A';                 //65 - 92
//        while (upperCaseUp <= 'Z') {
//            System.out.print(" " + upperCaseUp);
//            upperCaseUp++;
//        }
//
//        //write a program that will print all the alphabet letters backwards in lowercase from 'z' to 'a'
//        System.out.println();
//        char lowerCaseBack = 'z';
//        while (lowerCaseBack >= 'a') {
//            System.out.print(" " + lowerCaseBack);
//            lowerCaseBack--;
//        }
//
//        //write a program that will print all the alphabet letters backwards in uppercase from 'Z' to 'A'
//        System.out.println();
//        char upperCaseDown = 'Z';
//        while (upperCaseDown >= 'A') {
//            System.out.print(" " + upperCaseDown);
//            upperCaseDown--;
//        }
//
//
//

        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        while (number <= 50) {

            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println("FizzBuzz ");
            } else if (number % 5 == 0) {
                System.out.println("Fizz ");
            } else if (number % 3 == 0) {
                System.out.println("Buzz ");
            } else {
                System.out.println(number);

            }
            number++;

//
//            int k = 1;
//            while (k <= 10) {
//                System.out.print(" " + k);
//                k++;
//
//            }


        }
    }}

