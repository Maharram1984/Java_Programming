package AInterviewPreparation;

public class Task16_ReminderNumber {
    /*//16  USE WHILE LOOP
        int num1=5;
        int num2=2;
      output
5 divided by 2 is: 2 and remainder is  */


    public static void main(String[] args) {
        int num1 = 34;
        int num2 = 3;
        System.out.print(num1 + " divided by " + num2 + " is: ");
        int count = 0;
        while (num1 >= num2) { // for (int i = num1; i >= num2; i -= num2)
            num1 -= num2;
            count++;
        }
        System.out.println(count + " and remainder is " + num1);

    }
}