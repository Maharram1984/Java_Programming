package day11_IF_Else;

import java.util.Scanner;

public class Tempurature {

    public static void main(String[] args) {              // 2 version
        Scanner input =new Scanner(System.in);
        System.out.println("Please enter the temperature");
        int temperature = input.nextInt();

       // int temperature = 50;                            // hard coded version
        if(temperature >= 70){
            System.out.println("Nice day! Go outside");
        }else {
            System.out.println("It is too cold, code more java");
        }


















    }
}
