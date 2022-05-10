package ATaskWithVictoria;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveSix2 {
    public static void main(String[] args) {

        Integer arr[] = new Integer[]{8, -6, 3, -5, 6, 1, 2, -8};
        ArrayList<Integer> result = new ArrayList<>(Arrays.asList(arr));

        int num = 0;
        for (int each : arr) {
            if (each < 0) {
                //result.removeAll(Arrays.asList(each,-each));
                num=each-(2*each);
                result.removeAll(Arrays.asList(each,num));
            }
        }
        System.out.println(result);
    }
}
