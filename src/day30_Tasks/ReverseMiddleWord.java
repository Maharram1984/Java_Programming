package day30_Tasks;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        // reverse middle word

        String str = "Java always fun";
        String[] words = str.split(" ");      //  words: ["Java", "always", "fun"]
        String reversed = "";

         char[] middleWord = words[1].toCharArray();  // middleWord: [a,l,w,a,y,s]

        for (int i = middleWord.length - 1; i >= 0; i--) {
            reversed += middleWord[i];
        }
        System.out.println(words[0] +" "+ reversed +" "+ words[2]);  //Java syawla fun
        System.out.println(str.replace("always","syawla"));
















    }
}
