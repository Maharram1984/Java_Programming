package CustomMethodPractice;

public class reverseExample {
    public static void main(String[] args) {

        String str = "Finally PasswordCheck got the idea";
        String str1 = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            str1 += str.charAt(i);
        }
        System.out.println(str1.toUpperCase());


    }
}