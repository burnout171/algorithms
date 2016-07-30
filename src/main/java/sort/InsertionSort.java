package sort;

public class InsertionSort {

    public static void sort(final int[] toSort) {
        for (int i = 1; i < toSort.length; i++) {
            int key = toSort[i];
            int j = i - 1;
            while (j >= 0 && toSort[j] > key) {
                toSort[j + 1] = toSort[j];
                j--;
            }
            toSort[j + 1] = key;
        }
    }
}
