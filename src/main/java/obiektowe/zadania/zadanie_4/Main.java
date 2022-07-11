package obiektowe.zadania.zadanie_4;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", true,8);
        System.out.println(circle.toString());

        Rectangle rectangle = new Rectangle("Blue", false, 11,8);
        System.out.println(rectangle.toString());

        Square square = new Square("Black", true,5);
        System.out.println(square.toString());

    }

}
