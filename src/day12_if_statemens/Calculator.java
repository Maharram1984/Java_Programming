package day12_if_statemens;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
                     /* create a class Calculator
        - do it without Scanner
        declare and assign 2 number variables
        declare and assign a char variable for an operator
        create a calculator based on the operator picked
        + : add num1 and num2
        - : minus num1 and num2
* : multiply num1 and num2
/ : divide num1 and num2
        any other char: "invalid operator" */


        int num1 = 90;
        int num2 = 5;
        char operator = '/';

        if (operator == '+'){
            System.out.println(num1 + num2);
        }else if(operator == '-'){
            System.out.println(num1 - num2);
        }else if (operator == '*'){
            System.out.println(num1 * num2);
        }else if (operator == '/'){
            System.out.println(num1 / num2);
        }































    }
}
