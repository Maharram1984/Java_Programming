package day24_Loops;

public class RemoveDuplicates {
    public static void main(String[] args) {

// Write a program that can remove duplicates from a String
        String str = "abcdabcd";
        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            if (!unique.contains(str.charAt(i) + "")) {
                unique += str.charAt(i);
            }
        }

        System.out.println(unique);



    }
}
