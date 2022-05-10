package day07_Unary_ShorthandOperators;

public class IncrementExample3 {
    public static void main(String[] args) {

          int ii = 5;
          int zz = ++ii;

          System.out.println(ii);             // 6
          System.out.println(zz);              //6  pre increment right away

          int A = 5;
          int B= A++;

          System.out.println(A);                // 6
          System.out.println(B);                // 5              post increment

        int a = 5;                      //TODO: check it again
        int b = a + 1;

        System.out.println(a);  // 5
        System.out.println(b);  // 6

        int c = ++a;

        System.out.println(a);       // 6============ a was 5 and added 1 so it is now 6
        System.out.println(c);        // 6



    }
}
