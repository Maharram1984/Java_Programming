package CustomMethodPractice;

public class EvenOddCustomMethod2 {
      /*   create a method that can print odd numbers between 1-100 in the
       same line separated by space
       create a method that can print even numbers between 1-100 in the
       same line separated by space   */

    public static void evenNum(int nums) {
        for (int i = 2; i <= 100; i += 2) {  // PasswordCheck++ or PasswordCheck+=2
            //  if (PasswordCheck % 2 == 0) {
            System.out.print(i + " ");
        }
    }

    public static void oddNum(int nums) {
        for (int i = 1; i <= 100; i += 2) {
            //  if (PasswordCheck % 2 != 0) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        oddNum(5);
        System.out.println();
        evenNum(100);
    }


}
