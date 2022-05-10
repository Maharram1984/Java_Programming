package day15_nestedIf;

import java.util.Scanner;

public class MovieNested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the length of movie? ");
        double duration = scan.nextDouble();

        if (duration > 0 && duration <= 4) {


            if (duration == 1.0) {
                System.out.println("ticket price is: $8.99");
            } else if (duration > 1.0 && duration <= 1.50) {
                System.out.println("ticket price is: $10.50");
            } else if (duration > 1.5 && duration <= 2.0) {
                System.out.println("ticket price is: $12.99");
            } else if (duration > 2.0 && duration <= 2.50) {
                System.out.println("ticket price is: $14.50");
            } else{
                System.out.println("ticket price is: $15.99");
            }
        } else {

            if (duration <= 0) {
                System.out.println("Movies cannot be less than 0 minutes");
            } else {
                System.out.println("Movies cannot be more than 4 hours");
            }
        }

    }
}
