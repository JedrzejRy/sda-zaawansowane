package obiektowe.zadania.zadanie_4;

public class Circle extends Shape {

    private int radius;

    public Circle() {
        radius = 1;
        super.color = "unknown";
        super.isFilled = false;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.pow((3.14*radius),2);
    }

    @Override
    double getPerimeter() {
        return 2*3.14*radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle with radius= " + getPerimeter() + " which is a subclass off " + super.toString();
    }
}
