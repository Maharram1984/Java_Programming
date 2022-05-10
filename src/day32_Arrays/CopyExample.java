package day32_Arrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {

        int[] a = {1, 2, 3};
        int[] b = a;  // b is a new reference/name but the array is the same as the
                      // one 'a' reference/name is pointing to, so there is only one array made
        System.out.println(Arrays.toString(a));   // [1, 2, 3]
        System.out.println(Arrays.toString(b));   // [1, 2, 3]
        a [0] = 100;
        a [1] = 100;
        b [1] = 200;
        System.out.println(Arrays.toString(a));    // [100, 200, 3]
        System.out.println(Arrays.toString(b));    // [100, 200, 3]

        int [] z = Arrays.copyOf(a, a.length);     // b, a are the same u can choose both even mix here
        System.out.println(Arrays.toString(z));    // [100, 200, 3]

        z [0] = 500;
        System.out.println("z: " +Arrays.toString(z));    // z: [500, 200, 3]
        System.out.println("a: " +Arrays.toString(a));    // a: [100, 200, 3]
        System.out.println("b: " +Arrays.toString(b));    // b: [100, 200, 3]

        int[] scores = {1, 2, 3, 4, 5};
        int[] scores2 = Arrays.copyOf(scores, scores.length - 3);
        int[] scores3 = Arrays.copyOf(scores, scores.length + 3);
        int[] scores4 = Arrays.copyOf(scores3, scores3.length - 1);

        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(scores2));
        System.out.println(Arrays.toString(scores3));
        System.out.println(Arrays.toString(scores4));

        int[] scores5 = Arrays.copyOfRange(scores,1,2);
        System.out.println(Arrays.toString(scores5));

        String[] str = {"America","Abc","Dmv","Sds","SRS"};
        String[] str1 = Arrays.copyOfRange(str,2,4);         // [Dmv, Sds]
        System.out.println(Arrays.toString(str1));

        char[] elements = {'a','m','e','r','i','c','a'};
        char[] myElem = Arrays.copyOfRange(elements,2,6+1);  //[e, r, PasswordCheck, c, a]
        System.out.println(Arrays.toString(myElem));



    }
}
