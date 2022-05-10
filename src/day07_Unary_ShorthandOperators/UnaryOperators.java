package day07_Unary_ShorthandOperators;

public class UnaryOperators {
    public static void main(String[] args) {

        int x = 0;
        System.out.println(x);   // 0

        x = x + 1;                            //Todo: Why??
        System.out.println(x);   //1

        x++; // post increment
        System.out.println(x);   // 2

        ++x; // pre increment
        System.out.println(x);   // 3

        System.out.println(++x); // 4

        System.out.println(x++); // statement is run first because it is a post increment we will see 4

        System.out.println(x);  // 5





















    }








}
