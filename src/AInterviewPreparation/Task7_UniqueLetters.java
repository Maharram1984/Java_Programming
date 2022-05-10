package AInterviewPreparation;

import java.util.Arrays;
import java.util.Collections;

public class Task7_UniqueLetters {
    public static String uniqueLetter(String str) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
          int count = Collections.frequency(Arrays.asList(str.split("")),"" + str.charAt(i));
          res += (count == 1) ? str.charAt(i) + " " : "";
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "AWAABBBCDDDEFFG";
        String str2 = "awaabbcffgbbh";
        System.out.println(uniqueLetter(str));
        System.out.println(uniqueLet2(str2));
    }


    public static String uniqueLet2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                result += str.charAt(i) + " ";
            }
        }
        return result;
    }
}
