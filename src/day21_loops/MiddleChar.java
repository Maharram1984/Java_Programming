package day21_loops;

import java.util.Scanner;

public class MiddleChar {
    public static void main(String[] args) {

        String a = "madrid";

        int mid = a.length() /2;

        if (a.length() % 2 == 0) {

            char firstMiddle = a.charAt(mid -1);
            char secondMiddle = a.charAt(mid);
            System.out.println("With charAt: " +firstMiddle+secondMiddle);
           // System.out.println("With substring: " + a.substring(mid - 1, mid + 1));
        } else {
            char middle =a.charAt(mid);    // word is odd length
            System.out.println("With charAt: " +mid);
         //   System.out.println("with substring: " +a.substring(mid,mid+1));

        }

        String g = "maharram";
        String b = "humay";

        int c = g.length()/2;
        int h = b.length()/2;

        System.out.println("even num: " +g.substring(c-1,c+1).toUpperCase());
        System.out.println("odd num: " +b.substring(h,h+1).toUpperCase());


        //DO NOT TOUCH BELOW
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        //WRITE YOUR CODE HERE
        if (word.toLowerCase().startsWith("x") && word.toLowerCase().endsWith("x")) {
            System.out.println(word.substring(1, word.length() - 1));
        }
        else if (word.toLowerCase().startsWith("x")) {
            System.out.println(word.substring(1));

        }


    }
}
