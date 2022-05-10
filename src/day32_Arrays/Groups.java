package day32_Arrays;

import java.util.Arrays;

public class Groups {
    public static void main(String[] args) {
        String [][] cydeo = new String[4][];
        //String [][] cydeo = new String[4][3];
        //[[null, null, null], [null, null, null], [null, null, null], [null, null, null]] --> 4 inner arrays that each have a size of 3
        System.out.println(Arrays.deepToString(cydeo));  // [null, null, null, null]

        String [] groupOne = {"Emre", "Yasir", "Eda"};
        cydeo[0] = groupOne;

        System.out.println(Arrays.deepToString(cydeo));  // [[Emre, Yasir, Eda], null, null, null]

        System.out.println("adding group 2");

        String [] groupTwo = {"Basri", "Demet", "Shina", "Ismayil"};
        cydeo[1] = groupTwo;
        System.out.println(Arrays.deepToString(cydeo));  // [[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayil], null, null]

        System.out.println("adding group 3");

        cydeo[2] = new String[]{"Mustafa", "Lima"};  // syntax to create an array without a reference
        System.out.println(Arrays.deepToString(cydeo)); // [[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayil], [Mustafa, Lima], null]

        System.out.println("same group 3 as group 4");

        cydeo[3] = cydeo[2];
        System.out.println(Arrays.deepToString(cydeo)); // [[Emre, Yasir, Eda], [Basri, Demet, Shina, Ismayil], [Mustafa, Lima], [Mustafa, Lima

        System.out.println();

        for(String [] innerArray : cydeo) {  // loops through the 2d array, cydeo

            for (String eachWord : innerArray) { // loops through every String element in each 1d inner array
                System.out.print(eachWord.charAt(0) + "_");
            }
        }











    }
}
