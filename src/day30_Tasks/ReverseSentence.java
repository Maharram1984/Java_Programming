package day30_Tasks;

public class ReverseSentence {
    public static void main(String[] args) {
        // Replace first and last words

        String str = " Today is monday";
        String[] word = str.split(" ");
        String reverse = "";

        for (int i = word.length - 1; i >= 0; i--) {
            reverse += word[i] + " ";
        }
        System.out.println(reverse.trim());


        String[] str1 = {"Tomorrow   ","is","   tuesday"};
        String rs = "";

        for (int i = str1.length - 1; i >= 0; i--) {
            rs += str1[i] + " ";
        }
        System.out.println(rs.trim());

































    }}