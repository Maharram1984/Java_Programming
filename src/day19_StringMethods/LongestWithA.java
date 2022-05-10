package day19_StringMethods;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
       /* create a class LongestWithA
        ask the user to enter 3 String inputs. Find and print the longest word
        that also contains 'a'
        Ex:
        "java"
        "mouse"
        "computer"
        Output: java
        Challenge: Instead of just checking for "a" add another variable that can
        be used to check for any character.*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words");
        String first = input.next().toLowerCase();
        String second = input.next().toLowerCase();
        String third = input.next().toLowerCase();

        String longestWord = "";


        if (first.contains("a") && first.length() > longestWord.length()) {
            longestWord = first;
        }
        if (second.contains("a") && second.length() > longestWord.length()) {
            longestWord = second;
        }
        if (third.contains("a") && third.length() > longestWord.length()) {
            longestWord = third;
        }
        System.out.println(longestWord.isEmpty() ? " No single largest word with a "
                : longestWord + " is the longest word with a ");


        // todo stupid day24_Loops.SwitchInLoop.task
    }}