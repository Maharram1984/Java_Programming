package day25_loops;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
      /*  Given a String with multiple words separated by spaces, create a camel case version of the words. Every word, except the first word, begin with an uppercase letter. The other characters of the word will be lowercase
        Today is SUNDAY
        Output:
        todayIsSunday */
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your words");
//        String str = input.nextLine().toLowerCase();
        String str = "To UPPER CASE";
        str = str.toLowerCase().trim();// to upper case
        String camelCase = str.substring(0, 1); // t

        for (int i = 1; i < str.length(); i++) {  // to upper case

            if(str.charAt(i - 1) == ' '){         // see every letter as a last letter == ' '
                camelCase += str.substring(i , i + 1).toUpperCase(); //("" +str.charAt(PasswordCheck)).toUpperCase();
            }else {
                camelCase += str.charAt(i); // today
            }

        }

        System.out.println(camelCase.replace(" ",""));


























    }
}
