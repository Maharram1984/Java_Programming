package TASK;

import java.util.Scanner;

public class ScannerScan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter my age ");
        int num1 = input.nextInt();

        System.out.println("Enter my birthday ");
        double num2 = input.nextDouble();

        System.out.println("Enter your city ");
        String str = input.next();

        input.nextLine();               // extra line needs to write whole sentence after all those

        System.out.println("Enter your full name ");
        String str1 = input.nextLine();

        System.out.println("num1 = " +num1);
        System.out.println("num2 = " +num2);
        System.out.println("str = " +str);
        System.out.println("str1 = " +str1);






    }
}