package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class removeDuplicates {

     /* Create a method that will take an ArrayList of numbers and remove any
        duplicates values.The method will return a java.util.ArrayList of unique elements.
        Input: {1, 3, 5, 1, 4, 5, 9};
        Output: {3, 4, 9};     */
     public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 3, 5, 1, 4, 5, 9));
        System.out.println(removeDuplicates(nums));

    }
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> numbers) {
        numbers.removeIf(each -> Collections.frequency(numbers, each) > 1);
        return numbers;
    }





}