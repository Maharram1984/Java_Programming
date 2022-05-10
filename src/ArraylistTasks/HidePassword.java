package ArraylistTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
     /*  Given an ArrayList of passwords (String). Hide each password in a star
         (*) format where each character is a star and print the ArrayList of
         hidden passwords
         Ex:
         Input:
         {"one", "hi", "hold}
         Output:
         [ ***, **, **** ]  */

        ArrayList<String> password = new ArrayList<>(Arrays.asList("one", "hi", "hold", "limonad"));

        for (int i = 0; i < password.size(); i++) {
            String str = "";
            for (int j = 0; j < password.get(i).length(); j++) {
                str += "*";
            }
            password.set(i,str);
        }
        System.out.println(password);




        for (int i = 0; i < password.size(); i++) {
            String result = "";
            for (int j = 0; j < password.get(i).length(); j++) {
                result += "*";
            }
            System.out.print(result+ " ");
        }


























    }
}
