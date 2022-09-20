package sort;

import algorithm.IAlgorithmSort;

public class SortMachine implements ISort {

    private final IAlgorithmSort algorithmSort;

    private final Object[] arraySource;

    public SortMachine(IAlgorithmSort algorithmSort, Object[] arraySource) {
        this.algorithmSort = algorithmSort;
        this.arraySource = arraySource;
    }

    public Object[] getArraySource() {
        return arraySource;
    }

    @Override
    public void runSort() {
        algorithmSort.sort(arraySource, 0, arraySource.length);
    }

    @Override
    public void runSort(int start) {
        algorithmSort.sort(arraySource, start, arraySource.length);
    }

    @Override
    public void runSort(int start, int end) {
        algorithmSort.sort(arraySource, start, end);
    }

}
