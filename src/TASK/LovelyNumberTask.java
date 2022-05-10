package TASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LovelyNumberTask {
    public static Integer lovelyNumber(int num) {
        int count = 0;
        String[] name = String.valueOf(num).split("");
        ArrayList<String> list = new ArrayList<>(Arrays.asList(name));
        for (String each : list) {
            count = Collections.frequency(list, each);
            if (count >= 3) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(lovelyNumber(100));
        System.out.println(lovelyNumber(111));
        System.out.println(lovelyNumber(1232));
        System.out.println(lovelyNumber(9922));
        System.out.println(lovelyNumber(99222));
    }
}