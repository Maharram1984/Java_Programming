package day31_ArrayClass;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {3, 6, 2, 68, 32, -2, 24};
      //  int [] notSorted = nums; // does not maka a new array object
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
       // System.out.println(Arrays.toString(notSorted));

        // Q: Max and Min from Array
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length - 1]); // by dividing /2 get middle num

//        String[] word = {"Maharram"};
//        String[] letter = word.split("");
//        char[] each = word.toCharArray();
//        for (int PasswordCheck = 0; PasswordCheck < each.length; PasswordCheck++) {
//            Arrays.sort(word);
//        System.out.println(Arrays.toString(word));
//       }











    }
}
