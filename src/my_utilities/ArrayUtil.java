package my_utilities;

public class ArrayUtil {
    /* Min Number create a method that will accept
   an int array and return the smallest number from the array */
    public static int minNumber(int[] nums) {

        int min = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int maxNumber(int[] nums) {
         /* Max Number create a method that will accept
   an int array and return the smallest number from the array */

        int max = nums[0];

        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    /* Contains create a method that will
       accept an int array and an int number.
       Check and return if the given number is in the array. */

    public static boolean contains(int[] nums, int element) {
    /* Contains create a method that will
       accept an int array and an int number.
       Check and return if the given number is in the array. */
        for (int each : nums) {
            if (each == element) {
                return true;
            }
        }
        return false;
    }
    public static int IndexOf(String[] str, String element) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public static int IndexOf(int[] nums, int element) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }
}