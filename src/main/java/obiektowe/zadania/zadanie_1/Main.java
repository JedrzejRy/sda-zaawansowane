package obiektowe.zadania.zadanie_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(3,4);
        System.out.println(point2D);
        System.out.println(Arrays.toString(point2D.getXY()));

        System.out.println();

        Point3D point3D = new Point3D(2,3,4);
        System.out.println(point3D);
        System.out.println(Arrays.toString(point3D.getXYZ()));
    }
}
