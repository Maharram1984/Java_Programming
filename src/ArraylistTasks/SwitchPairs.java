package ArraylistTasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchPairs {
    /* Given an ArrayList of words switch position for  each pair in the List.
       A pair is an element and the element next to it. The given ArrayList
       will always have an even number of elements so each element will
       always have a single pair.
            Ex:
      Input: {"Cat", "in", "the", "hat"}
      There is two pairs:
            "Cat" and "in"
            "the" and "hat"
      Output: {"in", "Cat", "hat",the”}  */
    public static void main(String[] args) {

        ArrayList<Character> word = new ArrayList<>(Arrays.asList('A','J','A','V'));
        for (int i = 0; i < word.size(); i+=2) {
            word.add(i,word.remove(i+1));
        }
        System.out.println(word);
        ArrayList<String> arr = new ArrayList<>(Arrays.asList("Cat", "in", "the", "hat"));

        for (int i = 0; i < arr.size(); i+=2){

            String temp = arr.get(i);
            arr.set(i, arr.get(i+1));
            arr.set(i+1,temp);
        }
        System.out.println(arr);






    }
}
