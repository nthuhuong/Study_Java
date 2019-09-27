package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindIndexArrayElement {

    public static int findIndex(final int[] arrInt, final int number) {

        if (arrInt.length == 0) {

            return -1;

        }

       for (int i = 0; i < arrInt.length; i++) {

           if (number == arrInt[i]) {

               return i;

           }
       }

       return -1;

    }

    @Test
    public void testEmptyArray() {
        final int result = findIndex(new int[] {}, 3 );

        assertEquals(-1, result, "Wrong index found! Expected:" + -1 + " but actual: " + result);

    }

    @Test
    public void testFindPositiveNumberInArray() {
        final int result = findIndex(new int[] {1, 4, 7, 0, 20, 11, 45}, 7);
        assertEquals(2, result, "Wrong index found! Expected: " + 2 + " but actual: " + result);
    }

    @Test
    public void testFindNegativeNumberInArray() {
        final int result = findIndex(new int[] {1, 4, 7, 0, 20, 11, -45}, -45);
        assertEquals(6, result, "Wrong index found! Expected: " + 2 + " but actual: " + result);
    }

    @Test
    public void testFindZeroInArray() {
        final int result = findIndex(new int[] {1, 4, 7, 0, 20, 11, -45}, 0);
        assertEquals(3, result, "Wrong index found! Expected: " + 3 + " but actual: " + result);

    }

    @Test
    public void testArrayHasElementsSame() {
        final int result = findIndex(new int[] {4, 4, 5, 60, 4}, 4);
        assertEquals(0, result, "Wrong index found! Expected: " + 0 + " but actual: " + result);

    }

    @Test
    public  void testFindElementsWithoutArray() {
        final int result = findIndex(new int[] {1, 4, 5, 60, 4}, 3);
        assertEquals(-1, result, "Wrong index found! Expected: " + -1 + " but actual: " + result);
    }

}
