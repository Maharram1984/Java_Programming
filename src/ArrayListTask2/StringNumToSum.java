package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumToSum {
 /* Create a method that will accept an ArrayList of numbers in String
    format, add each digit of each element and store into a different
    java.util.ArrayList. Return the ArrayList of summed numbers
    Ex:
    Input: “123”, “34”, “513”
    Output: [ 6, 7, 9 ]  */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("123", "34", "513"));
        ArrayList<Integer> result = new ArrayList<>();

       for(String each : list){
           int total = 0;
          for(int i = 0; i < each.length(); i++){             //  String str = "";
           total += Integer.parseInt("" +each.charAt(i));    //  str = ""+each.charAt(PasswordCheck);
          }                                                  //  total +=Integer.parseInt(str);
          result.add(total);
       }
        System.out.println(result);



    }


}
