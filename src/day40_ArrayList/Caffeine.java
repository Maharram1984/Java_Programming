package day40_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {
    public static void main(String[] args) {
        ArrayList<String> drinks1 = new ArrayList<>();
        drinks1.add("coffee");
        drinks1.add("tea");
        drinks1.add("energy drink");
        drinks1.add("soda");
        System.out.println(drinks1);

        ArrayList<String> drinks2 = new ArrayList<>(drinks1);
        System.out.println(drinks2);

        String[] allDrinks = {"coffee", "tea", "energy drink", "soda"};
        //ArrayList<String> drinks3 = new ArrayList<>(allDrinks); not valid because the array is not a valid argument
        ArrayList<String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));
        System.out.println(drinks3);

        ArrayList<String> drinks4 = new ArrayList<>(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drinks4);


        ArrayList<String> drinks5 = new ArrayList<>();
        drinks5.addAll(Arrays.asList("coffee", "tea", "energy drink", "soda"));
        System.out.println(drinks5);

        ArrayList<String> drinks6 = new ArrayList<>(drinks1);
        drinks6.addAll(Arrays.asList("pepsi", "coke", "cola",  "sprite"));
        System.out.println(drinks6);



    }
}
