package arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SortIntNumber {

    private static void swap(int[] arr, int firstIndex, int secondIndex) {

        if (firstIndex >= arr.length ||
            secondIndex >= arr.length ||
            firstIndex < 0 ||
            secondIndex < 0) {
            return;
        }

        int temp = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = temp;
    }



    private static int[] sortArrayNumber(final int[] arrayNumber) {
        if (arrayNumber == null) {
            return null;
        }

        if (arrayNumber.length == 0) {
            return new int[] {};
        }


        for (int i = 0; i < arrayNumber.length - 1; i++) {
            for (int j = i + 1 ; j < arrayNumber.length; j++) {
                if (arrayNumber[i] > arrayNumber[j]) {
                    swap(arrayNumber, i, j);
                }
            }
        }

        return arrayNumber;
    }


//    public static void main(String[] agrs) {
//        int[] arrInt = {10};//, 4, 20, 7, 3, 9, 24, 90};
//        System.out.println(arrInt.length);
//        sortArrayNumber(arrInt);
//        for (int i : arrInt) {
//            System.out.println(i);
//        }
//    }


    @Test
    public void testNullArray() {
        int[] arrInt = null;
        assertArrayEquals(null, sortArrayNumber(arrInt), "Error when enter parameter is null");
    }

    @Test
    public void testEmptyArray() {
        // Arrange
        int[] arrInt = {};
        int[] expected = {};

        // Act
        int[] actual = sortArrayNumber(arrInt);

        // Assert
        assertArrayEquals(expected, actual, "Error when enter parameter is Empty");
    }

    @Test
    public void testResultArray() {
        int[] arrInt = {3, 59, 7, 94, 1, 18 };
        int[] expected = {1, 3, 7, 18, 59, 94};

        int[] actual = sortArrayNumber(arrInt);

        assertArrayEquals(expected, actual, "Result is fail" );
    }

    @Test
    public void testOneElementArray() {
        int[] arrInt = {10};
        int[] expected = {10};

        int[] actual = sortArrayNumber(arrInt);

        assertArrayEquals(expected, actual, "Error when enter array have one element");
    }
    


}






