package day28_Array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double [] arr = new double[4];    // u can not change 4, but can replace 4 to 5 it is possible
        System.out.println(arr.length);            // 4
        System.out.println(Arrays.toString(arr));  // [0.0, 0.0, 0.0, 0.0]

        arr[0] = 30.99;

        System.out.println(Arrays.toString(arr));  //[30.99, 0.0, 0.0, 0.0]
        arr[1] = 12.55;
        arr[2] = 10.20;     //but u can reassign element as many u want
        arr[3] = 5;
        System.out.println(Arrays.toString(arr));    //[30.99, 0.0, 0.0, 0.0]

        arr = new double[5];// u can never change it,u creating new array with 5 element
        System.out.println(Arrays.toString(arr)); //[0.0, 0.0, 0.0, 0.0, 0.0]

        arr[0] = 1;
        arr[1] = 2;     //reassigned second one [1.0, 2.0, 0.0, 0.0, 0.0]
        System.out.println(Arrays.toString(arr));


















    }
}
