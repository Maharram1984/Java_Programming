package day15_nestedIf;

import java.util.Scanner;

public class AgeNested {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your age?");
        int age = input.nextInt();

        if (age >= 0 && age <= 120) {

            if (age <= 2) {
                System.out.println("Baby");
            } else if (age >= 3 && age <= 5) {
                System.out.println("Toddler");
            } else if (age >= 6 && age <= 9) {
                System.out.println("Kid");
            } else if (age >= 10 && age <= 12) {
                System.out.println("Pre-Teen");
            } else if (age >= 13 && age <= 17) {
                System.out.println("Teenager");
            } else if (age >= 18 && age <= 20) {
                System.out.println("Young adult");
            } else if (age >= 21 && age <= 35) {
                System.out.println("Adult");
            } else if (age >= 36 && age <= 55) {
                System.out.println("Middle aged adult");
            } else {
                System.out.println("Senior citizen");
            }
        } else {
            System.out.println("Invalid number");
        }


    }
}
