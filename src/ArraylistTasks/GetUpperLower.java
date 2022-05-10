package ArraylistTasks;

import java.util.ArrayList;

public class GetUpperLower {
    public static void main(String[] args) {

    /*  Get Uppercase or Lowercase
        Write a program that can extract the uppercase and lowercase
        characters from a String and store them into separate ArrayLists of characters
        Ex:
        str = “heLLoWoRlD
        list1: {h, e, o, o, l}
        list2: {L, L, W, R, D ]     */
        ArrayList<Character> list1 = new ArrayList<>();
        ArrayList<Character> list2 = new ArrayList<>();
        String str = "heLLoWoRlD";

        for(int i = 0; i <str.length(); i++){
            char letter = str.charAt(i);
            if(Character.isLowerCase(letter)){
                list1.add(letter);
            }
            if(Character.isUpperCase(letter)){
                list2.add(letter);
            }
        }
        System.out.println("list1: " +list1);
        System.out.println("list2: " +list2);



    }
}
