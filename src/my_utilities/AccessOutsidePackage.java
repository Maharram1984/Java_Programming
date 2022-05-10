package my_utilities;

import day47_encapsulation.Modifier.AccessModifier;

public class AccessOutsidePackage {
    public static void main(String[] args) {

        // OUTSIDE OF PACKAGE
        // DIFFERENT PACKAGE, DIFFERENT CLASS

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.a);
      // ONLY PUBLIC WORKS OUTSIDE OF PACKAGE
      //  System.out.println(obj.b); //DEFAULT
      //  System.out.println(obj.c); //PRIVATE

        System.out.println(AccessModifier.x);
      // ONLY PUBLIC WORKS OUTSIDE OF PACKAGE
      //  System.out.println(obj.y); //DEFAULT
      //  System.out.println(AccessModifier.z); //PRIVATE

        // c and z are not accessible outside of class because they are private
        // b and y are not accessible outside of package because they are default


    }
}
