package day26_NESTED_LOOPS;

public class g {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.print("A"+i);
            for (int j = 0; j < i; j++) {
                System.out.print("B"+j);
            }
            System.out.println();
        }
        System.out.println("--------------------------");

        String str = "java";
        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j <= i ; j++) {
                System.out.print(str.charAt(j));
            }
            System.out.println();
        }

      }
    }

