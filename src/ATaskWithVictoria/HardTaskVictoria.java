package ATaskWithVictoria;

import day2_04_11_2022.ArrayVsArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class HardTaskVictoria {
    public static Integer[] fix45(Integer [] arr){
  /*  (This is a slightly harder version of the fix34 problem.) Return an array
       that contains exactly the same numbers as the given array, but rearranged
       so that every 4 is immediately followed by a 5. Do not move the 4's, but
       every other number may move. The array contains the same number of 4's and 5's,
       and every 4 has a number after it that is not a 4. In this version, 5's may
       appear anywhere in the original array.
    fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
    fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
    fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]    */

        ArrayList<Integer> temp = new ArrayList<>(Arrays.asList(arr));
        temp.removeAll(Arrays.asList(4, 5));
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] == 4 && arr[i + 1] != 5){
                arr[i + 1] = 5;
            } else if(arr[i + 1] == 5 && arr[i] != 4){
                arr[i + 1] = temp.get(count);
                count++;
            } else if( i == 0 && arr[i] == 5){
                arr[i] = temp.get(count);
                count++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {

        Integer [] arr = {5, 4, 9, 4, 9, 5};
        System.out.println(Arrays.toString(fix45(arr)));

            }
        }


//    public static int[]fix45(int []nums){
//        int temp=0;
//        for (int PasswordCheck = 0; PasswordCheck < nums.length ; PasswordCheck++) {
//
//
//            if(nums[PasswordCheck]==4 && nums[PasswordCheck+1]!=5){
//
//                for (int j = 0; j < nums.length; j++) {
//                    if(nums[j]==5 && j==0){
//                        temp=nums[PasswordCheck+1];
//                        nums[PasswordCheck+1]=nums[j];
//                        nums[j]=temp;
//
//                    }else if(nums[j]==5 && nums[j-1]!=4){
//                        temp=nums[PasswordCheck+1];
//                        nums[PasswordCheck+1]=nums[j];
//                        nums[j]=temp;
//                    }
//                }
//            }
//
//        }
//
//        return nums;

