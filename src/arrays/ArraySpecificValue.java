package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ArraySpecificValue {

    public static boolean testArraySpecificValue(final int[] arrInt, final int specificValue) {

        if (arrInt.length == 0) {
            return false;
        }


        for (int i = 0; i < arrInt.length; i++) {
            if (specificValue == arrInt[i]) {
                return true;
            }
        }

        return false;
    }

//    public static void main(String[] args) {
//
//        int[]arrInt = {5, 10, 58, 90, 45, 2, 3};
//
//        System.out.println(testArraySpecificValue(arrInt, 4));
//    }

    @Test
    public void testEmptyArray() {
        assertEquals(false, testArraySpecificValue(new int[] {}, 3),"Error when enter parameter is array empty");
    }

    @Test
    public void testArrayOnlyOneElementReturnFail() {
        assertEquals(false, testArraySpecificValue(new int[] {3},4),
                "Error when enter parameter is array has only one element and number without in array");
    }

    @Test
    public void testArrayOnlyOneElementReturnTrue() {
        assertEquals(true, testArraySpecificValue(new int[] {3},3),
                "Error when enter parameter is array has only one element and number in array");
    }

    @Test
    public void testArrayHasNegativeNumberReturnFail() {
        assertEquals(false, testArraySpecificValue(new int[] {1, -5, 15, 6, 8},-4),
                "Error when enter parameter is array has negative number and negative number without in array");
    }

    @Test
    public void tetsArrayHasNegativeNumberReturnTrue() {
        assertEquals(true, testArraySpecificValue(new int[] {1, -5, 15, 6, 8},-5),
                "Error when enter parameter is array has negative number and negative number has in array");
    }

    @Test
    public void testArrayHasAllElementsZeroReturnTrue() {
        assertEquals(true, testArraySpecificValue(new int[] {0, 0, 0, 0, 0}, 0),
                "Error when enter array has all elements are zero");
    }

    @Test
    public void testArrayHasAllElementsZeroReturnFail() {
        assertEquals(false, testArraySpecificValue(new int[] {0, 0, 0, 0, 0}, 1),
                "Error when enter array has all elements are zero");
    }

}
