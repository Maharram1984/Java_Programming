package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {

        String year = "2022";

        // normal concatenation
        System.out.println("This year " + year);                   // 2022
        System.out.println("Next year will be " + (2022 + 1));     // 2023
        System.out.println("Next year will be " + (year + 1));     // 20221

        int numYear = Integer.parseInt(year);

        System.out.println("This year " + numYear);                 // 2022
        System.out.println("Next year will be " + (numYear + 1));  // 2023

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message:  I am x years old");
        String str = input.nextLine(); // I am x years old

        String agePart = str.split(" ")[2];
        int age = Integer.parseInt(agePart);
        System.out.println("In five years, you will be " + (age + 5));


      /* I am x years old
       I am 10 years old
       str.split(" ") --> {"I", "am", "10", "years", "old"} --> arr[2] --> 10 */

        String str3 = "JavA IS REally FUn";
        String[] dd = str3.split(" ");
        String a = "";
        for (int i = 0; i < dd.length; i++) {
            a += dd[i].substring(0,1).toUpperCase()+dd[i].substring(1).toLowerCase();
        }
        String b = a.substring(0,1).toLowerCase()+a.substring(1);
        System.out.println(b);

    }
}
