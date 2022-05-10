package day32_Arrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {

        String []str1 = {"m", "a", "h", "a", "r", "r", "a", "m"};
        Arrays.sort(str1);
        System.out.print(Arrays.toString(str1));
        System.out.println();

        int[] arr = {30,90,60,360,180};
        int[] arr2 = {180,360,30,90,60};

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Before sorting:" +Arrays.equals( arr,arr2)); //false

        Arrays.sort(arr);      // from smallest to bigger
        Arrays.sort(arr2);     // from smallest to bigger

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("After sorting:" +Arrays.equals( arr,arr2)); //true

        String [] words = {"hello","java","Saturday"};
        System.out.println(String.join(" + ", words));   //hello###java###Saturday

        String str = "Today is Saturday";
        System.out.println(Arrays.toString(str.toCharArray())); // [T, o, d, a, y,  , PasswordCheck, s,  , S, a, t, u, r, d, a, y]
                                                                                 // returns to char
        System.out.println(Arrays.toString(str.split(" ")));  // [Today, is, Saturday] -->> returns to String















    }
}
