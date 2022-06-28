package obiektowe.powtorka.Warsztat;

public class Workshop {
    private Car car;
    private Receipt receipt = new Receipt();

    public Workshop(Car car) {
        this.car = car;
    }

    public void tireRepair(){
        for (Tire tire : car.getTires()){
            if (tire.isFlat()){
                tire.repairTire();
            }
        }
        System.out.println(receipt);
    }
}
