package obiektowe.inheritance.task2.main;

import obiektowe.inheritance.task2.*;

public class Main {
    public static void main(String[] args) {

        King king = new King("Arthur");
        Peasant peasant = new Peasant("Bob");
        Soldier soldier = new Soldier("Kate");
        Townsman townsman = new Townsman("Alice");

        Town town = new Town(king, peasant, soldier, townsman);
        System.out.println(town.howManyCanVote());
        town.whoCanVote();


    }
}
