package day37_wrapper_arraylist;

public class CountCharacters {
    public static void main(String[] args) {
    /*Given some string, count the number of uppercase letter, lowercase letters, numbers, and other characters
        aP3d572&*jd@jdJU
    Character.isUpperCase(char) --> checks if a char is uppercase
    Character.isLowerCase(char) --> checks if the char is lowercase
    Character.isDigit(char) --> checks if the character is a number  */

        String word = "adGGH%^#@dfghjD66RD&^RYD";
        int upper = 0, lower = 0, number = 0, other = 0;
        String upperCaseChar = "";
        String lowerCaseChar = "";
        String numberChar = "";
        String otherChar = "";

        for (int i = 0; i < word.length(); i++) {

            char letter = word.charAt(i);

            if (Character.isUpperCase(letter)) {
                upper++;
                upperCaseChar += letter + " ";
            } else if (Character.isLowerCase(letter)) {
                lower++;
                lowerCaseChar += letter + " ";
            } else if (Character.isDigit(letter)) {
                number++;
                numberChar += letter + " ";
            } else {
                other++;
                otherChar += word.charAt(i) + " ";
            }

        }

        System.out.println("Uppercase: " + upper);
        System.out.println("Uppercase letters are: " + upper + " -->> " + upperCaseChar);
        System.out.println("Lowercase: " + lower);
        System.out.println("Lowercase letters are: " + lower + " -->> " + lowerCaseChar);
        System.out.println("Numbers: " + number);
        System.out.println("Numbers are: " + number + " -->> " + numberChar);
        System.out.println("Others: " + other);
        System.out.println("Others are: " + other + " -->> " + otherChar);


    }


}
