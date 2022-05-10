package day14_NastedIfstatement;

import java.util.Scanner;

public class Realestate {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("What is your max budget?");
        int budget = scan.nextInt();

        String name = " ", range = " ";                          // default value
        double rating = 0;                                       //TODO
        boolean gated = false, allowPet = false, isAvailable = true;


        if (budget > 0 && budget < 300_000) {
            System.out.println("Looking for houses");


            if (budget >= 55000 && budget <= 75000) {
                name = "Oaks";
                range = "55000 - 75000";
                rating = 3.5;
                gated = false;
                allowPet = true;
            } else if (budget >= 80000 && budget <= 100000) {
                name = "Hills";
                range = "80,000 - 100,000";
                rating = 4.0;
                gated = false;
                allowPet = true;
            } else if (budget >= 120000 && budget <= 150000) {
                name = "Highland";
                range = "120000 - 150000";
                rating = 4.5;
                gated = true;
                allowPet = false;
            } else if (budget >= 160000 && budget <= 201000) {
                name = "Canyon";
                range = "160-000 - 201000";
                rating = 4.8;
                gated = true;
                allowPet = false;
            } else {
                System.out.println("No available houses");
                isAvailable = false;

            }
           if(isAvailable) {
               String AD = "Name of the neighborhood: " + name + "\nPrice range: " + range + "\nRating: " + rating;
               AD += " Gated: " + (gated ? "Yes" : "No ");
               AD += " They allow pet: " + (allowPet ? "Yes" : "No");

               System.out.println(AD);
           }
        } else {

            if (budget <= 0) {
                System.out.println("Your budget is not enough");
            } else {
                System.out.println("Too much money for this agency");
            }

        }


    }
}
