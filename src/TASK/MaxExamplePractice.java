package TASK;

import java.util.Arrays;

public class MaxExamplePractice {
    public static void main(String[] args) {
        String word = "Alekber,Kenan,Ramo,Vusal,Maharram,Meharet,Xeqani,Fuad,Ceki";

        String[] str = word.split(",");
        int min = word.length(); //Integer.MAX_VALUE or word.length()

        for (String each : str) {
            if(each.length() < min){
                min = each.length();
            }
        }
        String shortest = "";
        for (int i = 0; i < str.length; i++) {

            if (str[i].length()== min){
                shortest += str[i]+" ";
            }
        }
        String[] result = shortest.split(" ");
        System.out.println(Arrays.toString(result).trim());



        String  word1="Kamil,Katya,Nadir,Victoria,Maharram";
        String shortest1=" ";
        String [] one=word1.toLowerCase().split(",");
        int min1=Integer.MAX_VALUE;
        for (int i = 0; i < one.length; i++) {
            if (one[i].length()<=min1){
                if (one[i].length()==min1){
                    shortest1+=" "+one[i];
                }else {
                    shortest1=one[i];
                    min1= one[i].length();
                }
            }
        }
        String[]result1=shortest1.trim().split(" ");
        System.out.println(Arrays.toString(result1));






    }
}
