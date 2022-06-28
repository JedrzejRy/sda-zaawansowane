package obiektowe.powtorka.samochod;

import java.util.Random;

public class Samochod {
    private String marka;
    private int przebieg;
    private int przebiegDoPrzegladu = 20000;

    public Samochod(String marka, int przebieg) {
        this.marka = marka;
        this.przebieg = przebieg;
    }

    public Samochod() {
        this.marka = "Audi";
        Random random = new Random();
        this.przebieg = random.nextInt(20000)+1;
    }


    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    void przebiegIMarka(){
        System.out.println(przebieg+"km");
        System.out.println(marka);

    }

    void zwiekszPrzebieg(int odleglosc){
        przebieg += odleglosc;
    }

    void kiedyPrzeglad(){
        System.out.println(przebiegDoPrzegladu-przebieg+"km");
    }

    @Override
    public String toString() {
        return "Samochod{" +
                "marka='" + marka + '\'' +
                ", przebieg=" + przebieg +
                ", przebiegDoPrzegladu=" + przebiegDoPrzegladu +
                '}';
    }
}
