package obiektowe.collections.Sort;

import java.util.List;

public class SortingAlgorithm {

    public void BubbleSort(List<Integer> numbers) {

        for (int j = 0; j < numbers.size(); j++) {
            for (int i = 0; i < numbers.size() - 1 - j; i++) {
                int first = numbers.get(i);
                int second = numbers.get(i+1);
                if (first > second) {
                    numbers.set(i, second);
                    numbers.set(i + 1, first);
                }
            }
        }
    }

    public void SelectionSort(List<Integer> numbers){
        for (int i = 0; i < numbers.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < numbers.size(); j++){
                if (numbers.get(j) < numbers.get(index)){
                    index = j;
                }
            }
            int smallerNumber = numbers.get(index);
            numbers.set(index, numbers.get(i));
            numbers.set(i, smallerNumber);
        }
    }

}
