package day51_inheritance.lyft;

public class CarRide {
    public static void main(String[] args) {

        Lyft obj1 = new Lyft("James",35,789456);
        System.out.println(obj1.calculateRate(10));
        System.out.println(obj1);
        LyftXL obj2 = new LyftXL();
        System.out.println(obj2.calculateRate(10));
        System.out.println(obj2);
        Lyft obj3 = new LyftXL();
        System.out.println(obj3.calculateRate(10));
        System.out.println(obj3);

    }
}
