package ATaskWithRashid;

import java.util.Arrays;

public class MethodEvenOddArrayRashid {
    /* Create a method that accepts an int array. Count how many even and odd
     numbers there is. Print an array at the end where the first element is how
     many even numbers there was and the second element in the number of odd
     elements
     Ex:
     input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
     input: ( {1, 3, 5, 2}) -> [ 1, 3 ]    */
    public static void Rashid(int[][] num) {
        int even = 0;
        int odd = 0;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
               if (num[i][j] % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        int[] result = {even, odd};
        System.out.println(Arrays.toString(num[i])+ " -->> "+Arrays.toString(result));
        even = 0;
        odd = 0;
    }
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3,4,5,6,7,8,9},{1,2,3,4,5}};
        Rashid(a);
    }


}



