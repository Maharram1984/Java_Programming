package day15_nestedIf;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello, which item would you like?");
        String item = scan.nextLine();
        System.out.println("Thank you for your purchase!");
        int giftCard = 100;
        int price = 0;
        boolean value = true;

        switch (item) {
            case "Blanket":
                price = 60;
                break;
            case "Charger":
                price = 5;
                break;
            case "Hat":
                price = 25;
                break;
            case "Headphones":
                price = 30;
                break;
            case "Laptop":
                price = 200;
                break;
            case "Pants":
                price = 50;
                break;
            case "Pillow":
                price = 40;
                break;
            case "Smartphone":
                price = 1000;
                break;
            case "Socks":
                price = 5;
                break;
            case "USB cable":   // Todo check it couple times
                price = 10;
                break;
            default:
                System.out.println("Sorry, that is an invalid item");
                value = false;
        }
        if (value) {
            if (giftCard < price) {
                System.out.println("Sorry, not enough funds on your gift card");
            } else {
                System.out.print("Your current gift card balance is: $" +
                        (giftCard - price));
            }
        }


    }
}