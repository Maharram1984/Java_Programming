package day11_IF_Else;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int time = input.nextInt();

       // int time =10;
        if(time>=6 && time <=11){
            System.out.println("Good morning");
        }else if(time>=12 && time <=16){
            System.out.println("Good afternoon");
        } else if(time>= 17 && time <= 23){
            System.out.println("Good night");
        }else{
            System.out.println("Go to sleep");
        }


























    }
}
