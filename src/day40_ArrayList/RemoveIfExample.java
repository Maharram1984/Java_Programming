package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfExample {
    public static void main(String[] args) {

        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4, 6, 2, 5, 12, 9, 143, 4, 7, 8, 2));

        ArrayList<Integer> nums = new ArrayList<>(base);
        nums.removeIf( n -> n % 2 == 0); // n is a variable to define every element
        System.out.println(nums);

        ArrayList<Integer> nums1 = new ArrayList<>(base);
        nums1.removeIf( a -> a % 2 == 1);
        System.out.println(nums1);

        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf( each -> each > 10);
        System.out.println(nums2);

        ArrayList<Integer> nums3 = new ArrayList<>(base);
        nums3.removeIf(f -> f < 10);
        System.out.println(nums3);

        ArrayList<String> days = ArrayListWithMethods.getDaysOfWeek();
        days.removeIf( day -> day.startsWith("S") || day.startsWith("T") || day.startsWith("M"));
        System.out.println(days);











    }
}
