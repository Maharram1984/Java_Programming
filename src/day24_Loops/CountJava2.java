package day24_Loops;

public class CountJava2 {
    public static void main(String[] args) {

        String str = "java is a java language.java";
        int count = 0;

        while (str.contains("java")) {

            str = str.replaceFirst("java", "*");
            count++;
//            System.out.println(str);
        }
        System.out.println(count);
        System.out.println(str);

        String a = " java";
        for (int i = a.length()-1; i >= 0; i --){
            System.out.print(a.charAt(i));
        }

        for (int i = 0; i < a.length(); i ++){
            System.out.print(a.charAt(i));
        }




    }
}




