package day21_loops;

public class HelloWorld {
    public static void main(String[] args) {

        String a = "java";
        System.out.println(a.repeat(10));
       /*
        while(true){     ---->>  NEVER STOPS
            System.out.println("Hello World"); ---->>  NEVER STOPS
      }
        */
        int num = 1;
        while (num <= 10) {
            System.out.print(num++ +"- Hello World ");
        }

        System.out.println();
        int b = 1;
        while (b <= 30){
            System.out.print(" " + b);
            b++;
        }

    }
}
