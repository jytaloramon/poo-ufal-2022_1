import java.util.Comparator;

import algorithm.BubbleSort;
import algorithm.IAlgorithmSort;
import algorithm.SelectionSort;
import sort.SortMachine;

public class App {
    public static void main(String[] args) throws Exception {

        // Ordenação de String

        Comparator comparatorString = new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        };

        IAlgorithmSort bubbleString = new BubbleSort(comparatorString);
        SortMachine sortMachineBubbleString = new SortMachine(bubbleString,
                new String[] { "z", "a", "x", "m", "n", "g" });

        printArraySorted("Bubble Sort <String>", sortMachineBubbleString);

        IAlgorithmSort selectionString = new SelectionSort(comparatorString);
        SortMachine sortMachineSelectionString = new SortMachine(selectionString,
                new String[] { "z", "a", "x", "m", "n", "g" });

        printArraySorted("Selection Sort <String>", sortMachineSelectionString);

        // Ordenação de Inteiros

        Comparator comparatorInt = new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return a - b;
            }
        };

        IAlgorithmSort bubbleInt = new BubbleSort(comparatorInt);
        SortMachine sortMachineBubbleInt = new SortMachine(bubbleInt,
                new Integer[] { 90, 10, 1, 2, 0, 4, 6, 0, -1, 11 });

        printArraySorted("Bubble Sort <Int>", sortMachineBubbleInt);

        IAlgorithmSort selectionInt = new SelectionSort(comparatorInt);
        SortMachine sortMachineSelectionInt = new SortMachine(selectionInt,
                new Integer[] { 90, 10, 1, 2, 0, 4, 6, 0, -1, 11 });

        printArraySorted("Selection Sort <Int>", sortMachineSelectionInt);
    }

    public static void printArraySorted(String text, SortMachine sortMachine) {
        System.out.println("---- " + text + " ----");

        System.out.print("Entrada\n -");
        for (Object o : sortMachine.getArraySource())
            System.out.print(" " + o);
        System.out.println("\n");

        sortMachine.runSort();

        // sortMachine.runSort(2); Início index 2 - ATÉ O FINAL
        // sortMachine.runSort(2, 6); Início index 2 - FINAL index (6 - 1 = 5)

        System.out.print("Saída\n -");
        for (Object o : sortMachine.getArraySource())
            System.out.print(" " + o);
        System.out.println("\n\n");
    }
}
