package day24_Loops;

public class CharactersInString {
    public static void main(String[] args) {
        //Given a String print the ascii value codes for each character
        String word1 = "java";
        int result = 0;
        for (int i = 0; i < word1.length(); i++) {
            result = word1.charAt(i);
            System.out.print(result + " ");
        }
        System.out.println();

        String str = "maharram";
        for (int j = 0; j < str.length(); j++) {
            System.out.print((int) str.charAt(j) + " "); // by casting it is easy
        }
        System.out.println();

        int[] a = {109, 97, 104, 97, 114, 114, 97,109};
        for (int i = 0; i < a.length; i++) {
            System.out.print((char) a[i] + " ");
        }



    }
}
