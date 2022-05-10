package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries2 {
    public static void main(String[] args) {
         /* Create a method that will take an ArrayList of countries and
       returns an ArrayList of countries that have a length of less than 7
       Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
       Output: "Japan", "Korea", "Turkey", "Canada"  */

        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea",
                "United States", "Turkey", "United Kingdom", "Canada"));
        ArrayList<String> result = new ArrayList<>();
        String a = "";

        for (String each : countries){
            if (each.length() < 7){
                result.add(each);
                a += each + " ";
            }
        }
        System.out.println(result);
        System.out.println(a);







    }
}
