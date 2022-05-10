package day15_nestedIf;

import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your party size");
        int partySize = input.nextInt();
        System.out.println("How many days will you stay at the hotel?");
        int numberOfDays = input.nextInt();
        System.out.println("How many people are in your party? ");
        int numberOfPeople = input.nextInt();

        double price = 0;
        String roomType = "";
        boolean isAvailable = true;

        switch (partySize) {
            case 1:
                roomType = "single room";
                price = numberOfDays * 100;
                break;
            case 2:
                roomType = "double room";
                price = numberOfDays * 125;
                break;
            case 3:
            case 4:
                roomType = "large room";
                price = numberOfDays * numberOfPeople * 150;
                break;
            case 5:
            case 6:
            case 7:
                roomType = " suite";
                price = numberOfDays * 5000;
                break;
            default:
                System.out.println("Sorry we don't have any " +
                        "available rooms for that size part");
                isAvailable = false;

        }if(isAvailable){
            System.out.println(" -For Party size " +partySize+ "\n -you choose \""+
                    roomType+ "\"\n -price will be $" +price+ " in total");

        }

    }
}
