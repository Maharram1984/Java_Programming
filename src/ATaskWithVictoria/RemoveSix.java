package ATaskWithVictoria;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSix {
    /*  int y[]=new int[]{6,-6,5,1,2,8};
        Remove all digits that less than 0 and also if that numbers match any
        number remove that number too
        ex: - 6 is less than 0 and also equals 6 . So output should be [5, 1, 2, 8] */

    public static ArrayList<Integer> removeNum(Integer[] arr) {
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));

        int num = 0;
        for (int each : arr) {
            if (each < 0) {
                //result.removeAll(Arrays.asList(each,-each));
            num=each-(2*each);
            result.removeAll(Arrays.asList(each,num));
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Integer y[] = new Integer[]{8, -6, 3, -5, 6, 1, 2, -8};
        System.out.println(removeNum(y));
    }


}
