package day11_IF_Else;

public class lowercaseUppercase {
    public static void main(String[] args) {


        char letter = 'A';

        if(letter >= 'a'&&letter <= 'z'){
            System.out.println("lowercase");
        }
        if(letter >= 'A'&& letter <= 'Z'){
            System.out.println("UPPERCASE");
        }

        int letter1 = 65;
        if (letter1 >= 97 && letter1<= 122){
            System.out.println("lowercase letter ");  // lowercase between - 97-122
        }
        if(letter1 >= 65 && letter1 <= 90){           // UPPERCASE between - 65-90
            System.out.println("UPPERCASE");
        }




















    }
}
