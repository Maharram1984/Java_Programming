package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveBadPairs {
    public static void main(String[] args) {
     /* Input: {3, 4, 6, 1, 1, 10, 8, 7};
        Output: {3, 4, 1, 10};
        Bad pairs that were removed:
        6, 1
        8, 7     */
    }
    public static ArrayList<Integer>removeBadPairs(ArrayList<Integer> list){
        ArrayList<Integer> godPairs = new ArrayList<>();

         for (int i = 0; i < list.size(); i+=2) {
            if(list.get(i) < list.get(i+1)){
                godPairs.add(list.get(i));
                godPairs.add(list.get(i+1));
            }
        }
         return godPairs;
    }
}
