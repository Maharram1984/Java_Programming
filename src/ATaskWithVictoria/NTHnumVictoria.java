package ATaskWithVictoria;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NTHnumVictoria {
     /*  Task 2 : write a program that can return the nth largest number from an arraylist
         arraylist = {1,2,3,4,5,6,7, 7 ,8, 8}
         n = 5
         output:  4    */
    public static int largestNumber(ArrayList<Integer> list, int num){
        ArrayList<Integer>list1=new ArrayList<>();
        Collections.sort(list);
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            if (!list1.contains(list.get(i))){
                list1.add(list.get(i));
            }
        }
        return list1.get(num-1);
    }
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7, 7 ,8, 8));
        System.out.println(largestNumber(list,5));
    }
}
