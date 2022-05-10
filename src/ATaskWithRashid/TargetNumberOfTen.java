package ATaskWithRashid;

import java.util.Arrays;

public class TargetNumberOfTen {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 4};
        int target = 10;

        int result[] = new int[1];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    result[0] = arr[i] + arr[j];
                    // break;
//                    result[0] = arr[j];
//                    result[1] = arr[PasswordCheck];
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
