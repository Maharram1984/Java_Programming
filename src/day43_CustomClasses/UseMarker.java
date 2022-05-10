package day43_CustomClasses;

public class UseMarker {
    public static void main(String[] args) {

   /*   Before
        Marker marker = new Marker();
        marker.type = "Dry Erase";
        marker.brand = "Expo";
        marker.color = "Red";  */

        Marker marker1 = new Marker("Dry Erase","Expo","Red");
        System.out.println(marker1);
    }
}
