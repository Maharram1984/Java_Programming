package day10_Scanner;

import java.util.Scanner;

public class RateCalculator {
    public static void main(String[] args) {

        System.out.println("RATE CALCULATOR");

        Scanner input = new Scanner(System.in);
        System.out.println("What is your salary: ");
        double salary = input.nextDouble();
        System.out.println("How many hours do you work in a week? ");
        int hoursPerWeek = input.nextInt();

        double hourlyRate = salary / (hoursPerWeek * 52);

        System.out.println("Your hourly rate is:  $" +hourlyRate);







    }
}
