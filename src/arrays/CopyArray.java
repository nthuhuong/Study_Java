package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CopyArray {

    public static int[] copy(final int[] arrInt) {

        if (arrInt.length == 0) {
            return arrInt;
        }

        final int[] output = new int[arrInt.length];

        for (int i = 0; i < arrInt.length; i++) {
            output[i] = arrInt[i];
        }

        return output;
    }

    @Test
    public void testEmptyArray() {
        int[] expected = new int[] {};
        int[] actual = copy(new int[] {});

        assertArrayEquals(expected, actual, "Copy empty array wrong! Expected: " + expected.length + " but actual: " + actual.length);
    }

    @Test
    public void testResultCopy() {
        int[] expected = new int[] {3, 4, 5, 1, 10, 23};
        int[] actual = copy( new int[] {3, 4, 5, 1, 10, 23});

        assertArrayEquals(expected, actual, "Result copy array wrong! Expected: " + expected.length + " but actual " + actual.length);
    }
}