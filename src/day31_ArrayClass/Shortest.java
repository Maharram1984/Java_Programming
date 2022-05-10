package day31_ArrayClass;

import day28_Array.MaxMin;

import java.util.Arrays;
import java.util.Scanner;

public class Shortest {
    public static void main(String[] args) {

        String words = "olive, fish, pursuit, old, ggg, war, pyt, java, coffee, cat, ray, ddd";

        String[] arr = words.split(",");
        int min = arr[0].length(); //  same with --->> word.length()
        for (int i = 0; i < arr.length;i++) {
            if (arr[i].length() < min) {
                min = arr[i].length();
            }
        }
        String shortest = "";
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == min) {
                shortest += arr[i];
            }
        }

        String[] result = shortest.trim().split(" ");
        System.out.println(Arrays.toString(result));


    }
}
