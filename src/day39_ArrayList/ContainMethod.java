package day39_ArrayList;

import java.util.ArrayList;

public class ContainMethod {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        System.out.println(nums.contains(200));  // true
        System.out.println(nums.contains(500));  // true
        System.out.println(nums.contains(700));  // false

    }
}
