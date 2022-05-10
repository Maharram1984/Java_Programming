package day47_encapsulation.Modifier;

import day47_encapsulation.Modifier.AccessModifier;

public class UsingAccessModifiersInSamePackage {
    public static void main(String[] args) {

        // IN THE SAME PACKAGE WE CAN ACCESS ONLY
        // PUBLIC, DEFAULT, PROTECTED

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
        System.out.println(obj.b);
      //  System.out.println(obj.c);

        System.out.println(AccessModifier.x);
        System.out.println(AccessModifier.y);
     //  System.out.println(AccessModifier.z);

        // c and z are not accessible outside of class because they are private


    }

}