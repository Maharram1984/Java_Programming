package day47_encapsulation;

import day44_CustomClasses.Song;
import day46_Static.CydeoStudent;

public class Encapsulation {
    public static void main(String[] args) {

        CydeoStudent emre = new CydeoStudent("Emre", 5);
        System.out.println(emre);

        System.out.println();
        CydeoStudent.printInfo();  // same 1

        System.out.println();
        emre.printInfo();          // same 2

        System.out.println();

        System.out.println(CydeoStudent.instructors[4]);
        System.out.println(emre.name);  // Emre
        System.out.println(emre.schoolName); // Cydeo

        for (String each : CydeoStudent.instructors){
            System.out.print(each + " ");
        }










    }
}
