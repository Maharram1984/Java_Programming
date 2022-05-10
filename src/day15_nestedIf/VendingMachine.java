package day15_nestedIf;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the vending machine.\nPlease select of the following:\n\t" +
                "Drinks\n\tSnacks\n\tGum");
        String selection = input.next();

        String item = "";

        switch (selection) {

            case "Drinks":
                System.out.println("You chose drinks: Press a number\n\t1)Water\n\t2)Soda\n\t3)Juice");
                int drinkNumber = input.nextInt();

                if (drinkNumber == 1) {
                    item = "Water";
                } else if (drinkNumber == 2) {
                    item = "Soda";
                } else if (drinkNumber == 3) {
                    item = "Juice";
                }
                break;

            case "Snacks":
                System.out.println("You choose snacks: press a number:" +
                        "\n\t1)Cake\n\t2)Cup Cake\n\t3)Muffin\n\t4) Chips\n\t5)Cookies");
                int snackNumber = input.nextInt();
                if (snackNumber == 1){
                    item = "Cake";
                }else if(snackNumber == 2){
                    item = "Cup Cake";
                }else if(snackNumber == 3){
                    item = "Muffin";
                }else if (snackNumber == 4) {
                    item = " chips";
                } else if (snackNumber == 5) {
                    item = "Cookies";
                }
                break;

            case "Gum":
                item = "Generic gum";


        }
        System.out.println("Vending............ " + item);


    }
}
