package day37_wrapper_arraylist;

public class WrapperClassEx {
    public static void main(String[] args) {
        byte a1 = 10;
        short b1 = 20;
        int c1 = 30;

        Byte a2 = a1;    // Autoboxing byte -->> Byte wrapper class object
        Short b2 = b1;   // Autoboxing short -->> Short wrapper class object
        Integer c2 = c1; // Autoboxing int -->> Integer wrapper class object

        byte a3 = a2;   // Also unboxing Byte -->> byte primitive type
        short b3 = b2;  // Also unboxing Short -->> short primitive type
        int c3 = c2;    // Also unboxing Integer -->> int primitive type

        String str = "123";
        Integer num1 = Integer.parseInt(str); //converting String to the wrapper class object
        int num2 = Integer.parseInt(str);     //Also converts non-primitive String to primitive type int
        String str2 = "1.5";
        Double n1 = Double.valueOf(str2);     //converting String to the wrapper class object
        double n2 = Double.valueOf(str2);     //Also converts non-primitive String to primitive type int















    }
}
