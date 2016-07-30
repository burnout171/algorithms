package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class QuickSortTest {

    @Test
    public void testSortSimpleArray() throws Exception {
        int[] array = SortUtil.simple;
        int[] copy = Arrays.copyOf(array, array.length);

        Arrays.sort(copy);
        QuickSort.sort(array, 0, array.length - 1);
        Assert.assertArrayEquals(array, copy);
    }


    @Test
    public void testSortHugeArray() throws Exception {
        int[] array = SortUtil.createHugeArray();
        int[] copy = Arrays.copyOf(array, array.length);

        Arrays.sort(copy);
        QuickSort.sort(array, 0, array.length - 1);
        Assert.assertArrayEquals(array, copy);
    }
}
