package ATaskWithRashid;

import PrimitiveDataTypes.Char;

import java.util.ArrayList;

public class CountsZeroAndNumbers {

    public static void main(String[] args) {
     /* "abc111def000sjhdjsh0d1sdks000dd11"
         Count all zeros and ones
         output:
         ones = 6
         zeros = 7          */
        String word = "abc111def000sjhdjsh0d1sdks000dd11";
        int countZero = 0;
        int countOne = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '0') {
                countZero++;
            }
            if (word.charAt(i) == '1') {
                countOne++;
            }
        }
        System.out.println(countZero);
        System.out.println(countOne);

        ArrayList<Character> zero = new ArrayList<>();
        ArrayList<Character> one = new ArrayList<>();
        String str = "abc111def000sjhdjsh0d1sdks000dd11";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '0'){
                zero.add(str.charAt(i));
            }
            if(str.charAt(i) == '1'){
                one.add(str.charAt(i));
            }
        }
        System.out.println(zero);
        System.out.println(one);

    }
}





