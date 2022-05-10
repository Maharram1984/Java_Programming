package day42_CustomClasses;

public class Item {

    String name;
    double price;

    @Override // can ignore,delete
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
}
}
