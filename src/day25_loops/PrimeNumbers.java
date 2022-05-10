package day25_loops;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {

       /* Give a number determine if it is a prime number. A prime number is a number that is only divisible by 1 and itself.

        Ex:         Output:           Ex:                Output:
        prime        Input:           Input:             not prime
                     11                                      10   */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        boolean isPrime = number >= 2; // you can put --> boolean isPrime = true

        // this loop is trying to check if the number is evenly divisible by value from 2 to the number

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(number + " prime number");
        } else {
            System.out.println(number + " not prime");
        }
    }}

