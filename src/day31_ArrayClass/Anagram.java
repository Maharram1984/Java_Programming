package day31_ArrayClass;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        /* Anagram
        Given two Strings determine if they are anagram or not. Strings are anagram if
        they are built up of the same characters
        Ex:
        listen vs silent  -->
                funeral vs  real fun
        a gentleman vs elegant man
                -> anagram
        Hint: look up and use replaceFirst() method  */

        String str = "listen";
        String str2 = "silent";

        char[] one = str.toCharArray();
        char[] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));
        if(Arrays.equals(one,two)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not Anagram");
        }

        System.out.println(Arrays.equals(one,two) ? "Anagram" : "Not Anagram");




        }
    }
