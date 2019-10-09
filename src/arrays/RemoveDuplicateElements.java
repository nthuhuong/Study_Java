package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateElements {
    private static int[] formatArray(final int[] arrInt, final int count) {
        final int[] resultArray = new int[count];

        for (int i = 0; i < count; i++) {
            resultArray[i] = arrInt[i];
        }

        return resultArray;
    }

    private static int findIndex(final int[] arrInt, final int number, int elements) {
        if (arrInt.length == 0) {
            return -1;
        }

        for (int i = 0; i < elements; i++) {
            if (number == arrInt[i]) {
                return i;
            }
        }

        return -1;
    }

    public static int[] removeElements(final int[] arrInt) {
        if (arrInt.length == 0) {
            return arrInt;
        }

        int[] notDuplicate = new int[arrInt.length];
        int count = 0;
        for (int i = 0; i < arrInt.length; i++) {
            if (count == 0) {
                notDuplicate[0] = arrInt[0];
                count ++;
                continue;
            }

            if (findIndex(notDuplicate, arrInt[i], count) == -1) {
                notDuplicate[count] = arrInt[i];
                count ++;
            }
        }

        int[] resultNotDuplicate = formatArray(notDuplicate, count);

        return resultNotDuplicate;
    }

    @Test
    public void testEmptyArray() {
        int[] actual = removeElements(new int[] {});
        assertArrayEquals(new int[] {}, actual, "Remove duplicate elements was wrong when enter array empty!");
    }

    @Test
    public void testArrayOneElement() {
        int[] actual = removeElements(new int[] { 1 });
        assertArrayEquals(new int[] { 1 }, actual, "Remove duplicate elements was wrong when enter array has a element!");
    }

    @Test
    public void testArrayDuplicateElements() {
        int[] expected = new int[] { 3, 4, 49, 8, 10 };
        int[] actual = removeElements(new int[] { 3, 4, 49, 8, 4, 10, 3, 8 });
        assertArrayEquals(expected, actual, "Remove duplicate elements was wrong!");
    }

    @Test
    public void testArrayAllDuplicateElements() {
        int[] expected = new int[] { 5, 3 };
        int[] actual = removeElements(new int[] { 5, 5, 5, 3, 3, 3, 3 });
        assertArrayEquals(expected, actual, "Remove duplicate elements wrong when all elements are the same!");
    }

    @Test
    public void testArrayAllElementsZero() {
        int[] expected = new int[] { 0 };
        int[] actual = removeElements(new int[] { 0, 0, 0, 0, 0, 0, 0 });
        assertArrayEquals(expected, actual, "Remove duplicate elements wrong when all elements are zero!");
    }
}
