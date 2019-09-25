package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortIntNumber {

    private static void swap(final int[] arr, final int firstIndex, final int secondIndex) {

        if (firstIndex >= arr.length ||
            secondIndex >= arr.length ||
            firstIndex < 0 ||
            secondIndex < 0) {
            return;
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }



    public static int[] sortArrayNumber(final int[] arrayNumber) {

        if (arrayNumber == null) {
            return null;
        }

        if (arrayNumber.length == 0) {
            return new int[] {};
        }

        for (int i = 0; i < arrayNumber.length - 1; i++) {
            for (int j = i + 1 ; j < arrayNumber.length; j++) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    swap(arrayNumber, i, j);
                }
            }
        }

        return arrayNumber;
    }



    @Test
    public void testNullArray() {
        assertArrayEquals(null, sortArrayNumber(null), "Error when enter parameter is null");
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[] {}, sortArrayNumber(new int[] {}), "Error when enter parameter is Empty");
    }

    @Test
    public void testResultArray() {
        assertArrayEquals(new int[] {0, 1, 3, 7, 18, 59, 94}, sortArrayNumber(new int[] {3, 59, 7, 94, 1, 18, 0 }),
                "Result is fail" );
    }

    @Test
    public void testInputArrayBeChanged() {
        int[] arrInt = {3, 59, 7, 94, 1, 18 };
        assertArrayEquals(arrInt, sortArrayNumber(arrInt), "Error Input not be changed");
    }

    @Test
    public void testOneElementArray() {
        assertArrayEquals(new int[] {10}, sortArrayNumber(new int[] {10}),
                "Error when enter array have one element");
    }

    @Test
    public void testArrayHaveElementsSame() {
        assertArrayEquals(new int[] {3, 5, 5, 5, 9, 11, 20, 45}, sortArrayNumber(new int[] {5, 3, 9, 5, 5, 20, 11, 45}),
                "Error when enter array have elements same together");
    }

    @Test
    public void testArrayBeSorted() {
        assertArrayEquals(new int[] {3, 4, 5, 7, 8, 10, 11, 23}, sortArrayNumber(new int[] {3, 4, 5, 7, 8, 10, 11, 23}),
                "Error when enter array be sorted");
    }

    @Test
    public void testArrayHaveAllElementSame() {
        assertArrayEquals(new int[] {4, 4, 4, 4, 4, 4}, sortArrayNumber(new int[] {4, 4, 4, 4, 4, 4}),
                "Error when enter a array has all elements same");
    }

    @Test
    public void testPreviuosElementSmallerThanNextElement() {
        int[] arrInt = {5, 10, 4, 8, 30, 25, 6, 15};
        int[] actual = sortArrayNumber(arrInt);

        for (int i = 0; i < actual.length -1; i++) {
            assertTrue(actual[i] <= actual[i + 1],"Error Array is not properly sorted");
        }
    }

}






