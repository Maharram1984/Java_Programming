package day38_Arraylist;

import java.util.Arrays;

public class RotateCharacter {
    public static void main(String[] args) {


//        int str = 10;
//        int str1[] = new int[str+1];
//        str1[1] = 1;
//
//        for (int PasswordCheck = 2; PasswordCheck < str1.length;PasswordCheck++){
//            str1[PasswordCheck] = str1[PasswordCheck-1]+str1[PasswordCheck-2];
//        }
//        System.out.println(Arrays.toString(str1));


        String aa = "LkaMi".toLowerCase();
        String[] bb = aa.split("");
        String cc = bb[0];

        for (int i = 0; i < bb.length - 1 ; i++) {

            if (i == 0) {
                bb[i] = bb[i + 1].toUpperCase();
            }else {
                bb[i] = bb[i + 1];
            }
        }

        bb[bb.length - 1] = cc;

        System.out.println(Arrays.toString(bb));


        String a = "LkAmI".toLowerCase();
        String[] b = a.split("");

        String c = b[0];

        for (int i = 0; i < b.length - 1; i++) {
            if (i == 0) {
                b[i] = b[i + 1].toUpperCase();
            } else {
                b[i] = b[i + 1];
            }
        }
        b[b.length - 1] = c;
        String[] f = Arrays.copyOf(b, b.length + 2);
        f[5] = "o";
        f[6] = "v";
        System.out.println(Arrays.toString(f));

    }

}



