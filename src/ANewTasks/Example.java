package ANewTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Example {
    public static void main(String[] args) {
//        float f = Float.parseFloat("25");
//        String g = Float.toString(25.0f);
//        String s = Integer.toString(25);
//        String a = Float.toString(25.0f);
//        System.out.println(f + " is Float");
//        System.out.println(Arrays.toString(a.split("")));
//        System.out.println(s + " is String");
//        System.out.println(g + " is String");

        int[] arr = {6, -6, 5, 1, 2, 8};
        String s = "";
        int n = 0;

        for (int k : arr) {
            if (k < 0) {
                n = k;
                for (int j : arr) {
                    if (j + n == 0 || j + (-n) == 0) {
                        continue;
                    }
                    s += j;
                }
            }
        }
        System.out.println(Arrays.toString(s.split("")));
        int y[]=new int[]{6,-6,5,1,2,8};

        ArrayList<Integer> list=new ArrayList<>();

        for (int each:y){
            if (each>0 && each!=6) {
                list.add(each);}
        }
        System.out.println(list);
    }
}
