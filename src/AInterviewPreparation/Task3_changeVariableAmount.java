package AInterviewPreparation;

public class Task3_changeVariableAmount {
    /*    int a=5;
          int b=6;
          change and print
          a==6;
          b==5;  */
    public static void main(String[] args) {

        int a = 5;
        int b = 6;
        a = a + b; // 5 + 6 = 11
        b = a - b; // 11 - 6 = 5
        a = a - b; // 11 - 5 = 6

        System.out.println(a);
        System.out.println(b);
    }
}
