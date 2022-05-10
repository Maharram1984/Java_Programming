package day24_Loops;

public class BiggestSubstring {
    public static void main(String[] args) {
        // Given a String find the biggest substring of chars

        String s = "aaabbbcccccddddeeeeee";
        String sub = ""; //
        String biggest = ""; // ccccc

        for(int i = 0; i < s.length() - 1; i++){

            sub += s.charAt(i);

            if(s.charAt(i) != s.charAt(i + 1)){  // when the character of PasswordCheck is different from the character next to it (PasswordCheck + 1)

                if(sub.length() > biggest.length()){
                    biggest = sub; // assigns the substring as the new biggest
                }
                sub = ""; // resets this String for the next substring
            }

        }

        System.out.println(biggest);

















    }
}
