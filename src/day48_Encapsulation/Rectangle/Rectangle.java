package day48_Encapsulation.Rectangle;

public class Rectangle {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        setWidthAndLength(length, width);
    }

    public void setWidthAndLength(double length, double width) {
        if (length > 0) {
            this.length = length;
        }
        if (width > 0) {
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public String toString() {
        String str = "";
        str += "Rectangle: [length is " + length + ", width is " + width + ", calculate area is "
                + calculateArea() + ", calculate perimeter is " + calculatePerimeter() + "]";
        return str;
    }


}
