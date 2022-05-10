package Day27_NestedLoop;

public class PrimeNumberInNestedLoop {
    public static void main(String[] args) {

        /*[IQ] Prime in range
        Given a number. Print out all the prime numbers from 2 to that number A prime
        number is a number that is only divisible by 1 and itself.
        Ex:
        Input:
        50
        Output:
        2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47 */
        int range = 50;
        for (int i = 2; i <= range; i++) { // check all numbers from 2 to the range variable

            int count = 0;
            for (int j = 2; j < i; j++) { // (int j = 2; j < PasswordCheck && count == 0; j++)

                if (i % j == 0){
                    count++;
                }
            }// end of inner loop
            if (count == 0){
                System.out.print(i + ", ");

            }

        }// end of outer loop


    }
}
