package day06_arithmetic_operators;

public class DifferentTypes {
    public static void main(String[] args) {

        System.out.println(10 - 5);      // int/int
        System.out.println(10 * 5);

        System.out.println(10.0 / 5);   // double/int
        System.out.println(10.0 / 5.0); // double/double

        System.out.println(10 /5.0);     // int to double

        System.out.println((int)(10.0 / 5.0)); // double to int

        System.out.println((int)10.5 / 5);     // same here as well

        System.out.println((double)10 / 5);    // int to double

        byte b1 = 10;
        byte b2 = 20;
        System.out.println(b1+b2);
      /*
        byte sum b1 + b2; - this is will
         not work because the values get
         changed to int during the calculation
       */
        int sum = b1 + b2;
        byte sumByte = (byte)(b1 + b2);
        System.out.println(sum);
        System.out.println(sumByte);





         int q = 100;
         int w = 200;
         int e = 300;
         double r = 600;
        System.out.println(q+w+e+r);
         r = 600;
         int a =(int) r;
        System.out.println(r);
        System.out.println(a);
        double soup = 100d/3;
        System.out.println(soup);








    }
}
