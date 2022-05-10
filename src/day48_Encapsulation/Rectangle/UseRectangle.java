package day48_Encapsulation.Rectangle;

import day48_Encapsulation.Rectangle.Rectangle;

public class UseRectangle {
    public static void main(String[] args) {

        Rectangle size = new Rectangle(5, 5);

        System.out.println(size.getLength());
        System.out.println(size.getWidth());
        System.out.println(size.calculateArea());
        System.out.println(size.calculatePerimeter());
        System.out.println(size);

        size.setWidthAndLength(3, 3);
        System.out.println(size);

    }
}
