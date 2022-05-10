package day41_arrayList;

import day40_ArrayList.ArrayListWithMethods;
import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAll {
    /*  Create a method that will take an ArrayList of Strings and reverse
      each element and return an ArrayList of all reversed words
      Ex:
      Input: {"ted", "talk", "learn"}
      Output: {"det", "klat", "nrael"}   */

    public static ArrayList<String> reverseAllWords(ArrayList<String> list) {

        ArrayList<String> reverseWords = new ArrayList<>();

        for (String each : list) {
            reverseWords.add(StringUtil.reverse(each));
        }
        return reverseWords;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        System.out.println(reverseAllWords(list));

        System.out.println(reverseAllWords(ArrayListWithMethods.getDaysOfWeek()));
    }
}