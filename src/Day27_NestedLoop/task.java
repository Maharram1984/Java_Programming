package Day27_NestedLoop;

public class task {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                System.out.print("[*]\t");
            }
            System.out.println();
        }

        System.out.println("-------------------------");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("$\t");

            }
            System.out.println();
        }
    }
}
