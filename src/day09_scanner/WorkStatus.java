package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("First name: ");
        String firstName = input.next();

        System.out.println("Last name: ");
        String lastName = input.next();

        System.out.println("Are you employed: ");
        Boolean employee = input.nextBoolean();

        System.out.println("Are you student: ");
        Boolean student = input.nextBoolean();

        String details = firstName+ " "+lastName+ " is employed " +employee+
                " and they are student " + student;

        System.out.println( details);










    }
}
