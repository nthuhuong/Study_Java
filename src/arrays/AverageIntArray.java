package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AverageIntArray {

    private static int sumArray(int[] arrInt) {

        int sum = 0;

        for (int temp : arrInt) {
            sum += temp;
        }

        return sum;

    }

    public static double calculateAverageArray(int[] arrInt) {

        if (arrInt.length == 0) {
            return 0;
        }

        return sumArray(arrInt)/(arrInt.length * 1.0);

    }


    @Test
    public void testArrayEmpty() {
        assertEquals(0, calculateAverageArray(new int[] {}),"Error when enter array empty");
    }

    @Test
    public void testArrayHasAllElementsZero() {
        assertEquals(0, calculateAverageArray(new int[] {0, 0, 0, 0, 0}),
                "Error when enter array has all elements are zero");
    }

    @Test
    public void testResultAverageOfArray() {
        assertEquals(9.25, calculateAverageArray(new int[] {4, 10, 20, 3}),"Result is fail");
    }

    @Test
    public void testArrayHasElementsNegativeNumber() {
        assertEquals(-2, calculateAverageArray(new int[] {-8, -21, 5, 16}),
                "Error when enter array has elements negative number");
    }

    @Test
    public void testArrayHasAllElementsNegativeNumber() {
        assertEquals(-8, calculateAverageArray(new int[] {-8, -12, -5, -7}),
                "Error when enter array has all elements are negative number");
    }

    @Test
    public void testArrayHasAllElementsPositiveNumber() {
        assertEquals(8, calculateAverageArray(new int[] {8, 12, 5, 7}),
                "Error when enter array has all elements are positive number");
    }

    @Test
    public void testArrayHasNegativeZeroPositive() {
        assertEquals(0, calculateAverageArray(new int[] {-3, 0, 3}),
                "Error when array contain negative number, zero and positive number");
    }

}
