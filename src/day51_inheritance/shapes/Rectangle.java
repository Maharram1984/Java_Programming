package day51_inheritance.shapes;

public class Rectangle extends Shape{

     double width;
     double length;

    public Rectangle(double width, double length) {
        super("R");
        this.width = width;
        this.length = length;
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
