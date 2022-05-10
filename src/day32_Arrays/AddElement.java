package day32_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        /* Have a starting array
           you want to add a number to the end
           so make your array bigger to store the new number
           Ex:
           {45, 123, 62}
           adding 100
           {45, 124, 62, 100}*/
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want to start with?");
        int size = scan.nextInt();
        int[] nums = new int [size];

        for (int i = 0; i < nums.length; i++) {
            System.out.println("enter your number " + (i + 1));
            nums[i] = scan.nextInt();
        }
        System.out.println("Arrays so far: " + Arrays.toString(nums));
        int [] expand = Arrays.copyOf(nums,nums.length + 3);
        System.out.println("Enter your last number");
        expand[expand.length - 1] = scan.nextInt();

        System.out.println(Arrays.toString(expand));




    }
}
