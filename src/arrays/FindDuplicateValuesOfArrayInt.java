package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindDuplicateValuesOfArrayInt {

    private static int[] formatArray(final int[] arrInt, final int count) {
        final int[] resultArray = new int[count];

        for (int i = 0; i < count; i++) {
            resultArray[i] = arrInt[i];
        }

        return resultArray;
    }

    public static int[] findDuplicate(final int[] arrInt) {
        if (arrInt.length == 0) {
            return new int[] {};
        }

        int[] resultArray = new int[arrInt.length];
        int count = 0;
        int k = 0;

        for (int i = 0; i < arrInt.length - 1; i++) {

            for (int j = i + 1; j < arrInt.length; j++) {
                if (arrInt[i] == arrInt[j]) {
                    k = 1;
                    break;
                }
            }

            if (k == 1 && (FindIndexArrayElement.findIndex(resultArray, arrInt[i]) == -1)) {
                resultArray[count] = arrInt[i];
                count++;
                k = 0;
            }
        }

        return formatArray(resultArray, count);
    }

    @Test
    public void testEmptyArray() {
        int[] expected = new int[] {};
        int[] actual = findDuplicate(new int[] {});

        assertArrayEquals(expected, actual, "Find the duplicate values of an empty array wrong!");
    }

    @Test
    public void testArrayHasOneElement() {
        int[] expected = new int[] {};
        int[] actual = findDuplicate(new int[] { 2 });

        assertArrayEquals(expected, actual, "Find the duplicate value of array has one element wrong!");
    }

    @Test
    public void testArrayHasAllElementsSame() {
        int[] expected = new int[] { 5 };
        int[] actual = findDuplicate(new int[] { 5, 5, 5, 5, 5, 5, 5 });

        assertArrayEquals(expected, actual, "Find the duplicate values of array has all elements same was wrong!");
    }

    @Test
    public void testArrayNotExistDuplicateValue() {
        int[] expected = new int[] {};
        int[] actual = findDuplicate(new int[] { 1, 2, 3, 4, 5, 6, 7, 8 });

        assertArrayEquals(expected, actual, "Find the duplicate values wrong when array not exist duplicate values!");
    }

    @Test
    public void testArrayExistDuplicateValue() {
        int[] expected = new int[] { 4, 7, 3, 10};
        int[] actual = findDuplicate(new int[] { 4, 5, 6, 4, 7, 8, 9, 3, 7, 4, 10, 3, 3, 4, 10 });

        assertArrayEquals(expected, actual, "Find the duplicate values wrong when array exist duplicate values!");
    }

}
