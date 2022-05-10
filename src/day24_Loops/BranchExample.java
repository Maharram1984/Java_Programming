package day24_Loops;

public class BranchExample {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {            //  it is 1 to 10
            System.out.print(i +" ");
        }
        System.out.println("--------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i +" ");
            break;                              // it stopped because of break and  it is 0
        }
        System.out.println("---------------------------------");

        for (int i = 0; i <= 10; i++) {
            System.out.print(i +" ");
           if(i == 5){                        // it stopped after 5 it is 5
               break;
           }
        }
        System.out.println("----------------------------------");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i +" ");
            if(i == 5){                        // nothing will happen it is 10
               continue;

            }
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i <= 10; i++) {

            if(i == 5){                        // removed 5 from there
                continue;
            }
            System.out.print(i +" ");
        }

        System.out.println("-------------------------------------");
        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 1){                        // it gives you even numbers
                continue;
            }
            System.out.print(i +" ");
        }
        System.out.println("--------------------------------------");

        for (int i = 0; i <= 10; i++) {
            if(i % 2 == 0){                        // it gives you odd numbers
                continue;
            }
            System.out.print(i +" ");
        }










    }
}
