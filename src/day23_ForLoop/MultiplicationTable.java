package day23_ForLoop;

public class MultiplicationTable {
    public static void main(String[] args) {


        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(j + " x " + i + " = " + j * i + "\t");
            }
        }
        System.out.println();
        System.out.println("---------------------------------------");


        for (int i = 1; i <= 10; i++) {
            System.out.println();
            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }

        }
        System.out.println();
        System.out.println("------------------------------");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }

    }
}
