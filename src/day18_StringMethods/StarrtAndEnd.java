package day18_StringMethods;

public class StarrtAndEnd {
    public static void main(String[] args) {

        String str = "Apples";                       //returns to boolean
        System.out.println(str.startsWith(  "App"));   // true
        System.out.println(str.startsWith(" App"));   // false
        System.out.println(str.startsWith("Apples"));// true

        String s = "A";                              // true--->>>
        System.out.println(str.startsWith(s));       // does the String str start with the String s ?
        System.out.println(str.startsWith("Aoo"));   // false

String sentence = "today was a fun day!";
        System.out.println(sentence.endsWith("!"));
        System.out.println(sentence.endsWith(" day!"));
        System.out.println(sentence.endsWith("day"));
        System.out.println(sentence.endsWith("today was a fun day!"));



















    }
}
