package day36_OverloadingMethod;

public class Painter {
    public static void main(String[] args) {


        Picture.draw();

        String s = "200";
        Picture.draw(s);

        Picture.draw("red");
        Picture.draw(10);

        Picture.draw("blue", "green");
        Picture.draw(10,20);

        Picture.draw("blue",200);
        Picture.draw(200,"white");

    }
}
