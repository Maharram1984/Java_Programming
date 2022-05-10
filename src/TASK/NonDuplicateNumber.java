package TASK;

import java.util.Scanner;

public class NonDuplicateNumber {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};
//
//        //WRITE YOUR CODE BELOW:
//
//
//        for (int PasswordCheck = 0; PasswordCheck < nums.length; PasswordCheck++) {
//            int nonDupNum = nums[PasswordCheck];
//            int count = 0;
//
//            for (int j = 0; j < nums.length; j++) {
//                int dupNum = nums[j];
//                if(nonDupNum == dupNum){
//                    count++;
//                }
//            }
//            if (count == 1) {
//
//                System.out.println("nonDupNum = " + nonDupNum);
//
//            }
//        }
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //TYPE YOUR CODE BELOW:
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i++){  // for (String each : arr)
            System.out.println(arr[i]);       // sout(each)
        }











    }
}
