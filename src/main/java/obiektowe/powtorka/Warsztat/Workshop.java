package obiektowe.powtorka.Warsztat;

import java.util.Arrays;

public class Workshop {
    private Car car;
    private Recipt recipt = new Recipt();

    public Workshop(Car car) {
        this.car = car;
    }

    public void tireRepair(){
        for (Tire tire : car.getTires()){
            if (tire.isFlat()){
                tire.repairTire();
            }
        }
        System.out.println(recipt);
    }
}
