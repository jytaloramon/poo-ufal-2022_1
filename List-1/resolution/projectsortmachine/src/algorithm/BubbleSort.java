package algorithm;

import java.util.Comparator;

public class BubbleSort extends AlgorithmSort {

    public BubbleSort(Comparator comparator) {
        super(comparator);
    }

    @Override
    public void sort(Object[] arr, int start, int end) {

        for (int i = start; i < end; ++i) {
            for (int j = start; j < end - (i - start + 1); ++j) {
                if (comparator.compare(arr[j], arr[j + 1]) > 0) {
                    Object aux = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = aux;
                }
            }
        }
    }

}
