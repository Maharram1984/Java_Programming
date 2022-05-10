package day48_Encapsulation.Square;

import day48_Encapsulation.Square.Square;

public class UseSquare {
    public static void main(String[] args) {

        Square obj = new Square(5);
        System.out.println(obj);

        obj.setSide(10);
        System.out.println(obj.getSide());

        System.out.println(obj);


    }
}
