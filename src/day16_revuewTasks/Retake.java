package day16_revuewTasks;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What was the grade?");
        int grade = scanner.nextInt();
        System.out.println("Which attempt number is it?");
        int attempt = scanner.nextInt();
        boolean valid = attempt < 4 && attempt > 0;  // true;


        if (attempt == 1) {
            grade = grade - (int) (grade * 0.1);
            //System.out.println("Subtracted 10% " +grade+ - (grade * 0.1));   // grade * 0.9
        } else if (attempt == 2) {
            grade -= grade * 0.2;
            // System.out.println("Subtracted 20% " +grade+ - (grade * 0.2));   // grade * 0.8
        } else if (attempt == 3) {
            grade *= 0.65;
            // System.out.println("Subtracted 35% " +grade+ - (grade * 0.35));  // grade * 0.65
        } else {
            System.out.println("Not valid attempt number");
         // valid = false;                            //TODO
        }
     //   if (valid) {
            System.out.println(grade);
      //  }

    }
}
