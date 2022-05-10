package day15_nestedIf;

import java.util.Scanner;

public class SezonFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What season is it?");
        int seasonFinder = input.nextInt();

        switch (seasonFinder){

            case 1: case 2: case 12:
                System.out.println("It is winter,so wear a winter coat, gloves and hat ");
                break;
            case 3: case 4: case 5:
                System.out.println("It is spring, life is again coming back");
                break;
                case 6: case 7: case 8:
                System.out.println("it is summer, lets go to swim");
                break;
            case 9: case 10: case 11:
                System.out.println("it is fall,I like this season");
                    break;
            default:
                System.out.println("Error --- There is only 12 months");
        }
























    }
}
