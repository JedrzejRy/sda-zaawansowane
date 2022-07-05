package obiektowe.powtorka.warsztat;

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
        this.pressure = 0.5;
    }

    public void repairTire(){
        this.flat = false;
        this.pressure = 2.2;
    }

    public boolean isFlat() {
        return flat;
    }
}
