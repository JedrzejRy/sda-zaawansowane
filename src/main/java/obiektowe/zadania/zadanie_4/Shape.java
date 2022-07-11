package obiektowe.zadania.zadanie_4;

public abstract class Shape {

    protected String color;
    protected boolean isFilled;

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public Shape() {
        this.color = "Unknown";
        this.isFilled = false;
    }

    abstract double getArea();

    abstract double getPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    @Override
    public String toString() {
        return "Shape with color of " + color + " and " + isFilled;
    }
}
