package day23_ForLoop;

import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String list = "Shopping list:";
        String addMore;

        do {
            System.out.println("enter the name of the item");
            list +="," +scan.nextLine();

            System.out.println("Do you want to add more to your shopping list?");
            addMore = scan.nextLine();

        }while (addMore.equalsIgnoreCase("yes") || addMore.equalsIgnoreCase("ok"));


             System.out.println(list);

























    }
}
