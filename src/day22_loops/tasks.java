package day22_loops;

import java.util.Scanner;

public class tasks {
    public static void main(String[] args) {
//
//    int num = 2;
//
//    while(num <= 20){
//        System.out.print(num+ " ");
//        num +=2;
//    }
//        int number = 1;
//        String even = " ";
//
//        while (number <= 20) {
//            if (number % 2 == 0) {
//                even += number + " ";
//            }
//            number++;
//        }
//
//        System.out.println(even.trim());
//
//
//        int number2 = 1;
//        String old = " ";
//
//        while (number2 <= 20) {
//            if (number2 % 2 != 0) {
//                old += number2 + " ";
//            }
//            number2++;
//        }
//
//        System.out.println(old.trim());
//
//
//
//    int num1 = 1;
//
//    while (num1 < 20){
//        System.out.print(num1+ " ");
//        num1 += 2;
//    }
//
//        Scanner scan = new Scanner(System.in);
//        int inhabitants = scan.nextInt();
//        //WRITE YOUR CODE HERE:
//
//        int day = 0;
//
//        while(inhabitants >= 1){
//            System.out.println("Day "+day+ " ["+inhabitants+"]");
//            day++;
//            inhabitants = inhabitants /2;
//        }
//        System.out.println("---- EXTINCT ----");
//

        Scanner scan = new Scanner(System.in);
        System.out.println("enter a number");
        int numb = scan.nextInt();
        int result = 2;                                                                                                   //<---starting number

        while (numb > 1) {                                                                                            //<--- calculating ends by reaching this num
            result *= numb;
            numb--;
        }
        System.out.println(result);
        System.out.println();















    }
}
