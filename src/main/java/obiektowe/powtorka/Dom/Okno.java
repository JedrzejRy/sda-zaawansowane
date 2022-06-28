package obiektowe.powtorka.Dom;

public class Okno {
    private boolean czyOtwarte;

    public void otworzOkno(){
        czyOtwarte = true;
    }
    public void zamknijOkno(){
        czyOtwarte = false;
    }

    public void setCzyOtwarte(boolean czyOtwarte) {
        this.czyOtwarte = czyOtwarte;
    }

    @Override
    public String toString() {
        return "Okno{" +
                "czyOtwarte=" + czyOtwarte +
                '}';
    }
}
