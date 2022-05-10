package day21_loops;

public class PrintNumbers {
    public static void main(String[] args) {

       /*
        print all the even numbers from 1 to 100, on separate lines
        print all the odd numbers from 1 to 100, but all in one line with spaces between each number
     */
        int n = 1;

        while (n <= 30) {                    // numbers  whatever u want
            System.out.print(n+ " ");
            n += 5;
        }

        System.out.println();
        // approach 2:

        int i = 1;
                                   // even numbers
        while (i <= 30) {

            if (i % 2 == 0) {
                System.out.print(i+ " ");
            }
            i++;
        }

        System.out.println();


        // odd numbers

        int a =0;

        while (a <= 10) {
            System.out.print(a + " ");             // numbers  whatever u want
            a += 2; //
        }


        System.out.println();
        // approach 2

        int b = 0;

        while (b++ < 20) {                              // odd numbers
            if (b % 2 == 1) {
                System.out.print(b + " ");
            }
        }

       /* flow:
        b = 0
        b++ <= 100 --> 0 <= 100 --> loop runs and b increments to 1
        if (b % 2 == 1) --> 1 % 2 == 1 --> true ->prints number

        while (b++ <= 100) --> 1 <= 100 --> loop runs and b increments to 2
        if (b % 2 == 1) --> 2 % 2 == 1 --> false ->nothing happens

        while (b++ <= 100) --> 2 <= 100 ->loop runs and b increments to 3
                */
    }
}
