package day18_StringMethods;

import java.util.Locale;

public class RecapMethods2 {
    public static void main(String[] args){

        String str = "Wooden Spoon";
        System.out.println(str.toUpperCase()); // -->> wooden spoon
        System.out.println(str.toLowerCase()); // -->> WOODEN SPOON
        System.out.println(str);               // -->> Wooden Spoon --immutable

        String word = "HELLO";
        word = word.toLowerCase();
        System.out.println(word);    // hello

        int a = 5;
        a++;
        a += 5;
        System.out.println(a);

        String word2 = word + "World";
        System.out.println(word2);   //helloWorld
        System.out.println(word);    //hello   -->> immutable

        word += " new text";
        System.out.println(word);    //hello new text

        String old = "mark";
        String newValue = old.toUpperCase();
        System.out.println(old);       //mark
        System.out.println(newValue);  //MARK





















    }
}
