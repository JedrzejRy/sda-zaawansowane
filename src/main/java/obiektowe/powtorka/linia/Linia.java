package obiektowe.powtorka.linia;

import java.util.Random;

public class Linia {
    private int dlugosc;
    private String wypelnienie;

    public Linia(int dlugosc, String wypelnienie) {
        this.dlugosc = dlugosc;
        this.wypelnienie = wypelnienie;
    }

    public Linia() {
        Random random = new Random();
        this.dlugosc = random.nextInt(50)+1;
        this.wypelnienie = "#";
    }

    public int getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(int dlugosc) {
        this.dlugosc = dlugosc;
    }

    void drukujLinie(){
        for (int i = 0 ; i<=dlugosc; i++) {
            System.out.print(wypelnienie);
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "dlugosc= " + dlugosc + "\n" + "wypelnienie= " + wypelnienie;
    }
}
