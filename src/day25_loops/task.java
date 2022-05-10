package day25_loops;

public class task {
    public static void main(String[] args) {

String firstName = "maharram";
String lastName = "rafiyev";
        System.out.print(firstName.substring(0,1).toUpperCase());
        System.out.println(lastName.substring(0,1).toUpperCase());


        String str = "I love myself";
        String fixed = "";
        for (int i = 0; i < str.length(); i++) {

            if(str.charAt(i) == ' '){
                fixed += "* ";
            }else {
                fixed += str.charAt(i) + " ";
            }

        }
        System.out.println(fixed);














    }
}
