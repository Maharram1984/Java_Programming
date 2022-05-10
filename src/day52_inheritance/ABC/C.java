package day52_inheritance.ABC;

import day52_inheritance.ABC.A;
import day52_inheritance.ABC.B;

public class C {

    public static void main(String[] args) {
        A obj = new A();
        obj.instanceMethodA();
        A.staticMethod();

        System.out.println();

        B obj2 = new B();
        obj2.instanceMethodA();
        B.staticMethod();

    }
}
