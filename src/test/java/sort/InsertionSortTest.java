package sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;


public class InsertionSortTest {

    @Test
    public void testSortSimpleArray() throws Exception {
        int[] array = SortUtil.simple;
        int[] copy = Arrays.copyOf(array, array.length);

        InsertionSort.sort(array);
        Arrays.sort(copy);
        Assert.assertArrayEquals(array, copy);
    }

    @Test
    public void testSortHugeArray() throws Exception {
        int[] array = SortUtil.createHugeArray();
        int[] copy = Arrays.copyOf(array, array.length);

        InsertionSort.sort(array);
        Arrays.sort(copy);
        Assert.assertArrayEquals(array, copy);
    }
}
