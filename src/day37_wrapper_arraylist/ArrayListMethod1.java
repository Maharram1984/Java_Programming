package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListMethod1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        list.add("Apple"); // adds object to the end of the ArrayList
        list.add("Banana");
        list.add("Grape");
        list.add("Cherry");
        System.out.println(list);

        System.out.println(list.get(0)); // in array how do we access each element: arr[index]
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));

        System.out.println(list.size()); // SIZE: - to know how many elements are in the arraylist


        list.remove("Pear");             // remove(index 0,1,2,3) or remove(object) returns boolean
        System.out.println(list);                 // and if there is same objects it will remove the first one
        boolean a = list.remove("Pear"); // Pear removed before that is way it is false
        System.out.println(a);

        list.clear();
        System.out.println(list);  // It will remove all objects now it is []



    }
}
