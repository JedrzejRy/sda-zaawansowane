package obiektowe.powtorka.warsztat;

import java.util.Arrays;

public class WorkshopDemo {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        for (int i = 0; i < tires.length; i++) {
            tires[i] = new Tire();
        }

        Car car = new Car(tires);

        car.setFlatTire();

        System.out.println(Arrays.toString(car.getTires()));

        System.out.println();

        Workshop workshop = new Workshop(car);
        workshop.tireRepair();
        System.out.println(Arrays.toString(car.getTires()));


    }
}

