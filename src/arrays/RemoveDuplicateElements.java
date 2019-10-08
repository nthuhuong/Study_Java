package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RemoveDuplicateElements {

    public static int[] removeElements(final int[] arrInt) {
        int[] arrDuplicate = FindDuplicateValuesOfArrayInt.findDuplicate(arrInt);

        if (arrDuplicate.length == 0) {
            return arrInt;
        }

        int[] resultArr = RemoveSpecificElementArray.removeSpecificElement(arrInt, arrDuplicate[0]);
        for (int i = 1; i < arrDuplicate.length; i++) {
            resultArr = RemoveSpecificElementArray.removeSpecificElement(resultArr, arrDuplicate[i]);
        }

        return resultArr ;
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
        int[] expected = new int[] { 49, 10 };
        int[] actual = removeElements(new int[] { 3, 4, 49, 8, 4, 10, 3, 8 });
        assertArrayEquals(expected, actual, "Remove duplicate elements was wrong!");
    }

    @Test
    public void testArrayAllDuplicateElements() {
        int[] expected = new int[] {};
        int[] actual = removeElements(new int[] { 5, 5, 5, 3, 3, 3, 3 });
        assertArrayEquals(expected, actual, "Remove duplicate elements wrong when all elements are the same!");
    }

    @Test
    public void testArrayAllElementsZero() {
        int[] expected = new int[] {};
        int[] actual = removeElements(new int[] { 0, 0, 0, 0, 0, 0, 0 });
        assertArrayEquals(expected, actual, "Remove duplicate elements wrong when all elements are zero!");
    }
}
