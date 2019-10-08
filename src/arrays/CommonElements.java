package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CommonElements {

    public static int findIndex(final String[] arrString, final String str) {
        if (arrString.length == 0) {
            return -1;
        }

        for (int i = 0; i < arrString.length; i++) {
            if (str == null) {
                if (arrString[i] == null) {
                    return i;
                }
                continue;
            }

            if (str.equals(arrString[i])) {
                return i;
            }
        }

        return -1;
    }

    private static String[] formatArray(final String[] arrInt, final int count) {
        final String[] resultArray = new String[count];

        for (int i = 0; i < count; i++) {
            resultArray[i] = arrInt[i];
        }

        return resultArray;
    }

    public static String[] findCommonElements(final String[] arrString1, final String[] arrString2) {
        if (arrString1 == null || arrString2 == null) {
            return null;
        }

        if (arrString1.length == 0 || arrString2.length == 0) {
            return new String[] {};
        }

        int count = 0;
        boolean isFound = false;
        String[] resultArray = new String[arrString1.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = "";
        }

        for (int i = 0; i < arrString1.length; i++) {
            for (int j = 0; j < arrString2.length; j++) {
                if (arrString1[i] == null) {
                    if (arrString2[j] == null) {
                        isFound = true;
                        break;
                    } else {
                        continue;
                    }
                }

                if (arrString2[j] != null && arrString1[i].equals(arrString2[j])) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                isFound = false;
                if (findIndex(resultArray, arrString1[i]) == -1) {
                    resultArray[count] = arrString1[i];
                    count++;
                }
            }
        }

        return formatArray(resultArray, count);
    }

    @Test
    public void testOneArrayEnpty() {
        String[] array1 = {};
        String[] array2 = { "bobo", "huonghuong", "kjsdkjks", "Nguyen Thi Thu Huong" };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(new String[] {}, actual, "Find the common elements wrong when has a array is empty!");
    }

    @Test
    public void testTwoArrayEmpty() {
        String[] array1 = {};
        String[] array2 = {};
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(new String[] {}, actual, "Find the common elements wrong when enter two arrays empty!");
    }

    @Test
    public void testOneArrayNull() {
        String[] array1 = null;
        String[] array2 = { "bobo", "huonghuong", "kjsdkjks", "Nguyen Thi Thu Huong" };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(null, actual, "Find the common elements wrong when enter a array null!");
    }

    @Test
    public void testTwoArrayNull() {
        String[] array1 = null;
        String[] array2 = null;
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(null, actual, "Find the common elements wrong when enter two arrays null!");
    }

    @Test
    public void testNotCommonElement() {
        String[] array1 = { "bobo", "huonghuong", "kjsdkjks", "Nguyen Thi Thu Huong" };
        String[] array2 = { "123", "345", "123", "678" };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(new String[] {}, actual, "Find the common elements wrong when not common element!");
    }

    @Test
    public void testCommonElement() {
        String[] array1 = { "bobo", "huonghuong", "kjsdkjks", "Nguyen Thi Thu Huong" };
        String[] array2 = { "huonghuongkjfk", "kjsdkjks", "bobo", "123456", "56788", "bobo" };
        String[] expected = { "bobo", "kjsdkjks" };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(expected, actual, "Find the common elements wrong!");
    }

    @Test
    public void testCommonElementIsNull() {
        String[] array1 = { "bobo", "huonghuong", "kjsdkjks", "Nguyen Thi Thu Huong", null };
        String[] array2 = { "bobo", "huonghuongkjfk", "kjsdkjks", "123456", "56788", null };
        String[] expected = { "bobo", "kjsdkjks", null };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(expected, actual, "Find the common elements wrong when array hold elements null!");
    }

    @Test
    public void testAllCommonElements() {
        String[] array1 = { null, null, null };
        String[] array2 = { null, null, null };
        String[] expected = { null };
        String[] actual = findCommonElements(array1, array2);

        assertArrayEquals(expected, actual, "Find the common elements wrong when 2 array are the same!");
    }
}
