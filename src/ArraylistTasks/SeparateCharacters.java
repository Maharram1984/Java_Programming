package ArraylistTasks;

import PrimitiveDataTypes.Char;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateCharacters {

    /* Write a program that can extract the special characters, digits and letters
      from a string and stores them into separate ArrayLists of Characters
      Ex:
      str = "ABCD123$%#@&456EFG!"
      list1: {$, %, #, @, &, !}
      list2: {A, B, C, D, E, F, G}
      list3: {1, 2, 3, 4, 5, 6}    */
    public static void main(String[] args) {

      ArrayList<Character> list1 = new ArrayList<>();
      ArrayList<Character> list2 = new ArrayList<>();
      ArrayList<Character> list3 = new ArrayList<>();
      String str = "ABCD123$%#@&456EFG!";

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if(!Character.isUpperCase(letter) && !Character.isDigit(letter)){
                list1.add(letter);
            }
            if(Character.isUpperCase(letter)){
                list2.add(letter);
            }
            if(Character.isDigit(letter)){
                list3.add(letter);
            }
        }
        System.out.println("list1: " +list1);
        System.out.println("list2: " +list2);
        System.out.println("list3: " +list3);












    }
}
