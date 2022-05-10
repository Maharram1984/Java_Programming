package day22_loops;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {


        //Try with Scanner:
        //write a program that will add 5 numbers from the console
        System.out.println();

        Scanner scan = new Scanner(System.in);

        int number = 1;
        int result = 0;                                                                                                   //<---starting number

        while (number <= 5) {                                                                                            //<--- calculating ends by reaching this num
            System.out.println( number );
            number++;
            result += scan.nextInt();
        }
        System.out.println(result);
    }
}
