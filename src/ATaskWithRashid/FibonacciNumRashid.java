package ATaskWithRashid;

import java.util.Arrays;

public class FibonacciNumRashid {
    /*Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
      Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous
      2 numbers Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd
      value is 1           Input:
                            8
                        Output:
                            0, 1, 1, 2, 3, 5, 8, 13, 21
                                index           Values
                                 0               0
                                 1               1
                                 2               1    index0+index1
                                 3               2    index1+index2
                                 4               3    index2+index3
                                 5               5    index3+index4
                                 6               8    index4+index5
                                 7               13   index5+index6
                                 8               21   index6+index7  */

    public static int [] fibonacci(int num){

        int[]arr = new int[num+1]; // 8 + 1 now we have 9 times 0.
        arr[1] = 1; // arr[1] = 1 means index of 1 = 1,index of 0 will stay 0.It will start from 0,1,0,0,0,0,0,0,0

        for (int i = 2; i < arr.length; i++) {  // Started from 2nd VALUE Which is 1 here

            arr[i] = arr[i-1] + arr[i-2];        //arr[PasswordCheck] = 0,   1,    1
                                               //arr[PasswordCheck-1] = 1 + arr[PasswordCheck-2] = 0  answer is 1
        }
        return arr;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibonacci(8)));
    }
}
