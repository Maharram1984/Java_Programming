package day20_StringPractice;

import java.util.Locale;
import java.util.Scanner;

public class tasknew {
    public static void main(String[] args) {

        String word = "banana";
                     //012345
        int firsIndex = word.indexOf('a');
        System.out.println(firsIndex);
        System.out.println(word.indexOf('a'));

        int secondIndex = word.indexOf('a', firsIndex +1);  // starts to look from index 2
        System.out.println(secondIndex);
        System.out.println(word.indexOf('a',firsIndex +1));  // starts to look from index 2

        int thirdIndex = word.indexOf('a', secondIndex +1);  // starts to look from index 4
        System.out.println(thirdIndex);
        System.out.println(word.indexOf('a',secondIndex +1)); // starts to look from index 4


        String a = "madaqasgar";
        String b = "al";


        System.out.println(word.indexOf('b'));
        System.out.println(word.charAt(0));
        System.out.println(word.replace('a','e'));
        System.out.println(word.substring(3)+word.substring(0,3));

        b = b.substring(0).toUpperCase();
        System.out.println(b.substring(0,2)+a.substring(5));
        //System.out.println("Al"+a.substring(5));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = input.nextLine().trim().toLowerCase();
        System.out.println("Enter last name");
        String lastName = input.nextLine().trim().toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println(firstName+" "+lastName);




    }
}
