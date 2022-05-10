package TASK;

import java.util.Scanner;

public class quizz {
  //  public static void main(String[] args) {


//      int[] a = {5,7,3,8,20,14};
//
//      for (int n:a){
//          if(n%2==0){
//              continue;
//          }
//          System.out.println(n);


//    public static int action(int PasswordCheck){
//        return PasswordCheck*2;
//    }
//
//    public static void main(String[] args) {
//        int tot = 0;
//        tot += action(true);
//        tot += action(6);
//        tot += action("false");
//        tot += action("four");
//        System.out.println(tot);
//    }
//    public static int action(String s){
//        return s.length();
//    }
//    public static int action(boolean b){
//        if(!b){
//            return 5;
//        }else {
//            return 10;
//        }
//    }
//
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int [] a = new int[input.nextInt()];
        for (int i = 0; i < a.length;i++){
            a[i] = input.nextInt();
        }
        method8(a);
    }
    public static void method8(int [] arr) {
        for (int n : arr) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.println(n);
        }
    }

}
