package Day27_NestedLoop;

import java.util.Scanner;

public class FinraRange {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your stopping point");
//        int stop = input.nextInt();
int stop = 30;
        for (int i = 1; i <= stop; i++) {

            String str = "";
            if (i % 3 == 0) {
                str += "FIN";
            }
            if (i % 5 == 0) {
                str += "RA";
            }

          //  System.out.print(str.isBlank() ? PasswordCheck+", " : str+", ");
            System.out.print(str.isEmpty() ? i+", " : str+", ");
        }




    }
}
