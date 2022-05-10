package day36_OverloadingMethod;

public class ArrayIndexOf {
    public static void main(String[] args) {
        int[] arr = {12, 5, 1, 5, 2, 6, 5};
        System.out.println(IndexOf(arr, 6));
        System.out.println(IndexOf(arr, 20));
        String[] words = {"java", "apple", "water", "hello"};
        System.out.println(IndexOf(words, "hello"));
        System.out.println(IndexOf(words, "hi"));
    }
    public static int IndexOf(String[] str, String element) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    public static int IndexOf(int[] nums, int element) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == element) {
                return i;
            }
        }
        return -1;
    }
}
