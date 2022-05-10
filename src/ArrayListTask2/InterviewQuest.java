package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class InterviewQuest {
    public static void main(String[] args) {
    /*  1. write a program that can set the last element of the Integer arraylist to zero
        ex:
        list = [1,2,3,4,5];
        output: [1,2,3,4,0]; */
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        nums.set(nums.size() - 1, 0);
        System.out.println(nums);

        //  2. write a program that can swap the first and last elements of an ArrayList
        ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(1, 12, 31, 44, 115));

        Collections.swap(nums1, 0, nums1.size() - 1);
        a.set( 0,a.size()-1);  // [4, 12, 31, 44, 115]
        Collections.swap(a, 0, nums1.size() - 1);  //[115, 12, 31, 44, 4]


        System.out.println(nums1);
        System.out.println(a);


     /* 3. write a program that can multiply each odd number by 2
        ex: list = [1,2,3,4,5];
        output: [2,2,6,4,10] */
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(3,4, 5, 5, 3, 5, 3));
        for(int i = 0; i < nums2.size(); i++){
            if(nums2.get(i) % 2 == 1){
              nums2.set(i,nums2.get(i) * 2);
            }
        }
        System.out.println(nums2);


     /* 4. write a program that can combine two String arrays into one arrayList
        ex:
        arr1 = {"A", "B", "C"};
        arr2 = {"D", "E", "F", "G"};
        list ==> {"A", "B", "C", "D", "E", "F", "G"}  */
        ArrayList<String> arr1 = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> arr2 = new ArrayList<>(Arrays.asList("D", "E", "F", "G"));
        ArrayList<String> list = new ArrayList<>();
        list.addAll(arr1);
        list.addAll(arr2);
        System.out.println(list);
        
        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(3, 4, 4, 3, 4, 3)); // (15,20,15,20,15)
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) % 2 == 0) {
                num.set(i, num.get(i) * 5);
            }
            if (num.get(i) % 2 != 0) {
                num.set(i, num.get(i) * 5);
            }
        }
        System.out.println(num);






    }
}
