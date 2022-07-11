package obiektowe.zadania.zadanie_4;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle() {
        super.color = "unknown";
        super.isFilled = false;
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    double getArea() {
        return width*length;
    }

    @Override
    double getPerimeter() {
        return (2*width)+(2*length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rectangle with perimeter= " + getPerimeter() + " which is a subclass off " + super.toString();
    }
}
