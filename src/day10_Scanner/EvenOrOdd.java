package day10_Scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number " );
        int num = scanner.nextInt();

        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;         // num % 2 == 1

        System.out.println(num + " is even number: " +isEven);
        System.out.println(num + " is odd number: " +isOdd);



    }
}
