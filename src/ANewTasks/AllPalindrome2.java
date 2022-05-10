package ANewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AllPalindrome2 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Anna", "Java", "Python", "Racecar", "Level", "Cydeo", "Eye"));
        System.out.println(IsPalindrome(names));
    }

    public static ArrayList<String> IsPalindrome(ArrayList<String> list) {
        ArrayList<String> palindrome = new ArrayList<>();

        for (String each : list) {
            String str = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                str += each.charAt(i);
            }
            if (str.equalsIgnoreCase(each)) {
                palindrome.add(each);
            }
        }
        return palindrome;
    }


}