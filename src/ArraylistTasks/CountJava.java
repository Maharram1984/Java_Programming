package ArraylistTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class CountJava {
    public static void main(String[] args) {
        /* Given an ArrayList of Strings and a target word (String) print how many
           times the target word is in the ArrayList
           Ex:
           Input:
           ”java”, ”html”, “css”, “java”, “javascript”, “selenium”
           Target: java
           Output:
           2        */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java","html","css","java","javascript","selenium"));

        ArrayList<String> count3 = new ArrayList<>();
        ArrayList<Integer> count4 = new ArrayList<>();
        String target = "java";
        String count = "";
        int count1 = 0;

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i) == target){
               count += words.get(i) + " ";
               count1++;  //2
               count3.add(words.get(i));
               count4.add(i); //0,3
        }
        }
        System.out.println(count);
        System.out.println(count1);
        System.out.println(count3);
        System.out.println(count4);

















    }
}
