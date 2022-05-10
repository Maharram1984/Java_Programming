package AInterviewPreparation;

import java.util.Arrays;

public class Task100_TargetNumber {

    public static int[] targetNumber(int[] num, int target) {

        int result[] = new int[2];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] + num[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {5, 3, 4, 6};
        int target = 10;
        System.out.println(Arrays.toString(targetNumber(arr, 10)));


        int[] arr1 = {4, 5, 3, 7};
        int target1 = 10;
        String str = "";

        for (int i = 0; i < arr1.length; i++) {
            for (int j = i + 1; j < arr1.length; j++) {
                if (arr1[i] + arr1[j] == target) {
                    str += arr1[i] + "," + arr1[j];
                }
            }
        }
        System.out.println(str);

    }
}