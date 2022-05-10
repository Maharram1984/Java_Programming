package AInterviewPreparation;

import java.util.ArrayList;
import java.util.Arrays;

public class Task24_RemoveAhmed {
    /*ArrayList -- Remove "Ahmed"
    ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", Eric", "Ahmed".)); */
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Ahmed", "John", "Eric", "Ahmed"));
        names.removeAll(Arrays.asList("Ahmed"));
        System.out.println(names);

    }


}
