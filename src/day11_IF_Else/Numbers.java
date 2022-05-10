package day11_IF_Else;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1");
        int number1 = scan.nextInt();
        System.out.println("Enter number2");
        int number2 = scan.nextInt();

//       int number1 = 50;
//       int number2 = 45;

        if (number1 > number2) {
            System.out.println("Number one is bigger - " +number1);
        } else {
            System.out.println("Number two is bigger - " +number2);
        }


    }


}




