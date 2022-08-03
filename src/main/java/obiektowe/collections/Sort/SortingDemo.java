package obiektowe.collections.Sort;

import java.util.LinkedList;
import java.util.List;

public class SortingDemo {
    public static void main(String[] args) {
        SortingAlgorithm sortingAlgorithm = new SortingAlgorithm();
        List<Integer> numbers = new LinkedList<>(List.of(12,34,9,55,44,1,7,99,2,44));
        sortingAlgorithm.BubbleSort(numbers);
        System.out.println(numbers);

        numbers = new LinkedList<>(List.of(12,34,9,55,44,1,7,99,2,44));
        sortingAlgorithm.SelectionSort(numbers);
        System.out.println(numbers);

    }
}
