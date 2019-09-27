package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SumIntArray {

    public static int sumArray(final int[] arrInt) {

        int sum = 0;

        for (int temp : arrInt) {
            sum += temp;
        }

        return sum;
    }

    @Test
    public void testResultSum() {
        assertEquals(74, sumArray(new int[] {1, 5, 23, 45}), "Result returned is fail");
    }

    @Test
    public void testEmptyArray() {
        assertEquals(0, sumArray(new int[] {}),"Error when enter array empty");
    }

    @Test
    public void testArrayHasAllElementsZero() {
        assertEquals(0, sumArray(new int[] {0, 0, 0, 0, 0}),"Error when enter a array has all elements zero");
    }

    @Test
    public void tetsArrayHasElementsNegativeNumber() {
        assertEquals(-7, sumArray(new int[] {-10, 1, 2}),"Error when enter array has contain elements negative number");
    }

    @Test
    public void testArrayHasAllElementsNegativeNumber() {
        assertEquals(-22, sumArray(new int[] {-16, -3, -3}),"Error when enter array has all elements negative number");
    }

    @Test
    public void testArrayHasNegativeZeroPositive() {
        assertEquals(0, sumArray(new int[] {-3, 0, 3}),"Error when array contain negative number, zero and positive number");
    }

}
