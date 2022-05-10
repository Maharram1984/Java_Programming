package day50_inheritance.App;

public class AppSearch {
    public static void main(String[] args) {

        App obj1 = new App("FaceBook", 2.8);
        obj1.download();
        System.out.println(obj1);
        System.out.println();
        Instagram obj2 = new Instagram("Instagram", 4.4);
        obj2.download();
        obj2.postPicture();
        System.out.println(obj2);
        System.out.println();
        Youtube obj3 = new Youtube("YouTube", 5.8);
        obj3.download();
        obj3.watchVideo();
        System.out.println(obj3);


    }
}
