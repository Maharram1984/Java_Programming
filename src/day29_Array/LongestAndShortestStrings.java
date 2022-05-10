package day29_Array;

public class LongestAndShortestStrings {
    public static void main(String[] args) {
        /* Shortest and Longest words from String array
         • Write a program that can return the shortest string element from a String array
         • Write a program that can return the longest string element from a String array */

        String[] str = {"apple", "java", "task", "computer","computer", "water"};
        String longest = "";    //todo
        String shortest = str[0];

        for (int i = 0; i < str.length; i++) {
            if(str[i].length() > longest.length()){
                longest = str[i];
            }
            if(str[i].length() < shortest.length()){
                shortest = str[i];
            }
        }
//        for(String each : str){
//            if(each.length() > longest.length()){
//                longest = each;
//            }
//            if(each.length() < shortest.length()){
//                shortest = each;
//            }
//        }
        System.out.println("Longest String: " + longest);
        System.out.println("Shortest String: " + shortest);




    }
}
