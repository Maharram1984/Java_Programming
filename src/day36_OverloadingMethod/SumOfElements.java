package day36_OverloadingMethod;

import my_utilities.StringUtil;

public class SumOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 2};                   // same with -->>(int[]nums)
        System.out.println(summary(arr));

        System.out.println(sum(4, 6, 2, 6, 12, 4));  // var args -->>(int...nums)
        System.out.println(StringUtil.uniqueCharacter("asdfghjklcvbnsdgfhg"));
    }

    public static int sum(int... nums) {
        int sum = 0;
        for (int each : nums) {
            sum += each;
        }
        return sum;
    }

    public static int summary(int [] nums){   // normal version
        int sum = 0;
        for(int each: nums){
            sum += each;
        }
        return sum;
    }
}
