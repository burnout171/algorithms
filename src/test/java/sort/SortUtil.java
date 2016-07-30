package sort;

import java.util.Random;

public class SortUtil {

    public static final int[] simple = {5, 4, 1, 9, 7};

    private static final int hugeArraySize = 100000;
    private static final Random generator = new Random(hugeArraySize / 2  + 1);

    public static int[] createHugeArray() {
        final int[] array = new int[hugeArraySize];
        for (int i = 0; i < hugeArraySize; i++) array[i] = generator.nextInt();
        return array;
    }

}
