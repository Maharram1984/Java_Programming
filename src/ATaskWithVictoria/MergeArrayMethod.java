package ATaskWithVictoria;

import java.util.Arrays;

public class MergeArrayMethod {
    //    Task 2 :   Create a method that can print out the combination of two integer arrays
//    int[] array1 = {1,2,3,4};
//    int[] array2 = {5,6,7,8,9,10};
    public static int[] Merge(int[] arr1, int[] arr2) {

            int[] result = Arrays.copyOf(arr1, arr1.length + arr2.length);
            int a = 0;
            for (int i = arr1.length; i < result.length; i++) {
                result[i] = arr2[a++];
            }
           return result;
        }
    public static void main(String[] args) {
        int[] a1 = {1,2,3,4};
        int[] a2 = {5,8,7,6,9,10};
        System.out.println(Arrays.toString(Merge(a1,a2)));
    }


}