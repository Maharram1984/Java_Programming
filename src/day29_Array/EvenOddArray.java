package day29_Array;

public class EvenOddArray {
    public static void main(String[] args) {
         /* Even and odd from array
    Write a program that can count the even and odd number from an array of integers
    Ex:
    Input: [4,1,3,12,5]
    Output: Even: 2
    Odd: 3
     */
        int[] nums = {4, 1, 3, 10, 5, 6, 7, 8, 9, 2};
        int even = 0;
        int odd = 0;
        String evenNums = "";
        String oddNums = "";

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even++;
                evenNums += nums[i] + " ";
            } else {
                odd++;
                oddNums += nums[i] + " ";
            }
        }

        for (int each : nums) {
            if (each % 2 == 0) {
                even++;
                evenNums += each + " ";
            } else {
                odd++;
                oddNums += each + " ";
            }
        }
        System.out.println("EVEN COUNTER: " + even);
        System.out.println("EVEN NUMBERS: " + evenNums);
        System.out.println("ODD COUNTER: " + odd);
        System.out.println("ODD NUMBERS: " + oddNums);
        System.out.println();
    }
}