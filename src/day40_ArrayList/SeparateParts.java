package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG!";

        ArrayList<String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);

        ArrayList<String> numbers = new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "0"));
        System.out.println(numbers);

        ArrayList<String> specialChar = new ArrayList<>(list);
        specialChar.retainAll(Arrays.asList("!", "@", "#", "$", "%", "^", "&", "*", "(", ")", "~"));
        System.out.println(specialChar);

        ArrayList<String> letters = new ArrayList<>(list);
        letters.removeAll(numbers);
        letters.removeAll(specialChar);
        System.out.println(letters);


    }
}
