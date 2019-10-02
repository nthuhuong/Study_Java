package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InsertElement {
     public static int[] insertAnElement(final int[] arrInt, final int value, final int position) {
         if (position < 0 || position > arrInt.length) {
             return arrInt;
         }

         int[] resultArray = new int[arrInt.length + 1];
         resultArray[position] = value;

         int indexArrInt = -1;
         for (int i = 0; i < resultArray.length; i++) {
             indexArrInt++;

             if (i == position) {
                 indexArrInt--;
                 continue;
             }

             resultArray[i] = arrInt[indexArrInt];

         }

         return resultArray;
     }

     @Test
     public void testEmptyArrayAndInsertElementIntoIndex0() {
         int[] expected = new int[] {2};
         int[] actual = insertAnElement(new int[] {}, 2, 0);

         assertArrayEquals(expected, actual,
                 "Wrong when insert a element into empty array! Expected: " + expected.length + " but actual " + actual.length);
     }

     @Test
     public void testInsertElementIntoPositionLessThanZero() {
         int[] arrInt = new int[] {1, 2, 6, 10};
         int[] actual = insertAnElement(arrInt, 3, -2);

         assertArrayEquals(arrInt, actual,
                 "Wrong when insert element into position less than zero! Expected: " + arrInt.length + " but actual " + actual.length);
     }

     @Test
     public void testInsertElementIntoPositionGreaterThanStringLength() {
         int[] arrInt = new int[] {1, 2, 6};
         int[] actual = insertAnElement(arrInt, 3, 5);

         assertArrayEquals(arrInt, actual,
                 "Wrong when insert element into position greater than string length! Expected: "
                         + arrInt.length + " but actual " + actual.length);
     }

     @Test
     public void testInsertElementIntoPositionInArray() {
         int[] expected = new int[] {2, 4, 10, 35, 2};
         int[] actual = insertAnElement(new int[] {2, 4, 10, 2}, 35, 3);

         assertArrayEquals(expected, actual,
                 "Wrong insert an element into array! Expected: " + expected.length + " but actual " + actual.length);
     }

}
