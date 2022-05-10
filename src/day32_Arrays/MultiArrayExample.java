package day32_Arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5,10,20,10};
        int [] m = {5,10,100,39,19};

        int[][] all = {n,m};
        System.out.println(Arrays.toString(all));  //[[I@2f7c7260, [I@2d209079]
        System.out.println(Arrays.deepToString(all)); //[[5, 10, 20, 10], [5, 10, 100, 39, 19]]

        System.out.println("First array: " + Arrays.toString(all[0])); // First array: [5, 10, 20, 10]
        System.out.println("Second array: " + Arrays.toString(all[1])); // [5, 10, 100, 39, 19]

        System.out.println(Arrays.toString(n));             // [5, 10, 20, 10]
        System.out.println(Arrays.toString(m));             //  [5, 10, 100, 39, 19]
        System.out.println();

        int [][] multi = {        // multidimensional
                {90,80,70},       // index 0 array
                {19,51,1129,12},  // index 1 array
                {10,1900},        // index 2 array
                {14}              // index 3 array
        };
        System.out.println(multi.length);    // 4   -->> total of indexes
        System.out.println(multi[0].length); // 3   -->> 3rd index
        System.out.println(multi[3].length); // 1   -->> 1st index
        System.out.println(multi[0][1]);     // 80  -->> 0 index 1 element is 80
        System.out.println(multi[3][1]);     //Error out of bounds -->> because 14 is alone here















    }
}
