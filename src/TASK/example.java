package TASK;

public class example {
    public static void main(String[] args) {

        int i = 5;
        System.out.println(i);      // 5

        int z = i++;
        System.out.println(z);      //5
        System.out.println(i);      //6

        int y = z++;
        System.out.println(y);       //5
        System.out.println(z);       //6

        int w = y + z;
        System.out.println(w);       //11
        System.out.println(y);       //5
        System.out.println(z);       //6

        int m = --y;
        System.out.println(m);      //4
        System.out.println(y);      //4

        int l = w++ + --m;
        System.out.println(m);      //3
        System.out.println(w);       //12

        System.out.println(l);       //14









    }





}
