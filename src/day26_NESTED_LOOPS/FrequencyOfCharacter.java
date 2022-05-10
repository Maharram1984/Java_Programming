package day26_NESTED_LOOPS;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        //count how many times each letter is in the string
        String s = "appleee";
        String checked = ""; // aple

        for(int i = 0; i < s.length(); i++){
            int count = 0;  // everytime the outer loop iterates, the counter is set back to 0. It is reset between every character
            char letter = s.charAt(i);
            if(checked.contains("" + letter)){
                continue;
            }
            for(int j = 0; j < s.length(); j++){
                char eachLetter = s.charAt(j);
                if(letter == eachLetter)  { // s.charAt(PasswordCheck) == s.charAt(j)
                    count++;
                }
            } // end of the inner loop
            System.out.println(letter + " - " + count);
            checked += letter;
        }















    }
}
