package day15_nestedIf;

import day02_hello_world.information;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which floor you want the elevator to go?");
        String floorNumber = input.nextLine();

        switch (floorNumber) {

            case "floor 1":
                System.out.println("Floor 1 ---->> Lobby, StarBucks, Amazon Pick Up");
                break;
            case "floor 2":
                System.out.println("Floor 2 ---->> NASA, Cydeo, Discover");
                break;
            case "floor 3":
                System.out.println("Floor 3 ---->> Uber, Lyft, Chase");
                break;
            case "floor 4":
                System.out.println("Floor 4 ---->> Rooftop, Lounge");
                break;
            default:
                System.out.println("Invalid floor selected");

        }


    }
}
