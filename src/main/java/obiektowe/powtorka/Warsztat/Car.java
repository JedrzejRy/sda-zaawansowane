package obiektowe.powtorka.Warsztat;

import java.util.Random;

public class Car {
    private Tire[] tires;

    public Car(Tire[] tires) {
        this.tires = tires;
    }


    public Tire[] getTires() {
        return tires;
    }

    public void setFlatTire(){
        Random random = new Random();
        int i = random.nextInt(4);
        tires[i].setFlatTire();
        }
    }
