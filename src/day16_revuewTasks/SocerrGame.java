package day16_revuewTasks;

import java.util.Scanner;

public class SocerrGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many minutes are left in the game?");
        int minutes = input.nextInt();


        if (minutes <= 90 && minutes > 0) {

            if (minutes >= 75) {
                System.out.println("Game just getting started");
            } else if (minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes >= 30) {
                System.out.println("Middle of the game going great");
            } else {
                System.out.println("The end of the game is approaching");
            }

        } else {

            if (minutes <= 0) {
                System.out.println("Minutes can not be negative number");
            } else {
                System.out.println("Games can not be longer than 90 minutes");
            }

                      System.out.println(minutes < 0?"Minutes can" +
                    " not be negative number" :"Games can not be longer than 90 minutes" );
            //ternary version

        }


    }
}
