package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class FindMaximumAndMinimumOfArray {

    private static int findMaximun(final int[] arrInt) {
        if (arrInt.length == 0) {
            return -1;
        }

        int maximumValue = arrInt[0];

        for (int i = 1; i < arrInt.length; i++) {

            if (maximumValue < arrInt[i]) {
                maximumValue = arrInt[i];
            }

        }

        return maximumValue;

    }

    private static int findMinimun(final int[] arrInt) {
        if (arrInt.length == 0) {
            return -1;
        }

        int minimumValue = arrInt[0];

        for (int i = 1; i < arrInt.length; i++) {

            if (minimumValue > arrInt[i]) {
                minimumValue = arrInt[i];
            }

        }

        return minimumValue;

    }

    public static int[] findMaxAndMin(final int[] arrInt) {

        if (arrInt.length == 0) {
            return new int[] {};
        }

        int maximumValue = findMaximun(arrInt);
        int minimumValue = findMinimun(arrInt);

        return new int[] {maximumValue, minimumValue};
    }

    @Test
    public void testEmptyArray() {
        int[] expected = new int[] {};
        int[] actual = findMaxAndMin(new int[] {});

        assertArrayEquals(expected, actual,
                "find maximum value and minimum value of a empty array wrong!");
    }
    
    @Test
    public void testArrayHasManyMaximumValueandMinimumValue() {
        int[] expected = new int[] {15, 4};
        int[] actual = findMaxAndMin(new int[] {5, 6, 4, 4, 15, 4, 8, 15, 9, 10, 11});

        assertArrayEquals(expected, actual,
                "Find max and min wrong when array has many maximum value and minimum value! Expected: " +
                        "max " + expected[0] + " and min " + expected[1] + " but actual " + actual[0] + " and min " + actual[1]);
    }

    @Test
    public void testArrayHasOneMaximumValueAndOneMinimumValue() {
        int[] expected = new int[] {15, 4};
        int[] actual = findMaxAndMin(new int[] {5, 6, 4, 15, 8, 9, 10, 11});

        assertArrayEquals(expected, actual,
                "Find max and min wrong when array has only one maximum and minimum! Expected: "
                        +  "max " + expected[0] + " and min " + expected[1] + " but actual " + actual[0] + " and min " + actual[1]);
    }

    @Test
    public void testArrayHasAllElementsSame() {
        int[] expected = new int[] {3, 3};
        int[] actual = findMaxAndMin(new int[] {3, 3, 3, 3, 3, 3, 3});

        assertArrayEquals(expected, actual,
                "Find max and min wrong when array has all elements same! Expected: "
                        +  "max " + expected[0] + " and min " + expected[1] + " but actual " + actual[0] + " and min " + actual[1]);
     }

     @Test
    public void testArrayAllElementsNegativeNumber() {
         int[] expected = new int[] {-3, -13};
         int[] actual = findMaxAndMin(new int[] {-6, -7, -3, -13, -8, -10, -7});

         assertArrayEquals(expected, actual,
                 "Find max and min wrong when array has all elements is negative number! Expected: "
                         +  "max " + expected[0] + " and min " + expected[1] + " but actual " + actual[0] + " and min " + actual[1]);
     }
}


