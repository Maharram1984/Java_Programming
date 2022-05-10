package day15_nestedIf;

import java.util.Scanner;

public class Strarbucks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which size coffee do you want?");
        String size = input.next();
        double price = 0;
        int calories = 0;
        boolean validOrder = true;


        switch (size) {
            case "Large":
                price = 4.50;
                calories = 200;
                break;
            case "Medium":
                price = 4.00;
                calories = 150;
                break;
            case "Small":
                price = 2.50;
                calories = 100;
                break;
            default:
                System.out.println("We don't have that size");
                validOrder = false;

        }
        if(validOrder){
            System.out.println("Your order for a " + size + " coffee is $" + price + " and has " + calories + " calories");


        }

    }
}
