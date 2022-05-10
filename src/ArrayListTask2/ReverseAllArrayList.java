package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseAllArrayList {
  /*  Create a method that will take an ArrayList of Strings and reverse
      each element and return an ArrayList of all reversed words
      Ex:
      Input: {"ted", "talk", "learn"}
      Output: {"det", "klat", "nrael"}   */

    public static void main(String[] args) {

        System.out.println(reverseAllWords());
    }

    public static ArrayList<String> reverseAllWords() {

        ArrayList<String> list = new ArrayList<>(Arrays.asList("ted", "talk", "learn"));
        ArrayList<String> reversAll = new ArrayList<>();

        for (String each : list) {
            String str = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                str += each.charAt(i);
            }
            reversAll.add(str);
        }
        return reversAll;
    }
}