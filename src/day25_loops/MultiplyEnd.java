package day25_loops;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter the word");
//        String word = input.nextLine();
//        System.out.println("How many times do you want to repeat the ending");
//        int repeatLastLetter = input.nextInt();
        String word = "Hello";
        int repeatLastLetter = 5;

        for(int i = 0; i < repeatLastLetter; i++){
            word += word.charAt(word.length() - 1);
        }

        System.out.println(word);













    }
}
