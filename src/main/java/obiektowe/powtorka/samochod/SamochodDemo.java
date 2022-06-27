package obiektowe.powtorka.samochod;

public class SamochodDemo {
    public static void main(String[] args) {
        Samochod samochod = new Samochod("BMW", 1500);
        Samochod samochod2 = new Samochod("Alfa_Romeo", 17325);
        Samochod samochodtest = new Samochod();

        samochod.przebiegIMarka();
        samochod2.przebiegIMarka();
        System.out.println();
        samochod.zwiekszPrzebieg(170);
        samochod.przebiegIMarka();
        System.out.println();
        samochod.kiedyPrzeglad();


        System.out.println();
        Samochod[] tablicaSamochodow = new Samochod[]{samochod,samochod2};

        for (Samochod c : tablicaSamochodow){
            c.przebiegIMarka();
            c.kiedyPrzeglad();
        }

        System.out.println();
        samochodtest.przebiegIMarka();

        System.out.println(samochodtest.toString());




    }
}
