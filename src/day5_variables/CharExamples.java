package day5_variables;

public class CharExamples {

    public static void main(String[] args) {

        char letterOne = 'a';
        char letterTwo = 'Z';
        char letterThree = 65;
        char numberOne = '9';
        char specialOne = '$';

        // assigning characters to char type

        System.out.println(letterOne);
        System.out.println(letterTwo);
        System.out.println(numberOne);
        System.out.println(specialOne);

        System.out.println(letterOne+letterTwo);
//
//        // why answer is 187? Because A = 65 - Z = 122
//
//        char letterThree = 65;
//        System.out.println(letterThree); // Letter A = 65

        // original  ---> 97 + 90 + 65 + 57 + 36 ----> That is why answer is 345
        System.out.println(letterOne + letterTwo + letterThree + numberOne + specialOne);

        // spaces between each char
        System.out.println(letterOne + " " + letterTwo  +  letterThree + " " + numberOne + specialOne);

        // string in the beginning
        System.out.println("char: " + letterOne + letterTwo + letterThree + numberOne + specialOne);

    }
}
