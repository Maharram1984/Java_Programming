package AInterviewPreparation;

public class Task17_ChangeVariableAmount2 {
/*    //17
    int  a = 10;
    int  b  = 20;
    output
    a  20
    b  10 */

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " +a);
        System.out.println("b: " +b);
    }
}
