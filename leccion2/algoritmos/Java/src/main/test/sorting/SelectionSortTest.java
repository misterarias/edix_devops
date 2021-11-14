package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static sorting.SelectionSort.selectionSort;

class SelectionSortTest {

    @Test
    void testSelectionSort() {
        assertArrayEquals(selectionSort(new int[]{}), new int[]{});
        assertArrayEquals(selectionSort(new int[]{2, 1}), new int[]{1, 2});
        assertArrayEquals(selectionSort(new int[]{2, 0, 4, -1}), new int[]{-1, 0, 2, 4});
        assertArrayEquals(selectionSort(new int[]{1}), new int[]{2});   // False!
    }
}