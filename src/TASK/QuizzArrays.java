package TASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class QuizzArrays {
//    public static void main(String[] args) {
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.addAll(Arrays.asList(2,97,2,56,46,73,6,2,3,7));
//
//        String s = "";
//        for (int PasswordCheck = 0; PasswordCheck < numbers.size(); PasswordCheck++) {
//            if(numbers.get(PasswordCheck) > 5){
//                continue;
//            }
//            if (numbers.get(PasswordCheck) % 2 == 0){
//                s += "1";
//            }else {
//                s += "0";
//            }
//        }
//        System.out.println(s);



//        ArrayList<String> strs = new ArrayList<>();
//        strs.add("j");
//        strs.add("1");
//        strs.add("PasswordCheck");
//        strs.add("5");
//        strs.remove(1);
//        strs.add("e");
//        strs.add("PasswordCheck");
//        strs.remove("PasswordCheck");
//        System.out.println(strs);



    public static String method9(String one,String two, String three){

        return "" + middle(one) + middle(two)+middle(three);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = method9(scan.next(),scan.next(), scan.next());
        System.out.println(str);
    }
    public static char middle(String s){
        return  s.charAt(s.length()/2);
    }


//    public static void main(String[] args) {
//        String str = method7("on the weekend" , 20);
//        System.out.println(str);
//    }
//    public  static String method7(String str, int s){
//        if(s < 10){
//            str = str.substring(8);
//        } else {
//            if(str.length() > s) {
//                str = "weekday";
//            }else if (s > 10){
//                str = str.substring(7);
//            }
//        }
//        return  str;
//    }

//    public static boolean method5(String str){
//        boolean check = true;
//
//        if(str.isEmpty()){
//            check = false;
//        }
//        if (str.contains("a")){
//            check = false;
//        }else  if(str.contains("z")){
//            check = false;
//        }
//        return check;
//    }
//    public static void main(String[] args) {
//        System.out.println(method5("apple"));

//    public static void main(String[] args) {
//        ArrayList<Integer> numOne = new ArrayList<>();
//        numOne.addAll(Arrays.asList(4,1,8,-42,2,10));
//        ArrayList<Integer> numTwo = new ArrayList<>();
//
//        for (int each : numOne) {
//            switch (each) {
//                case 1:
//                    numTwo.add(1);
//                case 5:
//                    numTwo.add(50);
//                    break;
//                case 4:
//                    break;
//                case 8:
//                    numTwo.remove(0);
//                    break;
//                case 10:
//                case -42:
//                    numTwo.add(1,0);
//                    break;
//                case 55:
//                    numTwo.add(105);
//                    break;
//                case 2:
//                    numTwo.add(20_000);
//                    break;
//                default:numTwo.add(null);
//            }

//        }
//        System.out.println(numTwo);
//    }


}
