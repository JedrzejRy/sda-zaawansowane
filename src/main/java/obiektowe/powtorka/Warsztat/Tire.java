package obiektowe.powtorka.Warsztat;

public class Tire {
    private double pressure = 2.2;
    private boolean flat = false;


    @Override
    public String toString() {
        return "Tire{" +
                "pressure=" + pressure +
                ", flat=" + flat +
                '}';
    }

    public void setFlatTire(){
        flat = true;
    }

    public void repairTire(){
        this.flat = false;
    }

    public boolean isFlat() {
        return flat;
    }
}
