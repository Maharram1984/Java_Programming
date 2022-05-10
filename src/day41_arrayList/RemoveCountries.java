package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveCountries {
    /* Create a method that will take an ArrayList of countries and
       returns an ArrayList of countries that have a length of less than 7
       Input: "Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"
       Output: "Japan", "Korea", "Turkey", "Canada"  */
    public static void main(String[] args) {
        ArrayList<String> countries = new ArrayList<>(Arrays.asList("Japan", "Korea", "United States", "Turkey", "United Kingdom", "Canada"));
        ArrayList<String> result = new ArrayList<>();
        for (String each : countries){
            String str = "";
            if(each.length() < 7){
                str = each;
                result.add(str);
            }

        }
        System.out.println(result);
        System.out.println(removeCountries(countries,7));
    }
    public static ArrayList<String> removeCountries (ArrayList<String> country,int num){
        country.removeIf(each -> each.length() > 7);
       return country;
    }
}