package obiektowe.functionalProgramming.challange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonDemo {
    //za zadanię można otrzymać 14 punktów po 1 za każdą zaimplementowaną abstrakcyjną metodę

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Marcin", "Zbyszek", "Kasia", "Zosia", "Kasia", "Magda", "Iza"));
        int[] primeNumbers = {2, 79, 83, 41, 43, 47, 53, 59, 13, 17, 83, 31,
                37, 61, 67, 89, 3, 5, 7, 7, 11, 71, 73, 97, 19, 19, 23, 29};

        StreamService streamService = new MyStreamService();

        //miejsce na Twoje testy zaimplementowanych metod. Jeśli umiesz możesz wykonać testy jednostkowe udowadniające
        //poprawne działanie zaimplementowanych metod
        streamService.sortAndPrint(names);
        System.out.println(streamService.distinctAndCountNumbers(primeNumbers));
        System.out.println(streamService.computeMaleNames(names));
        streamService.printNumbersOfRange(primeNumbers,0,10);
        System.out.println(streamService.computeNamesLength(names));

        System.out.println();

        List<Person> people = streamService.buildPeopleWithNames(names);
        System.out.println(people);

        System.out.println();

        System.out.println(streamService.findPeopleOfIdGreaterThan(people, 2));
        System.out.println(streamService.hasSenior(people));
        System.out.println(streamService.sumTotalCash(people));
        System.out.println(streamService.findRichestPerson(people));
        System.out.println(streamService.computeAverageAge(people));

        //List<Person> people = streamService.buildPeopleWithNames(names);
        //od tego momentu wykorzystuj również zbiór people do testu metod wykorzystujących argument List<Person>

    }

}
