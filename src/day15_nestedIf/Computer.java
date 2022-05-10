package day15_nestedIf;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Select screen size:");
        String screenSize = scan.next();
        System.out.println("Select CPU type:");
        String cpuType = scan.next();
        System.out.println("Select RAM size:");
        int RAM = scan.nextInt();
        System.out.println("Select storage type:");
        String storage = scan.next();
        System.out.println("Select storage size:");
        int storageSize = scan.nextInt();
        String sss = scan.nextLine();
        System.out.println("Select screen resolution:");
        String screenResolution = scan.nextLine();
        double totalPrice = 0;


        switch (screenSize) {
            case "13.3":
                totalPrice += 200;
                break;
            case "15":
                totalPrice += 300;
                break;
            case "17.3":
                totalPrice += 400;
                break;
        }

        switch (cpuType) {
            case "i3":
                totalPrice += 150;
                break;
            case "i5":
                totalPrice += 250;
                break;
            case "i7":
                totalPrice += 350;
                break;
        }

        totalPrice += 50 * (RAM / 4);


        switch (storage) {
            case "HDD":
                totalPrice += (storageSize / 500) * 50;
                break;
            case "SSD":
                totalPrice += (storageSize / 500) * 100;
                break;
        }

        switch (screenResolution) {
            case "FULLHD":
                totalPrice += 100;
                break;
            case "4K":
                totalPrice += 200;
                break;
        }
        System.out.println("Final price is: $" + totalPrice);


    }
}
