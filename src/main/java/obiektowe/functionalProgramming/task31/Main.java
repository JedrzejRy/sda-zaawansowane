package obiektowe.functionalProgramming.task31;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Blcky", 5);
        Pet pet1 = new Pet("Howy", 3);
        Pet pet2 = new Pet("Crisp", 10);
        Pet pet3 = new Pet("Kong", 6);
        Pet pet4 = new Pet("Goofy", 2);

        Person john = new Person("Jonh", LocalDate.of(1999, Month.JANUARY, 15), new ArrayList<>(List.of()));
        Person elizabeth = new Person("Elizabeth", LocalDate.of(2004, Month.MAY, 6), new ArrayList<>(List.of(pet3)));
        Person alan = new Person("Alan", LocalDate.of(1987, Month.SEPTEMBER, 24), new ArrayList<>(List.of(pet, pet1, pet2)));

        List<Person> people = new ArrayList<>(List.of(john, elizabeth, alan));
        System.out.println(people);

        people.stream()
                .sorted(Comparator.comparing(Person -> Person.getName()))
                .map(Person -> Person.getName()) //Basic lambda method
                .forEach(System.out::println);

        people.stream()
                .sorted(Comparator.comparing(Person::getName))
                .map(Person::getName) //Lambda reference method
                .forEach(System.out::println);

        people.stream()
                .map(Person::getBirthday)
                .map(LocalDate::getMonth)
                .forEach(System.out::println);

        /* people.stream()
                .map(Person::getPets)
                .map(List::size)
                .forEach(System.out::println);
        */
        people.stream()
                .flatMap(person -> person.getPets().stream())
                .forEach(System.out::println);

//        people.forEach(Person -> {
//            if (Person.getName().length() == 4) {
//                System.out.println(Person.getName());
//            }
//        });
//
//        people.forEach(anon -> {
//            if (anon.getName().length() == 4) {
//                System.out.println(anon.getName());
//            }
//        });



    }


}
