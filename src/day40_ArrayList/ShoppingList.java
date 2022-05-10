package day40_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        System.out.println(shoppingList.isEmpty() ? "Shopping List Empty " : "You have some items");
        String keepAsking;

        do {
            System.out.println("Enter the item");
            shoppingList.add(scan.nextLine());

            System.out.println("Do you want to continue y/n");
            keepAsking = scan.nextLine();

        } while ( keepAsking.equals("yes") || keepAsking.equals("y"));

        System.out.println("Shopping List: " + shoppingList.size() + " items");
        for (String item : shoppingList) {
            System.out.println("*\t" +item);
        }
        System.out.println("-------------------------------------------");
        System.out.println(shoppingList.contains("water")? "water on list " : "No water");

        System.out.println("Do you want remove any items? ");
        if(scan.nextLine().equals("yes")) {
            System.out.println("What item do you want to remove? ");
            String removeItem = scan.nextLine();

            if (Character.isDigit(removeItem.charAt(0))) {

                int number = Integer.parseInt(removeItem);
                shoppingList.remove(number - 1);
            } else {
                shoppingList.remove(removeItem);
            }
        }
        System.out.println("Final list: " + shoppingList);















    }
}
