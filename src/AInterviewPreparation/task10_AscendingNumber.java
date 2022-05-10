package AInterviewPreparation;

import day49_Inheritance.A;

public class task10_AscendingNumber {

    // 10 if ascend true
    // int[]a={1,2,3,4,5,6,7};

    public static boolean AscendNumber(int[] num) {

        for (int i = 0; i < num.length-1; i++) {
            if (num[i] < num[i+1]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7};  // >
        int[] b = {7, 6, 5, 4, 3, 2, 1};  // <
        System.out.println(AscendNumber(a));
        System.out.println(AscendNumber(b));
    }
}
