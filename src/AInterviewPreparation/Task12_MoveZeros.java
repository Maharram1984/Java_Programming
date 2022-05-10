package AInterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class Task12_MoveZeros {
    /* 12 Move zeros
           int[] arr = {1, 0,0,2,0, 3, 49, 6, 5};
           ArrayList<Integer> list = new ArrayList<>();
           output    [1, 2, 3, 49, 6, 5, 0, 0, 0]   */



    public static void main(String[] args) {

        int[] arr = {1, 0, 0, 2, 0, 3, 49, 6, 5};
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                newArr[count++] = arr[i];
            }
        }
        System.out.println(Arrays.toString(newArr));


    }
}