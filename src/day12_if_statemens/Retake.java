package day12_if_statemens;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {

      /*  create a class Retake
        declare and assign a grade variable
        declare and assign an attempt number
        Doing a retake for the assignment will reduce the grade by a percentage
        based on the number of attempts taken:
                If its the first attempt -> subtract 10%
                If its the second attempt -> subtract 20%
                If its the third attempt -> subtract 35%
                Based on the retake attempt number calculate the final grade */

        Scanner scanner = new Scanner(System.in);
        System.out.println("If attempt number: ");
        int attempt = scanner.nextInt();
        System.out.println("Grade:");
        double grade = scanner.nextDouble();

        //  double grade = 1000;
        //  int attempt =1;

        if (attempt == 1) {
            System.out.println("Subtracted 10% " + grade + -(grade * 0.1));   // grade * 0.9
        } else if (attempt == 2) {
            System.out.println("Subtracted 20% " + grade + -(grade * 0.2));   // grade * 0.8
        } else if (attempt == 3) {
            System.out.println("Subtracted 35% " + grade + -(grade * 0.35));  // grade * 0.65
        }


    }
}
