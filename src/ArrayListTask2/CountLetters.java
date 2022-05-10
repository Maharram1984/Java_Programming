package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    /* Create a method that will accept an ArrayList of Strings and a
       letter (char) print how many times the letter is found in the ArrayList elements
       Input: ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
       letter: ‘a’
       Output: 6  */
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        int count = 0;
        for (String each : words) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == 'a') {
                    count++;
                }
            }
        }
        System.out.println(count);

        ArrayList<String> word = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        System.out.println(countLetter(word, 'a'));
    }

    public static int countLetter(ArrayList<String> list, char character) {
        int count = 0;
        for (String each : list) {
            for (int i = 0; i < each.length(); i++) {
                if (each.charAt(i) == character) {
                    count++;
                }
            }
        }
        return count;
    }

}