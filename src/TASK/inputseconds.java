package TASK;

import java.util.Scanner;

public class inputseconds {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int inputSeconds,hours,minutes,seconds;
        System.out.println("Enter soconds: ");
        inputSeconds = input.nextInt();

         hours = inputSeconds/3600;
         minutes = (inputSeconds/60)%60;
         seconds = inputSeconds%60;


        System.out.println("hour " + hours+ " minutes " +minutes+ " seconds " +seconds);
    }
}
