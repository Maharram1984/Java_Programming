package day31_ArrayClass;

import java.util.Arrays;
import java.util.Locale;

public class SortStringExamole {
    public static void main(String[] args) {

        String [] arr = {"  java", "Hello", "$Dollar", "Zell", "4four", "five5", "Zebra", "SIX", "6six", "Hi"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[  java, $dollar, 4four, 6six, hello, hi, six, zebra, zell, five5]


        int [] a = {1, 2, 3};
        int [] b = {1, 2, 3};
        int [] c = a;

        System.out.println(a == b); // compare "a" array with the "b" array, they are different objects -- not the same
        System.out.println(Arrays.equals(a,b));
        System.out.println(a == c); // compare "a" array with the "c" array, they are both reference to the same array object
        //System.out.println(a.equals(b)); This method is not Arrays.equals()

        boolean same = Arrays.equals(a, b);
        System.out.println(same);

        int [] d = {3, 2, 1};
        System.out.println(Arrays.equals(a, d));

//        int [] d = {3, 2, 1};
//        Arrays.sort(d);                     // Arrays.sort(d);  // maybe sort first then equals
//        System.out.println(Arrays.toString(d));














    }
}
