package day38_Arraylist;

import PrimitiveDataTypes.Char;

import java.util.ArrayList;

public class ArrayListTasks {
    public static void main(String[] args) {

//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("Hat");
//        list.add("Shoes");
//        list.add(1, "Jacket");
//        System.out.println(list);
//        list.add(0, "Towel");
//        System.out.println(list);
//        list.add(1, "Car");
//        System.out.println(list);

        ArrayList<String> rem = new ArrayList<>();
        rem.add("Iron Man");
        rem.add("Spider Man");
        rem.add("Thor");
        rem.add("Captain America");
        rem.add("Hawker");
        System.out.println(rem);
        rem.remove(2);
        System.out.println(rem);
        rem.remove("Hawker");
        System.out.println(rem);

        System.out.println(rem.remove(0)); //Without [ ] Iron Man
        System.out.println(rem);

        System.out.println(rem.remove("Iron Man")); // With String true
        System.out.println(rem.remove("Spider Man"));
        System.out.println(rem);


//
//        ArrayList<Character> letBig = new ArrayList<>();
//        for(char PasswordCheck = 'A'; PasswordCheck <= 'Z'; PasswordCheck++){
//            letBig.add(PasswordCheck);
//        }
//        System.out.println(letBig);
//
//        ArrayList<Character> letters = new ArrayList<>();
//        for (char PasswordCheck = 'a'; PasswordCheck <='z'; PasswordCheck++) {
//            letters.add(PasswordCheck);
//        }
//        System.out.println(letters);
//
//        letters.remove(0);
//        letters.remove(1);
//        letters.remove(2);
//        letters.remove(3);
//        letters.remove(4);
//        System.out.println(letters);


    }
}
