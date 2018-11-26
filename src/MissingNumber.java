import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

    public static void main(String[] args) {

        // one missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6}, 6);

        // three missing number
        printMissingNumber(new int[]{1, 2, 3, 4, 6, 9, 8}, 10);

        // Only one missing number in array
        int[] iArray = new int[]{1, 2, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        System.out.printf("Missing number in array %s is %d %n",
                Arrays.toString(iArray), missing);

        duplicateMissing();
    }

    private static int getMissingNumber(int[] numbers, int totalCount) {
        int expectedSum = totalCount * ((totalCount + 1) / 2);
        int actualSum = 0;
        for (int i : numbers) {
            actualSum += i;
        }

        return expectedSum - actualSum;
    }

    /**
     * A general method to find missing values from an integer array in Java.
     * This method will work even if array has more than one missing element.
     */
    private static void printMissingNumber(int[] numbers, int count) {
        int missingCount = count - numbers.length;
        BitSet bitSet = new BitSet(count);

        for (int number : numbers) {
            bitSet.set(number);
        }

        System.out.printf("Missing numbers in integer array %s, with total number %d is %n",
                Arrays.toString(numbers), count);
        int lastMissingIndex = 1;

        for (int i = 0; i < missingCount; i++) {
            lastMissingIndex = bitSet.nextClearBit(lastMissingIndex);
            System.out.println(lastMissingIndex++);
        }

    }

    /*
     * Java Program to find missing numbers in an integer
     * array with duplicates. Array may contains more
     * than one duplicates.
     *
     * input: {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};
     * output: 4, 6, 8
     */

    public static void duplicateMissing() {

        // given input
        int[] input = {1, 1, 2, 3, 5, 5, 7, 9, 9, 9};

        // let's create another array with same length
        // by default all index will contain zero
        // default value for int variable

        int[] register = new int[input.length];

        // now let's iterate over given array to
        // mark all present numbers in our register
        // array

        for (int i : input) {
            register[i] = 1;
        }

        // now, let's print all the absentees
        System.out.println("missing numbers in given array");

        for (int i = 1; i < register.length; i++) {
            if (register[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
