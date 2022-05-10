package TASK;

import java.util.Scanner;

public class Quizz2 {
    public static void main(String[] args) {

//
//        int score = 0;
//
//        if (score == 0) {
//            score += 50;
//        }
//        if (score != 0) {
//            score += 50;
//
//        }
//        System.out.println(score);
//
//        char grade = 'A';
//boolean result = true;
//if(result) {
//    System.out.println("It is true");
//}else {
//    System.out.println("It is false");
//}else {
//            System.out.println("none");
//        }

//        boolean a = true;
//        boolean b = !false;
//        if (a) {
//            System.out.println("a");
//        } else if (b) {
//            System.out.println("b");
//        } else {
//            System.out.println("c");
//        }
//        int number = 10;
//        if (--number > 10) {
//            System.out.println("Hello Cydeo " + number);
//        } else if (number == 9) {
//            System.out.println("Hello world " + number);
//        }
//
//        int num = 9;
//        if (num++ == 10) {
//            System.out.println("hello world" + num);
//        } else {
//            System.out.println("hello universe" + num);
//        }
//        boolean x = true;
//        boolean y = !x == false;
//        boolean z = y;
//
//        if (x) {
//            System.out.println("Hello everyone");
//        }
//        if (y) {
//            System.out.println("Today is great day");
//        }
//        if (z) {
//            System.out.println("we are improving everyday");
//        }
//
//        int X = 10;
//        int Y = X++;
//        System.out.println(Y++ + " " + X++ + " " + Y);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter fitst number");
        int num1 = input.nextInt();
        System.out.println("Enter second number");
        int num2 = input.nextInt();
        System.out.println("Enter third number");
        int num3 = input.nextInt();



        if(num1>num2 && num1>num3){
            System.out.println(num1+ "is middle number");
        }else if(num2<num1 && num1>num3){
            System.out.println(num1+ "is middle number");
        }else if (num2>num1 && num2<num3){
            System.out.println(num2+ "is middle number");
        }else if (num2<num1 && num2>num3){
            System.out.println(num2+ "is middle number");
        }else if (num3>num1 && num3<num2){
            System.out.println(num3+ "is middle number");
        }else if (num3<num1 && num3>num2){
            System.out.println(num3+ "is middle number");
        }









    }
}
