package TASK;

public class important {
    public static void main(String[] args) {

        int c = 50;
        int d = c++ + --c + ++c + c--;
         //    50      50   50    51
        System.out.println(c); // 50
        System.out.println(d); // 196

        int w = 50;
        w = w++;
        w = --w;
        w = ++w;
        w = w--;





        int a = 20;
        int b = -a-- + a++ + --a * a++;
           /*   -20  + 19  +  19 * 19
                      -1   +   361 = 360

                                        */
        System.out.println(a); //20
        System.out.println(b); //360

        int m = 50;
        m = ++m;
        m = ++m;
        m = ++m;
        m = ++m;
        System.out.println("m");

    }
}
