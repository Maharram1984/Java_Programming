package TASK;

import java.util.Arrays;

public class MultiArraysExample {
    public static void main(String[] args) {


        int[][] numbers = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(numbers[1][1]);   // 6
        System.out.println(numbers.length);  // 3
        System.out.println(Arrays.toString(numbers[1])); // [5, 6, 7, 8]
        System.out.println(Arrays.deepToString(numbers));
                               // [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10, 11, 12]]
        System.out.println(numbers[1][3]);   // 8
     //   EvenOddMultiArray(ev)

    }
}
