package day15_nestedIf;

import TASK.ScannerScan;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which day is today?");
        String day = scan.nextLine();
        String information = "";

        switch (day) {
            case "Monday": case "monday": case "MONDAY": case "mon": // can put same line and one of them will reach.
                information = "Monday is Java class with Saim";
                break;
            case "Tuesday":
            case "Wednesday":
                information = "Java and Office hours day";
                break;
            case "Thursday":
                information = "Soft Skill day with Nadir";
                break;
            case "Friday":
                information = "Today is of";
                break;
            case "Saturday":
            case "Sunday":
                information = "Java class with Saim";
                break;
            default:
                information = "Not a valid day";

        }

        System.out.println(information);
    }
}
