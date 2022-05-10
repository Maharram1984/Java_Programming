package day31_ArrayClass;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {

        String[] words = {"a","b","c"};
        System.out.println(Arrays.toString(words));  // [a, b, c]

        System.out.println(String.join("<>", words));   //a<>b<>c
        System.out.println(String.join("[*]", words));  //a[*]b[*]c
        System.out.println(String.join(" ", words));    // a b c
        System.out.println(String.join("", words));     // abc
        System.out.println(String.join("\"", words));   // a"b"c



















    }
}
