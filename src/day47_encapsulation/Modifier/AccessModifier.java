package day47_encapsulation.Modifier;

public class AccessModifier {

    public int a;  // public
    int b;         // default
    private int c; // private

    public static int x;   // public
    static int y;          // default
    private static int z;  // private

    // IN THE SAME CLASS WE CAN ACCESS ALL MODIFIERS
    // ALL OF THOSE ARE VISIBLE

    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
        System.out.println(AccessModifier.z);

        // access all the information


    }
}
