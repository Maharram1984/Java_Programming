package day39_ArrayList;

import java.util.ArrayList;

public class IndexOfMethod {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(10);

        int b = number.indexOf(20);
        System.out.println(b);
        System.out.println(number.indexOf(40));
        System.out.println(number.lastIndexOf(10));

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(100);
        nums.add(500);
        nums.add(800);
        nums.add(100);

        // give first 100
        System.out.println(nums.indexOf(100));

        System.out.println(nums.indexOf(700));

        int i = nums.indexOf(200);
        System.out.println(i);

        // last 100
        System.out.println(nums.lastIndexOf(100));

        // middle 100

        nums.set(nums.indexOf(100), 0); // nums.(0, 0)
        System.out.println(nums.indexOf(100));
    }
}
