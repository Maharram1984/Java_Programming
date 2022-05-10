package day29_Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
/*  Reverse Array
    Write a program that will reverse the order of any given array
    Ex: Input:
    [1, 2, 3, 4, 5]
    Output:
    [5, 4, 3, 2, 1] */

        int[] arr = {1, 2, 3, 4, 5};
        int[] reverse = new int[arr.length];

        for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
            reverse[i] = arr[j];
        }

//        for (int PasswordCheck = 0; PasswordCheck < arr.length; PasswordCheck++) {
//           reverse[arr.length - 1 - PasswordCheck] = arr[PasswordCheck];
//        }
        System.out.println(Arrays.toString(arr));         // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(reverse));     // [5, 4, 3, 2, 1]

        String[] fruits = {"apple", "pineapple", "pear", "plum", "cherry"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
        System.out.println();
        for (String ap : fruits) {
            System.out.println(ap);
        }


    }
}
