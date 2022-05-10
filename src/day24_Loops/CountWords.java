package day24_Loops;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {

        //  CountNumbers Words----Given a sentence determine how many words are in the String.

        String word = "Java why da ala, why";
        int count = 0;  //count = 1
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ' ') {  // (word.substring(PasswordCheck , PasswordCheck + {1)word.equals" "){
                count++;
            }
        }
        System.out.println(count + 1);  // count + 0














    }
}
