package day10_Scanner;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a year ");
        int year = scan.nextInt();

        boolean leapYear = year % 4 == 0 || (year % 100 == 0 && year % 400 != 0);
//        boolean leapYear1 = year % 100 == 0;
//        boolean leapYear2 = year % 400 == 0;
        System.out.println("Is it a \"leap year\"? "+leapYear);
        System.out.println("Is it a \"leap year\"? "+leapYear);
        System.out.println("Is it a \"leap year\"? "+leapYear);

        System.out.println();                 //todo









    }
}
