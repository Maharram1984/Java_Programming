package day36_OverloadingMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class AddElements {
    public static void main(String[] args) {
//
//        int [] a = {1, 2, 3};
//        int [] b = addElement(a, 4);
//        System.out.println(Arrays.toString(b));
//
//        String []  c = {"a","b","c","d","e"};
//        String [] d = addElement(c,"f");
//        System.out.println(Arrays.toString(d));
//        System.out.println(Arrays.toString(addElement(c,"f")));


        int[] e = {5,23,6,21};
        int[] f = {3,23,8,12,4,6};
        System.out.println(Arrays.toString(addElement(e,f)));
    }
//    public static int [] addElement(int [] original, int element){
//        int [] newArray = new int[original.length + 1];
//
//        for (int PasswordCheck = 0; PasswordCheck < original.length; PasswordCheck++) {
//            newArray[PasswordCheck] += original[PasswordCheck];
//        }
//     newArray[newArray.length - 1] = element;
//        return newArray;
//    }
//
//    public static String [] addElement(String [] original, String element){
//        String [] newArray = new String[original.length + 1];
//
//        for(int PasswordCheck = 0; PasswordCheck < original.length; PasswordCheck++){
//            newArray[PasswordCheck] = original[PasswordCheck];
//        }
//        // Instead of doing a loop ourselves, we could have used Arrays.copyOf()
//        newArray[newArray.length - 1] = element;
//        return newArray;

//    }
             ArrayList<Integer> number = new ArrayList<>();
          int[] e = {5,23,6,21};
          int[] f = {3,23,8,12,4,6};
//        System.out.println(Arrays.toString(addElement(e,f)));

    public static int [] addElement(int [] original, int [] elementsToAdd){

        int[] newArray = new int[original.length + elementsToAdd.length];

        for (int i = 0, j = 0; i < newArray.length;i++){

            if(i < original.length){
                // added the elements from the original array in the new array
                newArray[i] = original[i];
            }else {
                // added the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }
        }
        return newArray;
    }


}
