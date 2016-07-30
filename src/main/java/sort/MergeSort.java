package sort;

public class MergeSort {

    public static void sort(final int[] toSort, final int high) {
        for (int step = 1; step < high; step *= 2) {
            for (int i = 0; i < high; i += 2 * step) {
                merge(toSort, i, Math.min(i + step, high), Math.min(i + 2 * step, high));
            }
        }
    }

    public static void merge(final int[] arr, final int low, final int middle, final int high) {
        final int leftCopySize = middle - low;
        final int rightCopySize = high - middle;

        int[] left = new int[leftCopySize];
        int[] right = new int[rightCopySize];

        for (int i = 0; i < leftCopySize; i++) left[i] = arr[low + i];
        for (int i = 0; i < rightCopySize; i++) right[i] = arr[middle + i];

        int lWalker = 0;
        int rWalker = 0;
        int i;
        for (i = low; i < high; i++) {
            if (lWalker == leftCopySize || rWalker == rightCopySize) break;

            if (left[lWalker] <= right[rWalker]) {
                arr[i] = left[lWalker++];
            } else {
                arr[i] = right[rWalker++];
            }
        }

        if (lWalker < leftCopySize) {
            while (lWalker < leftCopySize) arr[i++] = left[lWalker++];
        } else {
            while (rWalker < rightCopySize) arr[i++] = right[rWalker++];
        }
    }
}
