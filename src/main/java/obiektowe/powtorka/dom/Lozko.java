package obiektowe.powtorka.dom;

public class Lozko {
    private int dniOdPrzebraniaPoscieli;

    public Lozko(int dniOdPrzebraniaPoscieli) {
        this.dniOdPrzebraniaPoscieli = dniOdPrzebraniaPoscieli;
    }

    public void kiedyZmienionoPosciel(){
        System.out.println(dniOdPrzebraniaPoscieli);
    }

    public void poscielLozko(){
        dniOdPrzebraniaPoscieli = 0;
    }
}
