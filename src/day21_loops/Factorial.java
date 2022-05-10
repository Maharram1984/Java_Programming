package day21_loops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {


        int n = 5;
        int result = 1;

        // 5 * 4 * 3 * 2 * 1
        // repeated action: multiply the numbers by one less than it
        // stopping point: number gets to 1

        while (n > 0) {
            System.out.print(n+"*");
            result *= n; // result = result * n
            n--;
        }
        System.out.println("="+result);
}
}