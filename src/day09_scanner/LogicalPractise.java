package day09_scanner;

public class LogicalPractise {
    public static void main(String[] args) {

        int n = 20;

        System.out.println(n > 5);
        System.out.println(n < 10);
        System.out.println(n > 5 && n < 10); // both have to be true to get true answer


        System.out.println(4 > 3 || false);    //  true || false ---> at least need to be true to get true
        System.out.println(3 > 4 || false);    //  false || false

        System.out.println(!false);  // not !false means true (like opposite)
        System.out.println(!true);   // not !true means false (like opposite)

        System.out.println(4 != 4);  // false
        System.out.println(4 != 5);  // true



    }
}
