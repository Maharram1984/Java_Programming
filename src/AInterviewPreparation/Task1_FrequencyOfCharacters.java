package AInterviewPreparation;

import day2_04_11_2022.ArrayVsArrayList;
import day49_Inheritance.A;
import day52_inheritance.ABC.C;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1_FrequencyOfCharacters {
    /* YOU WILL USE 3 WAY TO DO THAT.
       1 WHILE LOOP  2 FOR LOOP AND  3 FOR LOOP by using "FREQUENCY"
       Write a return method that can find the frequency of characters
   Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2  */
    public static String frequencyOfCharacters(String str) {
       String result = "";
       ArrayList<String> list = new ArrayList<>(Arrays.asList(str.split("")));
       for (String each : list){
           int freq = Collections.frequency(list,each);
           if(result.contains(each)){
               continue;
           }
           result += each + freq + " ";
           }
       return result;
    }

    public static void main(String[] args) {
        String str = "AAABEEEBCDD";
        System.out.println(frequencyOfCharacters(str));
    }
}
