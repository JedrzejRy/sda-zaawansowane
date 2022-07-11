package obiektowe.zadania.zadanie_4;

public class Square extends Rectangle{

    public Square(double width) {
        super(width, width);
    }

    public Square(String color, boolean isFilled, double width) {
        super(color, isFilled, width, width);
    }
}
