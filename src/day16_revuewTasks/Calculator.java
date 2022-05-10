package day16_revuewTasks;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1");
        double numOne = input.nextDouble();
        System.out.println("Pick operators: + - * / %");
        String operator = input.next();
        System.out.println("Enter number2");
        double numTwo = input.nextDouble();
        boolean validCalculator = true;

        double result = 0;

        switch (operator) {
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                if (numTwo != 0) {
                    result = numOne / numTwo;
                } else {
                    System.out.println("Cannot divide by 0");
                    validCalculator = false;
                }
                break;
            case "%":
                if (numTwo != 0) {
                    result = numOne % numTwo;
                } else {
                    System.out.println("Cannot take remainder of 0");
                    validCalculator = false;
                }
                break;
            default:
                System.out.println(operator + " is not valid operators for this  calculator");
                validCalculator = false;

        }

        if (validCalculator) {
            System.out.println(numOne + " " + operator + " " + numTwo + " = " + result);
        }

    }
}
