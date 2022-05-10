package day17_String_Class;

public class StringMethods3 {
    public static void main(String[] args) {

        String met10 = "Wooden Spoon";     // replace, replaceAll  letter,word,sentence==A
        //  met10 = met10.replace("Wooden Spoon","WS");
        met10 = met10.replace("o", "e");
        System.out.println(met10);

        String sentence = "I love Java, Java is my favorite language";
        sentence = sentence.replace("Java", "A");
        System.out.println("sentence = " + sentence);
        System.out.println("--------------------------------------------");

        String met11 = "Wooden Spoon";       // replaceFirst

        met11 = met11.replaceFirst("o", "e");
        System.out.println("met11 = " + met11);
        String sentence1 = "I love Java, Java is my favorite language";
        sentence1 = sentence1.replaceFirst("Java", "Microsoft");
        System.out.println("met11 = " + sentence1);
        System.out.println("---------------------------------------------");

        String met12 = "Java programming language";





        String met13 = "Java";        // repeat -->> return to int
        met13 = met13.repeat(5);
        System.out.println(met13);


    }
}
