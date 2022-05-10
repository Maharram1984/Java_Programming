package day43_CustomClasses;

public class Marker {

    String type;
    String brand;
    String color;

    public Marker(String inputType, String inputBrand, String inputColor){
        type = inputType;
        brand = inputBrand;
        color = inputColor;
    }

    @Override
    public String toString() {
        return "Marker{" +
                "type='" + type + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

