package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome {
    public static void main(String[] args) {
    /*  Create a method that will accept an ArrayList of Strings and return a java.util.ArrayList
        of Palindrome Strings Ignore case sensitivity
        Input:
        "Anna",  "Java",  "Python", "Racecar", "Level", "Cydeo”, "Eye"
        Output:
        Anna, Racecar, Level, Eye  */

        ArrayList<String> list = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        ArrayList<String> reversed = new ArrayList<>();
        String palindrome = "";

      for (String each : list){
          String str = "";
          for (int i = each.length() - 1; i >= 0; i--) {
              str += each.charAt(i);
          }
          if (str.equalsIgnoreCase(each)){
              reversed.add(str);
              palindrome += each + ", ";
          }
        }
        System.out.println(reversed);
        System.out.println(palindrome);

    }
}