package day19_StringMethods;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first name: ");
        String firstname = input.next().toUpperCase();
        System.out.println("Enter the last name: ");
        String lastname = input.next().toUpperCase();
        System.out.println("" + firstname.charAt(0) + lastname.charAt(0));
        System.out.println("--------------------------------------------");
        input.nextLine();

        System.out.println("Enter a word");
        String str = input.nextLine();
        System.out.println("word starts with: " + str.charAt(0) +
                " ends with: " + str.charAt(str.length() - 1));   // word
        System.out.println("----------------------------------------------------");

        System.out.println("Enter a sentence");
        String str1 = input.nextLine();            // with next was issue gave me only word
        System.out.println("First char: " + str1.charAt(0));
        System.out.println("Last char: " + str1.charAt(str1.length() - 1));  // sentence

          /*  1)firsName = firstName.toUpperCase();
            char firstLetter = firstName.charAt(0);

          2)char firstLetter = firstName.toUpperCase.charAt(0);
       */

    }
}
