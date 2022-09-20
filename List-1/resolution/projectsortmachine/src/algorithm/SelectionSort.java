package algorithm;

import java.util.Comparator;

public class SelectionSort extends AlgorithmSort {

    public SelectionSort(Comparator comparator) {
        super(comparator);
    }

    @Override
    public void sort(Object[] arr, int start, int end) {
        int idxMin = 0;

        for (int i = start; i < end; ++i) {
            idxMin = i;
            for (int j = i + 1; j < end; ++j) {
                if (comparator.compare(arr[j], arr[idxMin]) < 0)
                    idxMin = j;
            }

            if (idxMin != i) {
                Object aux = arr[idxMin];
                arr[idxMin] = arr[i];
                arr[i] = aux;
            }
        }
    }

}
