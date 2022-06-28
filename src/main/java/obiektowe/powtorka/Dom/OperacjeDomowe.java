package obiektowe.powtorka.Dom;

public class OperacjeDomowe {

    public static void otworzWszytkieOkna(Okno[] okna){
        for (Okno okno: okna){
            okno.otworzOkno();
        }
    }

    public static void sprzataniePokoju(Pokoj pokoj){
        otworzWszytkieOkna(pokoj.getOkna());
        pokoj.getLozko().poscielLozko();
    }



}
