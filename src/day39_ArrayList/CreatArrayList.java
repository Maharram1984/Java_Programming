package day39_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatArrayList {
    public static void main(String[] args) {

        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("hello");
        listOne.add("bye");
        System.out.println(listOne);

        ArrayList<String> listTwo = new ArrayList<>( listOne ); // adds the elements from the
                                                                // listOne ArrayList into the ListTwo
        listTwo.add("Hola");
        listTwo.add("Hi");
        System.out.println(listOne);
        System.out.println(listTwo);

        ArrayList<String> listThree = new ArrayList<>( Arrays.asList("one", "two", "three") );
        System.out.println(listThree);

        //ArrayList<String> listFour = new ArrayList<>("four", "five", "six"); not valid
    }
}
