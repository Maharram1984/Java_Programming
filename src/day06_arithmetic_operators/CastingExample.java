package day06_arithmetic_operators;

public class CastingExample {
    public static void main(String[] args) {

        short num1 = 40;
        float num2 = num1;
        System.out.println(num1);
        System.out.println(num2);

        float num3 = 100.5f;
        short num4 = (short) num3;
        System.out.println(num3);
        System.out.println(num4);

        float num5 = 100; //  100 is int by default -- automatically convert to float
        byte num6 = (byte)num5;
        System.out.println(num5);
        System.out.println(num6);


        char letter = 'A';
        int letter1 = letter;
        int letter2 = (int) letter;
        System.out.println(letter);
        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println((double)100);
        System.out.println((int) 100.5);
        System.out.println((char) 65);
        System.out.println((char)66);
        System.out.println((int) '&');
        System.out.println((byte)100.51);
        int a = 100;
        double b = a;

        System.out.println(b);


















    }




}
