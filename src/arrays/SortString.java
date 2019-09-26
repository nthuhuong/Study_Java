package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortString {

    private static void swap (final String[] arrString, final int firstIndex, final int secondIndex) {

        if (firstIndex >= arrString.length ||
                secondIndex >= arrString.length ||
                firstIndex < 0 ||
                secondIndex < 0) {
            return;
        }

        String temp = arrString[firstIndex];
        arrString[firstIndex] = arrString[secondIndex];
        arrString[secondIndex] = temp;
    }


    public static String[] sortArrayString (final String[] arrString) {

        if (arrString == null) {
            return null;
        }

        if (arrString.length == 0) {
            return arrString;
        }

        for (int i = 0; i < arrString.length - 1; i++) {
            for (int j = i + 1; j < arrString.length; j++) {
                if (arrString[j] == null) {
                    continue;
                }

                if (arrString[i] == null || arrString[i].compareTo(arrString[j]) > 0) {
                    swap(arrString, i, j);
                }
            }
        }

        return arrString;
    }

    @Test
    public void testResultlArray() {
        assertArrayEquals(new String[] {"1234", "ABCD", "ABCDEF", "Nguyen thi thu huong", "abcd", "nguyen thi thu huong"},
                sortArrayString(new String[] {"1234", "abcd", "ABCD", "ABCDEF", "nguyen thi thu huong", "Nguyen thi thu huong"}),
                "Result sort array string is fail");
    }

    @Test
    public void testEnptyArray() {
        assertArrayEquals(new String[] {}, sortArrayString(new String[] {}), "Error when enter parameter is empty");
    }

    @Test
    public void testNullArray() {
        assertArrayEquals(null, sortArrayString(null), "Error when enter parameter is null");
    }

    @Test
    public void tetsStringArrayHaveElementsNull() {

        String[] expect = {"1234", "ABCD", "ABCDEF", "Nguyen thi thu huong", "abcd", "nguyen thi thu huong", null, null, null};
        String[] actual = sortArrayString(new String[] {null, "1234", "abcd", "ABCD", null,
                "ABCDEF", "nguyen thi thu huong", null, "Nguyen thi thu huong"});

        assertArrayEquals(expect, actual, "Error when enter parameter have elements is null");
    }

    @Test
    public void testStringArrayHaveAllElementsNull() {
        assertArrayEquals(new String[] {null, null, null}, sortArrayString(new String[] {null, null, null}),
                "Error when sort a string array has all elements is null");
    }

    @Test
    public void testStringArrayHaveElementSame() {

        String[] expect = {"1234", "1234", "1234", "ABCD", "abcd", "nguyen thi thu huong"};
        String[] actual = sortArrayString(new String[] {"1234", "ABCD", "1234", "nguyen thi thu huong", "abcd", "1234"});

        assertArrayEquals(expect, actual, "Error when enter string array have elements same");
    }

    @Test
    public void testStringArrayHaveAllElementSame() {
        assertArrayEquals(new String[] {"abc", "abc", "abc", "abc"}, sortArrayString(new String[] {"abc", "abc", "abc", "abc"}),
                "Error when enter string array have all elements same");
    }

    @Test
    public void testStringArrayOnlyOneElement() {
        assertArrayEquals(new String[] {"abc"}, sortArrayString(new String[] {"abc"}),
                "Error when enter string array only have one element");
    }

    @Test
    public void testStringArrayHasElementSpace() {
        assertArrayEquals(new String[] {" ", " ", "1234", "ABCD", "ABCDEF", "Nguyen thi thu huong", "abcd", "nguyen thi thu huong",},
                sortArrayString(new String[] {" ", "1234", "abcd", "ABCD", "ABCDEF", "nguyen thi thu huong", " ", "Nguyen thi thu huong"}),
                "Error when array string has element is space");
    }

}
