package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveSpecificElementArray {

    public static int[] removeSpecificElement(final int[] arrInt, final int number) {

        final int index = FindIndexArrayElement.findIndex(arrInt, number);

        if (index <= -1) {
            return arrInt;
        }

        final int[] result = new int[arrInt.length - 1];

        for (int i = 0; i < arrInt.length; i++) {

            if (i < index) {
                result[i] = arrInt[i];
            }

            if (i > index) {
                result[i -1] = arrInt [i];
            }

        }

        return removeSpecificElement(result, number);
    }

    @Test
    public void testEmptyArray() {
        assertArrayEquals(new int[] {}, removeSpecificElement(new int[] {}, 2), "Error When enter empty array");
    }

    @Test
    public void testRemoveElementsSame() {
        final int[] expected = new int[] { 5, 6, 4, 8, 1, 10, 7, 44, 45, 20 };
        final int[] actual = removeSpecificElement(new int[] { 5, 6, 2, 4, 8, 1, 10, 2, 2, 7, 44, 45, 20, 2 }, 2);

        assertArrayEquals(expected, actual, "Wrong specific element removed!");
    }

    @Test
    public void testRemoveOnlyEement() {
        final int[] expected = new int[] { 5, 6, 4, 8, 1, 10, 7, 44, 45, 20 };
        final int[] actual = removeSpecificElement(new int[] { 5, 6, 2, 4, 8, 1, 10, 7, 44, 45, 20 }, 2);

        assertArrayEquals(expected,actual, "Error when remove only a element of array");
    }

    @Test
    public void testRemoveAllElements() {
        final int[] expected = new int[] {};
        final int[] actual = removeSpecificElement(new int[] { 5, 5, 5, 5, 5, 5, 5, 5 }, 5);

        assertArrayEquals(expected, actual, "Wrong specific element removed! Expected: " + expected.length + " but actual " + actual.length);
    }

    @Test
    public void testRemoveElementNegative() {
        final int[] expected = new int[] { 4, -5, 2, 3, 8 };
        final int[] actual = removeSpecificElement(new int[] { 4, -5, -6, 2, 3, 8 }, -6);

        assertArrayEquals(expected, actual,"Wrong specific element removed! Expected: " + expected.length + " but actual " + actual.length);
    }
}
