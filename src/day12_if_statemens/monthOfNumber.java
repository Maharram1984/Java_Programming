package day12_if_statemens;

import java.util.Scanner;

public class monthOfNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of month ");
        int monthNumber =scan.nextInt();

        if(monthNumber==4 || monthNumber==6 || monthNumber==9 || monthNumber==11){
            System.out.println("Month number " +monthNumber+ " has 30 days ");
        }else if(monthNumber==2){
            System.out.println("Month number " +monthNumber+ " has 28 days ");
        }else if(monthNumber > 0 && monthNumber <=12){
            System.out.println("Month number " +monthNumber+ " has 31 days");
        }

        int month = 7;

        boolean has31Days = month == 1 || month==3 || month==5 || month==7
                || month==8 || month==10 || month==12;

        boolean has30Days = month==4 || month==6 || month==9 || month==11;

        boolean has28Days = month==2;

        if(has31Days){
            System.out.println("31 days ");
        }
        if (has30Days)
        {
            System.out.println("30 days");
        }
        if (has28Days) {
            System.out.println("28 days");
        }













    }
}

