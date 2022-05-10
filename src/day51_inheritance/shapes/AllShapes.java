package day51_inheritance.shapes;

public class AllShapes {
    public static void main(String[] args) {

        Square obj1 = new Square(5);
        System.out.println(obj1);
        System.out.println(obj1.area());
        System.out.println(obj1.perimeter());

        Circle obj2 = new Circle(0.5);
        System.out.println(obj2);
        System.out.println(obj2.area());
        System.out.println(obj2.perimeter());

        Rectangle obj3 = new Rectangle(5,4);
        System.out.println(obj3);
        System.out.println(obj3.area());
        System.out.println(obj3.perimeter());


    }
}
