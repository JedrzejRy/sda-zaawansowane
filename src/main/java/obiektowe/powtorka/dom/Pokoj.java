package obiektowe.powtorka.dom;

public class Pokoj {
    private Okno[] okna;
    private Lozko lozko;

    public Pokoj(Okno[] okna, Lozko lozko) {
        this.okna = okna;
        this.lozko = lozko;
    }

    public Pokoj() {
        Okno okno = new Okno();
        Okno okno1 = new Okno();
        this.okna = new Okno[]{okno, okno1};
        this.lozko = new Lozko(5);
    }

    public Okno[] getOkna() {
        return okna;
    }

    public Lozko getLozko() {
        return lozko;
    }
}
