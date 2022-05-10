package day32_Arrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {

        int [] nums = {4,10,30,100};
        System.out.println(Arrays.binarySearch(nums, 4));   // 0
        System.out.println(Arrays.binarySearch(nums, 100)); // 3
        System.out.println(Arrays.binarySearch(nums, 200)); // - 5
        System.out.println(Arrays.binarySearch(nums, 90));   // - 4
        System.out.println(Arrays.binarySearch(nums, 20));  // - 3
        System.out.println(Arrays.binarySearch(nums, 6));   // - 2
        System.out.println(Arrays.binarySearch(nums, 0));   // - 1
        System.out.println(Arrays.binarySearch(nums, -5));  // - 1















    }
}
