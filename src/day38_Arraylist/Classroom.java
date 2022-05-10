package day38_Arraylist;

import java.util.ArrayList;

public class Classroom {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        System.out.println(group);
        System.out.println(group.size());

        group.add("Selo");
        group.add("Alex");
        group.add("Eda");
        group.add("Nav");
        group.add("Neli");
        System.out.println(group);
        System.out.println(group.size());

        System.out.println("First student: " + group.get(0));
        System.out.println("Second student: " + group.get(1));
        System.out.println("Third student: " + group.get(2));
        System.out.println("Forth student: " + group.get(3));
        System.out.println("Fifth student: " + group.get(4));

        System.out.println();

        for(int i = 0; i < group.size(); i++){
            System.out.println("Student " + (i + 1) + " " + group.get(i));
        }

        System.out.println();

        for(String student : group){ // student == group.get(PasswordCheck)
            System.out.println("Student " + student);
        }


        String ba = "9";
        System.out.println(ba);
        int a = 5;
        int b = 10;
        int c = 2;
        System.out.println(a*b-c+ba);
















    }
}
