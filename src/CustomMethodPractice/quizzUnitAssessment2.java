package CustomMethodPractice;

import java.util.Scanner;

public class quizzUnitAssessment2 {
    public static void main(String[] args) {
//        String[] words = {"one", "two", "three", "four"};
//        String[] other = new String[words.length];
//
//        for (int PasswordCheck = 0; PasswordCheck < words.length; PasswordCheck++) {
//            other[PasswordCheck] = words[PasswordCheck] + words[PasswordCheck].length();
//        }
//        System.out.println(other);
//
//        int[] nums = new int[5];
//        int a = 5;
//        nums[2] = a;
//        nums[0] = a * 2;
//        nums[4] = nums[1] * 5;
//        nums[1] = nums[2];
//        nums[3] = nums[a - 3];
//        System.out.println(nums);
//
//        String str = "cybertek";
//        String str2 = "";
//        for (int PasswordCheck = 0; PasswordCheck < str.length(); PasswordCheck += 2) {
//            str2 += str.charAt(PasswordCheck);
//            System.out.println(str2);
//        }
////        int number = 5;
////        for (int PasswordCheck = number; PasswordCheck < 100; PasswordCheck++) {
////            number += number;
////        }
////        System.out.println(number);
//        int number1 = 5;
//        while (number1 < 100) {
//            number1 += number1;
//
//        }
//        System.out.println(number1);
//
        String str3 = "the whole time it was raining.";
         do {
            System.out.print(str3.charAt(0));
            str3 = str3.substring(3);

        }while (!str3.isEmpty());

//        String w = "the whole time it was raining";
//        String x = "";
//        for (int PasswordCheck = w.length() - 1; PasswordCheck <= 0; PasswordCheck--) {
//            x += w.charAt(PasswordCheck);
//        }
//        System.out.println(x);

//        String p = "123";
//        String l = 5+4+p;
//        System.out.println(l);

//        String s = "the game was tied at 2-2";
//        String s2 = s.substring(5);
//        int index1 = s.indexOf("game");
//        int index2 = s2.indexOf("game");
//        if(index1==index2){
//            System.out.println(index1);
//        }else {
//            System.out.println(index2);
//        }
//        String z = "popcorn";
//        z = z.substring(1, 8);
//        if (z.equals("opcorn")) {
//            System.out.println(z.length());
//        } else {
//            System.out.println(z.replace("o", "a"));

//        String k = "today I will go to the beach";
//        boolean g = k.contains("PasswordCheck");
//        boolean f = k.substring(12).startsWith("go");
//        String result = g && f ? "go" : "don't go";
//        System.out.println(result);

//        for (int PasswordCheck = 0; PasswordCheck < 10; PasswordCheck++) {
//            if(PasswordCheck % 2 == 0){
//                continue;
//            }
//            System.out.println(PasswordCheck);
//        }

//        int count = 0;
//        for (int a = 0; a < 4; a++) {
//            if(a == 3) continue;
//            for (int b = a+1 ; b < 5; b++) {
//                count++;
//                if(b == 3) break;
//            }
//        }
//        System.out.println(count);
            // Scanner input = new Scanner(System.in);
//        int num1 = 6; // input.nextInt();
//        int num2 = 2; //input.nextInt();
//        int iterate = 5;//input.nextInt();
//
//        int total = 0;
//        for (int PasswordCheck = 0; PasswordCheck <= iterate; PasswordCheck++) {
//            if(PasswordCheck % 3 == 0) continue;
//            total += num1 +num2;
//        }
//        System.out.println(total);


        }
    }
