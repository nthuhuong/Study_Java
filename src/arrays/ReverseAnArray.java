package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ReverseAnArray {

    public static int[] reverseArray(final int[] arrInt) {

        if (arrInt.length == 0 || arrInt.length == 1) {
            return arrInt;
        }

        int[] resultArray = new int [arrInt.length];

        for (int i = 0; i < arrInt.length; i++) {
            resultArray[i] = arrInt[arrInt.length - 1 - i];
        }

        return resultArray;
    }

    @Test
    public void testEmptyArray() {
        int[] expected = new int[] {};
        int[] actual = reverseArray(new int[] {});

        assertArrayEquals(expected, actual, "Reverse array wrong when enter empty array!");
    }

    @Test
    public void testArrayOneElement() {
        int[] expected = new int[] {3};
        int[] actual = reverseArray(new int[] {3});

        assertArrayEquals(expected, actual, "Reverse array wrong when array has only one element");
    }

    @Test
    public void testResultOfReverseArray() {
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7};
        int[] actual = reverseArray(new int[] {7, 6, 5, 4, 3, 2, 1});

        assertArrayEquals(expected, actual, "Result reverse an array was wrong!");
    }

    @Test
    public void testReverseArrayHasAllElementsSame() {
        int[] expected = new int[] {6, 6, 6, 6, 6, 6, 6, 6};
        int[] actual = reverseArray(new int[] {6, 6, 6, 6, 6, 6, 6, 6});

        assertArrayEquals(expected, actual, "Reverse array wrong when array has all elements same!");
    }

}
