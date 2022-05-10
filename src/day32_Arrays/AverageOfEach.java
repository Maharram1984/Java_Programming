package day32_Arrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {

        int[][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };
        for (int[] eachArray : nums) {
            //  System.out.println(Arrays.toString(eachArray));

            double sum = 0;
            for (int eachNumber : eachArray) {
                //   System.out.println(eachNumber);
                sum += eachNumber;

            }
    System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum /eachArray.length));
        }
         /*  [3, 4, 5, 6] the average is: 4
             [5, 2, 6] the average is: 4
             [10, 20, 30] the average is: 20 */

    }
}

//        int [][] arr = {{3,4,5,6}, {5,2,6}, {10,20,30}};
//        int res = 0;
//        int count = 0;
//
//        for (int [] innerArray: arr){
//            for(int eachNum: innerArray){
//                res += eachNum;
//            }
//            System.out.println(res/arr[count].length);
//            res = 0;
//            count++;