package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(500);
        nums.add(800);

        nums.set(0,800);
        nums.set(1,500);
        nums.set(2,200);
        nums.set(3,100);
        //nums.set(10,555); // -->> OUT OF BOUND EXCEPTION
        System.out.println(nums);




    }
}

