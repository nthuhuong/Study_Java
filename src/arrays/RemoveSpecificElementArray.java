package arrays;

public class RemoveSpecificElementArray {

    public static int[] removeSpecificElement(final int[] arrInt, int number) {

        int index = FindIndexArrayElement.findIndex(arrInt, number);

        //System.out.println(index + "/n");

        if (index > -1) {

            int[] result = new int[arrInt.length - 1];

            for (int i = 0; i < arrInt.length; i++) {

                if (i < index) {
                    result[i] = arrInt[i];
                }

                if (i > index) {
                    result[i -1] = arrInt [i];
                }

            }

            //removeSpecificElement(result, number);
            return  removeSpecificElement(result, number);
        }

        return arrInt;
    }

    public static void main(String[] args) {

        //int[] arrInt = new int[] {5, 6, 2, 4, 8, 1, 10, 2, 2, 7, 44, 45, 20, 2};
        int[] arrInt = new int[] {5, 6, 4, 8, 1, 10, 7, 44, 45, 20};
        int[] result = removeSpecificElement(arrInt, 2);
        for (int i = 0; i< result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
