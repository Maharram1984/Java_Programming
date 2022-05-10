package ATaskWithRashid;

import java.util.Arrays;

public class TargetNumTen2 {
    public static void main(String[] args) {

    int arr[] = {2, 4, 3, 6};
    int target = 10;
    int result[] = new int[2];

        for(int i = 0; i < arr.length;i++){

        for (int j = 0; j < arr.length; j++) {

            if (arr[i] + arr[j] == target) {
                result[0] = arr[j];  //arr[j] = value of the element // j = index of the element
                result[1] = arr[i];
            }
        }
    }
        System.out.println(Arrays.toString(result));
}
}

//    int target = 10;
//    int[] arr = {2, 6, 7, 4};
//    String result = "";
//        for (int PasswordCheck = 0; PasswordCheck < arr.length; PasswordCheck++) {
//        for (int j = 0; j < arr.length; j++) {
//        if (arr[PasswordCheck] + arr[j] == target) {
//        result = arr[j] + " " + arr[PasswordCheck];
//        }
//        }
//        }
//        System.out.println(result);
