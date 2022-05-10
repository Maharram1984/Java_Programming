package day41_arrayList;

import day40_ArrayList.ArrayListWithMethods;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumToSum2 {
    /* Create a method that will accept an ArrayList of numbers in String
    format, add each digit of each element and store into a different
    java.util.ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input: “123”, “34”, “513”
    Output: [ 6, 7, 9 ]  */

    public static ArrayList<Integer> sumFromString(ArrayList<String> list){

        ArrayList<Integer> sums = new ArrayList<>();

        for (String each : list ){
            int currentSum = 0;
            for (String eachDigit :each.split("")){
                currentSum +=Integer.parseInt(eachDigit);
            }
            sums.add(currentSum);
        }
        return sums;
    }

    public static void main(String[] args) {
         ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        System.out.println(sumFromString(list));
    }
}
