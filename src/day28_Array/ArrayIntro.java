package day28_Array;


import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {
//        //with normal variables
//        String cityOne = "Chicago";
//        String cityTwo = "New York";
//        String cityThree = "Houston";
//        String cityFour = "Denver";
//        String cityFive = "Pittsburgh";
//
//        String[] cities2 = {cityOne, cityTwo, cityThree, cityFour,cityFive};
//        System.out.println(cities2);  // wrong message
//        System.out.println(cityFive);  // Pittsburgh
//        System.out.println("-------------------");
//
        // declare array with values
        String[] cities = {"Chicago", "New York", "Houston", "Denver", "Pittsburgh"};

//        // how to access each element in the array
//        System.out.println(cities[0]+" "+cities[1]);
//        System.out.println(cities[1]);
//        System.out.println(cities[2]);
//        System.out.println(cities[3]);
//        System.out.println(cities[4]);
//
//        System.out.println("--------------------");

        //print all the cities in the one line
        System.out.println("Reverse order of the cities: "+cities[4]+" "
                +cities[3]+" "+cities[2]+" "+cities[1]+" "+cities[0]);

        //print the all array at the one line
        System.out.println(Arrays.toString(cities));// this method from [Arrays] class lets you print [array] the fully
        System.out.println(cities.length);
        System.out.println("---------------------");

        for (int i = cities.length; i > 0; i--) {
            System.out.print(cities[i-1] + ", ");
        }
        System.out.println();
        for (int i = 0; i < cities.length; i++) {
            System.out.print(cities[i]+ " ");
        }









    }
}
