package algorithm;

import java.util.Comparator;

public abstract class AlgorithmSort implements IAlgorithmSort {

    protected Comparator comparator;

    public AlgorithmSort(Comparator comparator) {
        this.comparator = comparator;
    }

}
