package obiektowe.zadania.zadanie_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(3,4,8,9);
        System.out.println(Arrays.toString(line.middlePoint()));
        System.out.println(line.length());

    }
}
