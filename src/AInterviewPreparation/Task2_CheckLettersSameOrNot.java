package AInterviewPreparation;

import java.util.Arrays;

public class Task2_CheckLettersSameOrNot {
    /* 2. use Array sort
       Write a return method that check if a string is build
       out of the same letters as another string.
         String g="abc";
         String h="cab";
       Ex:  same("abc",  "cab"); -> true
       same("abc",  "abb"); -> false:  */

    public static boolean sameLetters(String arr1, String arr2){
       String[] a = arr1.split("");
       String[] b = arr2.split("");
        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cab";
        System.out.println(sameLetters(str1,str2));
    }
}
