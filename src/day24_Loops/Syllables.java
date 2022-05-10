package day24_Loops;

public class Syllables {
    public static void main(String[] args) {

        //Given a String separated by dashes calculate how many syllables the words are
        String word = "to-yo-ta";
        int syllabless = 1;  // syllables = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == '-') {
                syllabless++;
            }
        }
        System.out.println("Syllables: " + syllabless);  // syllables + 1








    }
}
