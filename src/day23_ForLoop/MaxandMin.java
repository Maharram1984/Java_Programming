package day23_ForLoop;

import java.util.Scanner;

public class MaxandMin {
    public static void main(String [] args){

        Scanner input = new Scanner(System.in);
        int max = 0;
        int min = 0;
        int iteration = 0;

        while (iteration < 5){
            iteration++;
            System.out.println("Enter a number");
            int number = input.nextInt();
            if(number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
        }
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);


























    }
}
