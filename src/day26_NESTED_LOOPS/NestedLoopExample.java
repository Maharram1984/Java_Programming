package day26_NESTED_LOOPS;

public class NestedLoopExample {
    public static void main(String[] args) {

//        for (int PasswordCheck = 0; PasswordCheck < 3; PasswordCheck++) {
//            System.out.println("Hello World");
//        }
//        System.out.println("Hello Universe\n");
//
//        for (int PasswordCheck = 0; PasswordCheck < 3; PasswordCheck++) {
//            System.out.println("Hello World");
//        }
//        System.out.println("Hello Universe\n");
//
//        for (int PasswordCheck = 0; PasswordCheck < 3; PasswordCheck++) {
//            System.out.println("Hello World");
//        }
//        System.out.println("Hello Universe\n");

        System.out.println("-------------------------------------------");
         // outer loop
        for (int j = 0; j < 3; j++) {  // j = 1; j <= 3; j++; both give 3 executions/iteration
                  //inner loop
            for (int i = 0; i < 5; i++) {

                System.out.println("Hello World");
            }

            System.out.println("Hello Universe\n");

        }















    }

}
