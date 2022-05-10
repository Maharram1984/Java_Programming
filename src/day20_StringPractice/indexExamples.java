package day20_StringPractice;

public class indexExamples {
    public static void main(String[] args ){

        String word = "banana";
                     //012345
        int firstIndex = word.indexOf('a');
        System.out.println(firstIndex);
        int lastIndex = word.lastIndexOf('a');
        System.out.println(lastIndex);
        int secondIndex = word.indexOf('a',firstIndex +1); // starts to look from index 2
        System.out.println(secondIndex);
        int thirdIndex = word.indexOf('a', secondIndex+1); // starts to look from index 2
        System.out.println(thirdIndex);












    }
}
