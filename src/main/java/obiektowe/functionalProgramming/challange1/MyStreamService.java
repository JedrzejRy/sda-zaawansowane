package obiektowe.functionalProgramming.challange1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamService implements StreamService {
    @Override
    public void sortAndPrint(List<String> names) {
        names.stream()
                .sorted()
                .forEach(name -> System.out.println(name));
    }

    @Override
    public int distinctAndCountNumbers(int[] numbers) {
        return Arrays.stream(numbers)
                .distinct()
                .sum();
    }

    @Override
    public List<String> computeMaleNames(List<String> names) {
        return names.stream()
                .filter(name -> name.endsWith("a"))
                .toList();

    }

    @Override
    public void printNumbersOfRange(int[] numbers, int minValue, int maxValue) {
        Arrays.stream(numbers)
                .filter(number -> number >= minValue && number <= maxValue)
                .forEach(number -> System.out.println(number));
    }

    @Override
    public List<Integer> computeNamesLength(List<String> names) {
        return names.stream()
                .map(name -> name.length())
                .toList();
    }

    @Override
    public List<Person> buildPeopleWithNames(List<String> names) {
      return   names.stream()
                .map(name -> new MyPerson(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<Person> findPeopleOfIdGreaterThan(List<Person> people, int id) {
        return people.stream()
                .filter(person -> person.getId() > id)
                .toList();
    }

    @Override
    public boolean hasSenior(List<Person> people) {
        return people.stream()
                .anyMatch(person -> person.getAge() > 60);
    }

    @Override
    public double sumTotalCash(List<Person> people) {
        return people.stream()
                .mapToDouble(person -> person.getCash())
                .sum();
    }

    @Override
    public Person findRichestPerson(List<Person> people) {
        return people.stream()
                .sorted((person, person2) -> (int) (person2.getCash() - person.getCash()))
                .findFirst()
                .orElse(null);

    }

    @Override
    public double computeAverageAge(List<Person> people) {
        return people.stream()
                .mapToDouble(person -> person.getCash())
                .average()
                .orElse(-1);
    }
}
