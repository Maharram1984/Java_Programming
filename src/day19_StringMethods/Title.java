package day19_StringMethods;

import java.util.Scanner;

public class Title {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter your name with titles");
        String name = input.nextLine().toLowerCase();

        if (name.startsWith("mr ") || name.startsWith("mister ")) {
            System.out.println("Hello Sir");
        } else if (name.startsWith("ms ") || name.startsWith("Miss ") || name.startsWith("madam ")) {
            System.out.println("Hello madam");
        } else if (name.startsWith("dr ")) {
            System.out.println("Hello doctor");
        }
        if (name.endsWith(" sr")) {
            System.out.println("Nice to meet you Senior");  //todo
        } else if (name.endsWith(" jr")) {
            System.out.println("Nice to meet you Junior");
        }


    }
}
