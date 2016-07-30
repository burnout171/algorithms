package sort;

public class QuickSort {

    public static void sort(final int[] toSort, final int low, final int high) {
        if (low < high) {
            final int pivotPosition = partition(toSort, low, high);
            sort(toSort, low, pivotPosition - 1);
            sort(toSort, pivotPosition + 1, high);
        }
    }

    private static int partition(final int[] arr, final int low, final int high) {
        final int pivot = arr[high];

        int i = low;
        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, high);

        return i;
    }

    private static void swap(final int[] arr, final int first, final int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
