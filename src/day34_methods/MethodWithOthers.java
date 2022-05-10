package day34_methods;

import java.util.Arrays;

public class MethodWithOthers {

    public static String dayInWords(int day) {

        String strDay = "";

        switch (day) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Invalid";
        }
    }

    public static int firstEvenNumber(int[] nums) {
        for (int each : nums) {
            if (each % 2 == 0) {
                return each;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

        int[]arr = {1,9,3,4,5,6,7};
        System.out.println(firstEvenNumber(arr));
}
}
