package day15_nestedIf;

public class MinutesNested {
    public static void main(String[] args) {

        int minutes = 91;

        if (minutes <= 90 && minutes > 0) {

            if (minutes < 90 && minutes >= 75) {
                System.out.println("Just getting started");
            } else if (minutes <= 74 && minutes >= 60) {
                System.out.println("Players are doing their best");
            } else if (minutes <= 59 && minutes >= 30) {
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

        }


    }
}
