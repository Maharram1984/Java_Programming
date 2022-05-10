package day_15;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfDigits {
    public static void main(String[] args) {
   /* implement this method to return the sum of all integers found in the parameter String.
                    String s="jav45ai1000sgre1at82"
                     result: 45+1000+1+82 ----> 1128  */
        String s = "jav45ai1000sgre1at82";
        System.out.println(sumOfDigits(s));
    }

    public static int sumOfDigits(String str) {
        String digits = "0";
        //String s = "jav45ai1000sgre1at82";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digits += str.charAt(i);

            } else {
                sum+= Integer.parseInt(digits);
                digits = "0";
            }
        }
        return sum+Integer.parseInt(digits);

    }

}
