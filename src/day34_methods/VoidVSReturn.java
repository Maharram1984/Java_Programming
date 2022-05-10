package day34_methods;

public class VoidVSReturn {
    public static void main(String[] args) {

        sayHello(); //void

        sayBye();
        System.out.println(sayBye());//return works like that
        String msg = sayBye();
        System.out.println(msg);
    }

    public static void sayHello(){
        System.out.println("Hello");
    }

    public static String sayBye(){
        System.out.println("HI");
        return "Bye";
    }





}
