package TASK;

import java.util.Locale;

public class Scrible {
    public static void main(String[] args) {

//        int a = 10;
//        int b = ++a + a++ + a-- + a--;
//        System.out.println(a);
//        System.out.println(b);
//
//        char alf = 'a';
//        while (alf <= 'z') {                 // alphabet with while
//            System.out.print(alf + " ");
//            alf++;
//
//        }
//        System.out.println();
//
//        for (char PasswordCheck = 'A'; PasswordCheck <= 'Z'; PasswordCheck++) {   // alphabet upperCase
//            System.out.print(PasswordCheck + " ");
//        }
//        System.out.println();
//        for (int j = 1; j <= 10; j++) {      // 1 - 10
//            System.out.print(j);
//        }
//        System.out.println();
//        String count = "java";
//        for (int PasswordCheck = 0; PasswordCheck < 4; PasswordCheck++) {         // acsii numbers
//            System.out.print((int) count.charAt(PasswordCheck) + "  ");
//        }
//        System.out.println();
//        for (int PasswordCheck = 1; PasswordCheck <= 20; PasswordCheck++) {     // even numbers
//            if (PasswordCheck % 2 == 0) {
//                System.out.print(PasswordCheck + " ");
//            }
//        }
//        System.out.println();
//        for (int j = 1; j <= 20; j++) {     // odd numbers
//            if (j % 2 != 0) {
//                System.out.print(j + " ");
//            }
//        }
//        System.out.println();
//        for (int PasswordCheck = 1; PasswordCheck <= 10; PasswordCheck++) {    //multiplication
//            System.out.println();
//            for (int j = 1; j <= 10; j++) {
//                System.out.print(PasswordCheck*j+"\t");
//            }
//
//
        for (int i = 1; i <= 2; i++) {
            System.out.print("A");
            for (int j = 1; j <= 15; j++) {
                System.out.print("Z");

            }
            System.out.println();
        }
        int n = 0;
           for (int i = 0; i <= 5; i++) {
            for (int j = 0; j < i; j++) {
                n = n +j;
                System.out.println(n);
            }
        }
    }
}
