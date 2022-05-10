package day29_Array;

public class AverageNumbers {
    public static void main(String[] args) {
      /*Average Number from Array
        Given an int array calculate the average number -> Make it flexible so, it will work with any array size
                [1,2,3] -> average: 2
                [10, 15, 5, 6] -> average: 9
                [4, 5, 6, 7, 8, 10, 20, 30, 0] -> average: 10
                */

        int[] nums = {4, 5, 6, 7, 8, 10, 20, 30, 0};  // traditional
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        System.out.println("Average: " + (sum / nums.length));// sum90 / nums.length9 = 10

        System.out.println("----------------------------------");

        int[] number = {1,2,3};                      // for each
        int summary = 0;
        for (int each : number) {
            summary += each;
        }
        System.out.println("Average: " + (summary / number.length)); // 6 / 3 = 2
    }
}
