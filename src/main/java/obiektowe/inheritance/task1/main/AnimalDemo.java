package obiektowe.inheritance.task1.main;

import obiektowe.inheritance.task1.klasy.Animal;
import obiektowe.inheritance.task1.klasy.Goose;
import obiektowe.inheritance.task1.klasy.Jaguar;

import java.util.ArrayList;
import java.util.List;

public class AnimalDemo {
    public static void main(String[] args) {
        Goose goose = new Goose("Adam",2);
        Jaguar jaguar = new Jaguar("Izabela", 6);

        goose.honk();
        jaguar.climb();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(goose);
        animalList.add(jaguar);

        for (Animal animal : animalList){
            animal.makeASound();
            animal.goToSleep();
        }


    }
}
