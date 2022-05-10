package ATaskWithRashid;

import java.util.ArrayList;
import java.util.Arrays;

public class ChangeCharacters {
    public static void main(String[] args) {

        // output = ka*********ov@gmail.com

        String email = "kamilhuseynov@gmail.com";
        String [] change = email.split("");
        String result = "";
        String keep = change[0+1];

        for (int i = 0; i < email.length() -1 ; i++) {
          //for(String each:change){

                result += email.substring(0,2);

        }
        System.out.println(result);

















    }
}
