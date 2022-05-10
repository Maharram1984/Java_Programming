package day36_OverloadingMethod;

public class Picture {

    public static void draw(){
        System.out.println("trying to draw");
    }

    public static void draw(String color){
        System.out.println("draw with " + color + " color");
    }
    public static void draw(int size){
        System.out.println("drawing with size "+size);
    }

    public static void draw(int size,int size2){
        System.out.println("drawing with size "+size+ " and "+size2);
    }
    public static void draw(String color, String color2){System.out.println("drawing with color "+color+ " and with "+color2);}

    public static void draw(String color ,int size){System.out.println("drawing with "+color+ " color "+size+ " times");}
    public static void draw(int size, String color){System.out.println("drawing with "+color+ " color "+size+ " times");}




}
