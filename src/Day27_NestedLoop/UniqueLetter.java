package Day27_NestedLoop;

import java.util.Scanner;

public class UniqueLetter {
    public static void main(String[] args) {
   /*  [IQ] Unique characters
        Given a String, find and print the unique characters.
        A character is unique if it only appears once in the String.
                Ex:
        Input:
        AAABCCDEEF
        Output:
        BDF  -> the characters B D and F are only found
        in the String once so they are unique  */


        String str = "mpmmmannukkellojji";
        String uniLet = "";

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
                if(count == 1){  // found only unique letter but with (count != 1)
               // or(count > 1) found more than unique letters
                    uniLet += str.charAt(i);
            }
        }
        System.out.println(uniLet);


//        for (int PasswordCheck = 0; PasswordCheck < str.length(); PasswordCheck++) {
//
//            char letter = str.charAt(PasswordCheck);
//            int count = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//                char inner = str.charAt(j);
//                if (letter == inner) {
//                    count++;
//                }
//            }
//            if (count == 1) {
//                System.out.print(letter);
//            }
//
//        }



















    }
}