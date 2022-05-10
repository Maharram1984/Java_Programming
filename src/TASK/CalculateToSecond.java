package TASK;

import java.util.Scanner;

public class CalculateToSecond {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Scanner scan = new Scanner(System.in);
        System.out.println("enter number");
        int inputsecond = scan.nextInt();

        int hour= 60;
        int minute= 60;
        int second=60;
        int inputsecond1 = inputsecond % hour;
        int inputsecond2 = inputsecond / minute;
        int inputsecond3 = inputsecond2 % second;
        inputsecond2 = inputsecond2 / second;
        System.out.println(inputsecond2+ "hour "+inputsecond3+ " minute " +inputsecond1+ " second ");










    }






}
