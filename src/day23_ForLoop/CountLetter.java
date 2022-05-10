package day23_ForLoop;

import java.util.Scanner;

public class CountLetter {
    public static void main(String[] args) {


//        String word = "banana";
//        String count = ""; //-->> aaa                       // char letter = 'a';
//       // int count = 0; ---->> 3
//        for (int PasswordCheck = 0; PasswordCheck < word.length(); PasswordCheck++) {
//
//            if (word.charAt(PasswordCheck) == 'a') {             // == letter
//
//                count += word.charAt(PasswordCheck);
//               // count++;
//            }
//        }
//        System.out.println(count);
//
//        Scanner input = new Scanner(System.in);
//        String[] arr = new String[8];
//        for (int PasswordCheck=0;PasswordCheck<8;PasswordCheck++){
//            arr[PasswordCheck] = input.nextLine();
//        }

        //WRITE YOUR CODE BELOW:
        String w = "apple, banana, kiwi, grape, milk, soda, juice, coffee";
        String[]arr= w.split(", ");
        for (int i = 0; i < arr.length-1; i++) {
        System.out.println(arr[i]+ ", "+arr[i+1]);
        }









    }
}
