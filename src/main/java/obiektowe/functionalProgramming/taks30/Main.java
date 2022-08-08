package obiektowe.functionalProgramming.taks30;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Integer> numberList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numberList.add(new Random().nextInt(101));
        }
        System.out.println(numberList);

        numberList.forEach(number -> System.out.println(number));

        List<Integer> sortedList = numberList.stream()
                .sorted()
                .toList();
        System.out.println(sortedList);

        long count = numberList.stream()
                .filter(number -> number % 2 == 0)
                .count();
        System.out.println(count);

        List<Integer> numbersLargerThenFifty = numberList.stream()
                .filter(number -> number <= 50)
                .toList();
        System.out.println(numbersLargerThenFifty);

        int firstNumber = numberList.stream()
                .sorted((number, number2) -> number2 - number)
                .findFirst()
                .get();
        System.out.println(firstNumber);

    }

}
