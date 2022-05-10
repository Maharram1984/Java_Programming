package CustomMethodPractice;

import java.util.Arrays;

public class M {
    public static void main(String[] args) {
        /*      Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};
                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]*/
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {5, 6, 7, 11, 9, 10};
        mergeTwoArray(array1, array2);
    }

    public static void mergeTwoArray(int[] array1, int[] array2) {
      int[]result = new int[array1.length + array2.length];
      int count = 0;

        for (int i = 0; i < array1.length; i++) {
            result[count++] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            result[count++] = array2[i];
        }
        Arrays.sort(result);
        System.out.println(Arrays.toString(result));

    }



}