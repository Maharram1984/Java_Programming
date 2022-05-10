package day33_methods;

public class MyFirstMethod {

    public static void helloWorld(){
        System.out.println("Hello World");
    }
    public static void helloWorld50(){
        for(int i = 0; i < 10; i++){
            System.out.println("Hello World Today");
        }
    }
    public static void main(String[] args) {
        helloWorld();

        helloWorld50();
    }


}
