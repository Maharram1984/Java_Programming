package day36_OverloadingMethod;

public class TypePromotion {

    public static void main(String[] args) {
        use(1);    // if it is not int here it will call long
        use(3.5);  // by default, it will call double automatically
        use(1.2f); // float will call
        use(3L);   // long will call
        use(5F);   // float will call
        // if u call type but type is not there it will call bigger one than it
        // But there is not bigger number than double.
        use((double) 1); // it will cast int to double
    }
    public static void use(float f){System.out.println("calling float method");}
    public static void use(double d){
        System.out.println("calling double method");
    }
    public static void use(long l){
        System.out.println("calling long method");
    }
}
