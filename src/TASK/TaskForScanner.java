package TASK;

import java.util.Scanner;

public class TaskForScanner {

    public static void main(String[] args) {



        Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter price ");
        double price = input1.nextDouble();
        System.out.println("Please enter quantity ");
        int quantity = input1.nextInt();

        double revenue = price * quantity;
        System.out.println("Your total Revenue is: $"+revenue);
        System.out.println("Total Revenue is: $"+price*quantity);







        }
}
