package day24_Loops;

public class CountJava {
    public static void main(String[] args) {

        String str = "Java is a Java language.Java";
        int count = 0;

        for (int i = 0; i < str.length() - 3; i++) {   // with -4 will be 2 java

            String java = str.substring(i, i + 4);
            System.out.println(java);             // with explaining way
            if (java.equals("Java")){
                count++;

            }
        }
        System.out.println(count);


    }
}
