package TASK;

import java.util.Scanner;

public class middleNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter fitst number ");
        int num1 = input.nextInt();
        System.out.println("Enter second number ");
        int num2 = input.nextInt();
        System.out.println("Enter third number ");
        int num3 = input.nextInt();

        if(num1>num2 && num1<num3){
            System.out.println(num1+ "Middle number");
        }
        if(num1<num2 && num1>num3){
            System.out.println(num1+ "middle number");
        }
        if (num2>num1 && num2<num3){
            System.out.println(num2+ "Middle number");
        }
        if (num2<num1 && num2>num3){
            System.out.println(num2+ "Middle number");
        }
        if (num3>num1 && num3<num2){
            System.out.println(num3+ "Middle number");
        }
        if (num3<num1 && num3>num2){
            System.out.println(num3+ "Middle number");
        }








//        if(num1 > num2 | num2 > num3 | num1 < num3){
//            System.out.println(num2+ " is middle number ");
//        }else if(num2 > num1 | num1 < num3 | num2 < num3){
//            System.out.println(num1+ " is middle number ");
//        }else{
//            System.out.println(num3+ " is middle number ");
//        }
    }
}
