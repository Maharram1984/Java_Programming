package day38_Arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {

        ArrayList<String> group = new ArrayList<>();
        group.add("Ziba");
        System.out.println(group); // [Ziba]

        group.add(0, "Victor");
        System.out.println(group); // [Victor, Ziba]

        System.out.println(group.get(0)); // Victor
        System.out.println(group.get(1)); // Ziba

        group.add("Ozi");
        System.out.println(group); //[Victor, Ziba, Ozi]

        group.add(1, "James");
        System.out.println(group);//[Victor, James, Ziba, Ozi]

        System.out.println(group.add("Emre"));//true
        System.out.println(group);//[Victor, James, Ziba, Ozi, Emre]

        char ba = '9';
        int a = 5;
        int b = 10;
        int c = 2;
        System.out.println(ba+a*b-c);


        String ac = "natavan";
        String ad = "";

        for (int i = 0; i < ac.length(); i++) {
            ad+=ac.charAt(i);
            System.out.print((int)ad.charAt(i) + " ");
        }














    }
}
