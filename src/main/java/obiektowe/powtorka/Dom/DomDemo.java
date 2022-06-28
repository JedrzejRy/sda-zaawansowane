package obiektowe.powtorka.Dom;

import java.util.Arrays;

public class DomDemo {
    public static void main(String[] args) {
        Okno okno1 = new Okno();
        Okno okno2 = new Okno();
        Okno okno3 = new Okno();
        Okno okno4 = new Okno();
        Okno[] okna = new Okno[]{okno1, okno2, okno3, okno4};

        OperacjeDomowe.otworzWszytkieOkna(okna);

        Lozko lozko = new Lozko(7);
        lozko.kiedyZmienionoPosciel();

        Pokoj pokoj = new Pokoj();
        Pokoj pokoj1 = new Pokoj(okna,lozko);
        Pokoj pokoje[] = new Pokoj[]{pokoj,pokoj1};

        Dom dom = new Dom(pokoje);

    }
}
