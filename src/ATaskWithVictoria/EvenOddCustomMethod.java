package ATaskWithVictoria;

import java.util.ArrayList;
import java.util.Arrays;

public class EvenOddCustomMethod {
    /* Create a method that accepts an int array. Count how many even and odd
       numbers there is. Print an array at the end where the first element is how
       many even numbers there was and the second element in the number of odd
       elements
       Ex:
       input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
       input: ( {1, 3, 5, 2}) -> [ 1, 3 ]  */
    public static void EvenOddArray(int[][] nums) {

        int even = 0;
        int odd = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {

                if (nums[i][j] % 2 == 0) {
                    even++;

                } else {
                    odd++;
                }
            }
            int[] result = {even, odd};
            System.out.println(Arrays.toString(nums[i]) + " -->> " + Arrays.toString(result));
            even = 0;
            odd = 0;
        }
    }

    public static void main(String[] args) {

        int[][] numbers = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        EvenOddArray(numbers);

    }

}