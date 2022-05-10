package ArrayListTask2;

import java.util.ArrayList;
import java.util.Arrays;

public class ddd {
    public static void main(String[] args) {


        ArrayList<Integer> ArrayList1 = new ArrayList<>();
        ArrayList1.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum = 0;
        for (int i : ArrayList1)
            sum += i;
        System.out.println("The sum is " + sum);    // The sum is 55
        int y[]=new int[]{6,-6,5,1,2,8};
        ArrayList<Integer> g= new ArrayList<>();
        int a=0;
        for(int i=0;i<y.length;i++){
            if(y[i]<0){
                a=y[i];
            }
        }
        String w = "";
        w= ""+a;
        int r=0;
        r= Integer.parseInt(""+w.charAt(1));
        for(int i=0;i<y.length;i++){
            if(y[i]<0){
                continue;
            }
            System.out.println(y[i]+"   "+r);
            if(y[i]==r){
                continue;
            }
            g.add(y[i]);
        }
        System.out.println(g);
    }
}