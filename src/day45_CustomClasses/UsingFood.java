package day45_CustomClasses;

import java.util.Arrays;

public class UsingFood {
    public static void main(String[] args) {

 /* Create a separate class to create and test the Food objects
    try making an array of Food objects
    find all the Food objects that start with 'a'
    find all the Food objects that have a total price over 20 */

        Food apples = new Food("Apples");
        System.out.println(apples);
        System.out.println("===============================");
        Food chips = new Food("Lays", 3);
        System.out.println(chips);
        System.out.println("===============================");
        Food chicken = new Food("Chicken", 3, 5.99);
        System.out.println(chicken);
        System.out.println("===============================");
        apples.quantity = 10;
        apples.unitPrice = 1.99;    //manually changed
        apples.calculatePrice();
        System.out.println(apples);
        System.out.println("===============================");
        chips.quantity = 4;
        chips.unitPrice = 2.99;     //manually changed
        chips.calculatePrice();
        System.out.println(chips);
        System.out.println(chips.totalPrice);
        System.out.println("===============================");
        Food bread = new Food("Bread", 2, 5.99);
        System.out.println(bread);
        System.out.println("===============================");
        Food[] allFood = {apples, chips, chicken, null}; // now size is 4
        System.out.println(allFood[2]);
        System.out.println(allFood.length);
        allFood[3] = new Food("Banana", 4, 1.99);
        System.out.println(Arrays.toString(allFood));
        System.out.println(allFood[3]);

        System.out.println("===============================");
        //calculate total price of the shopping
        double totalExpense = 0;
        for (Food each:allFood){   // each is same allFood[PasswordCheck]
            System.out.println(each);
            totalExpense += each.totalPrice;

        }
        System.out.println(totalExpense);
    }
}
