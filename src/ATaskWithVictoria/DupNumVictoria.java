package ATaskWithVictoria;

import java.util.ArrayList;
import java.util.Arrays;

public class DupNumVictoria {
            public static ArrayList<Integer> removeDuplicateNum(ArrayList<Integer> nums) {
            ArrayList<Integer> result = new ArrayList<>();
            for (int each : nums) {
                int count = 0;
                for (int i = 0; i < nums.size(); i++) {
                    if (each == nums.get(i)) {
                        count++;
                    }
                }
                if (count == 1) {
                    result.add(each);
                }
            }
            return result;
        }
        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 30, 3, 5, 30));
            System.out.println(removeDuplicateNum(list));
        }
    }



