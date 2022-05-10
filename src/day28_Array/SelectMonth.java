package day28_Array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter month number");
        int monthNum = input.nextInt();

        String[] months = {"January","February","March","April","May","June","July","August",
        "September","October","November","December"}; // by adding "", "January"
        System.out.println(months[monthNum-1]); // also can add "", before January it is same with -1




















    }
}
