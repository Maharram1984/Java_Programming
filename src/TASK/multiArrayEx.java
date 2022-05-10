package TASK;

import java.util.Arrays;

public class multiArrayEx {
    public static void main(String[] args) {
      /*  Given a 2D array with values:
        {3, 5, 1}
        {1, 6, 10}
        {5, 21, 10}
        Calculate and find the biggest diagonal
        if an array was
        a b c
        d e f
        g h PasswordCheck
        aei and ceg would be the diagonals  */

        int[][] dgl = {{3, 5, 1},
                      {1, 6, 10},
                      {5, 21, 10}};
        int first = dgl[0][0] + dgl[1][1] + dgl[2][2];
        int second = dgl[0][2] + dgl[1][1] + dgl[2][0];
        if (first > second) {
            System.out.println("First diagonal is bigger " + first);
        } else {
            System.out.println("Second diagonal is bigger " + second);
        }
        System.out.println();

        System.out.println();
    /*  Given two 2D arrays multiply them together and store the
        results into a new 2D array. Multiply each number in each position as its own calculation
 	{1, 2, 3}        {10, 4, 3}                 {10, 8, 9}
	{2, 5, 10}   X   {5, 3, 7}      Output:     {10, 15, 70}
	{0, 3, 20}       {100, 20, 5}               {0, 60, 100}   */

        int[][] jacky = {{1, 2, 3}, {2, 5, 10}, {0, 3, 20}};
        int[][] chan = {{10, 4, 3}, {5, 3, 7}, {100, 20, 5}};

        int[][] result = new int[jacky.length][chan.length]; // [3][3] should be ok

        for (int i = 0; i < jacky.length; i++) {
            for (int j = 0; j < chan.length; j++) {
                result[i][j] += jacky[i][j] * chan[i][j];
            }
        }
        System.out.println(Arrays.deepToString(result));
        System.out.println();

      /*  Create an empty 2D array with size 10 and each inner array with size 10.
          Fill the elements with the 2D array with numbers from 1 to 100 where each array
          starts from the number after the last number in the previous array.
          The goal is to print the numbers of 1-10, 11- 20, 21-30, etc.. until the end on separate lines
          Ex:
	      1, 2, 3, 4, 5, 6, 7, 8, 9, 10
	      11, 12, 13, 14, 15, 16, 17, 18, 19, 20
	      21, 22, 23, 24, 25, 26, 27, 28, 29, 30     etc.....  */

        int[][] numbers = new int[10][10];
        int num = 1;
        for (int i = 0; i < numbers.length; i++) {

            for (int j = 0; j < numbers.length; j++) {
                numbers[i][j] = num++;
            }
            System.out.println(Arrays.toString(numbers[i]));
        }












    }
}