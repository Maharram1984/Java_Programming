package day24_Loops;

import java.util.Scanner;

public class CountUpperLowerNumbers {
    public static void main(String[] args) {

        // Given a String find and print how many uppercase, lowercase letter and number are in the String

        String word = "1ju9MA8mp4QA";
        String upper = "";
        String lower = "";
        String number = "";

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if (letter <= 'Z' && letter >= 'A') {
                upper += letter + " ";
            } else if (letter <= 'z' && letter >= 'a') {
                lower += letter + " ";
            } else if (letter <= '9' && letter >= '0') {
                number += word.charAt(i) + " ";

            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(number);

        // Given int find and print all uppercase, lowercase letters and numbers

        int upper1 = 0;
        int lower1 = 0;
        int number1 = 0;

        for (int i = 0; i < word.length(); i++) {

            char letter1 = word.charAt(i);
            if (letter1 >= 'A' && letter1 <= 'Z') {
                upper1++;
            } else if (letter1 >= 'a' && letter1 <= 'z') {
                lower1++;
            } else if (letter1 >= '0' && letter1 <= '9') {
                number1++;
            }

        }
        System.out.println(upper1);
        System.out.println(lower1);
        System.out.println(number1);


    }
}
