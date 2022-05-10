package ANewTasks;

import java.util.ArrayList;

public class RemoveSix {
    public static void main(String[] args) {
        //input [6,-6,5,1,2,8] --->> Output [5,1,2,8]
        int[] str = new int[]{6, -6, -6, -1, 2, 8};
        ArrayList<Integer> result = new ArrayList<>();
        int a = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i] < 0){
                a = str[i];    // a = -6
            }
        }
        String b = "";
        b = "" + a;            // Converted int a(-6) -->> to String b(6)
        int c = 0;
        c = Integer.parseInt("" + b.charAt(1)); // Converted String b(6) -->> to int c(6).We missed (-)

        for (int i = 0; i < str.length; i++) {
            if(str[i] < 0){
                continue;      // we will miss -6 here by keeping it
            }
            if(str[i] == c){   // c is 6
               continue;       // we will miss 6 here by keeping it
            }
            result.add(str[i]);
        }
        System.out.println(result);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++");
        int[] w = {8, -8, -5, -1, 2, 8};
        ArrayList<Integer> res = new ArrayList<>();

        for (int each : w){
            if(each > 0 && each != 8){
                res.add(each);
            }
        }
        System.out.println(res);





    }
}