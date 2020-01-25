import java.util.Arrays;
import java.util.HashSet;

//https://howtodoinjava.com/array/array-remove-duplicate-elements/
public class RemoveDuplicate {

    public static void main(String[] args) {
        int[][] test = new int[][]{
                {1, 1, 2, 2, 3, 4, 5},
        };

        for (int[] input : test) {
            System.out.println("Array with Duplicates       : " + Arrays.toString(input));
            System.out.println("After removing duplicates   : " + Arrays.toString(removeDuplicates(input)));
            removeDuplicatesMethodTwo(input);
        }

        findMissingNumber();

        System.out.println("Removeing Duplicate start\n");
        removeDuplicateNumber();
    }

    /*
     * Method to remove duplicates from array in Java, without using
     * Collection classes e.g. Set or ArrayList. Algorithm for this
     * method is simple, it first sort the array and then compare adjacent
     * objects, leaving out duplicates, which is already in the result.
     */
    public static int[] removeDuplicates(int[] numbersWithDuplicates) {

        // Sorting array to bring duplicates together
        Arrays.sort(numbersWithDuplicates);

        int[] result = new int[numbersWithDuplicates.length];
        int previous = numbersWithDuplicates[0];
        result[0] = previous;

        for (int i = 1; i < numbersWithDuplicates.length; i++) {
            int ch = numbersWithDuplicates[i];

            if (previous != ch) {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }

    private static Integer[] removeDuplicatesMethodTwo(int[] origArray) {
        // Sorting array to bring duplicates together
        Arrays.sort(origArray);

        Integer[] tempArray = new Integer[origArray.length];
//        int[] tempArray = new int[origArray.length];

        int indexJ = 0;
        for (int indexI = 0; indexI < origArray.length - 1; indexI++) {
            Integer currentElement = origArray[indexI];

            if (currentElement != origArray[indexI + 1]) {
                tempArray[indexJ++] = currentElement;
            }
        }

        tempArray[indexJ++] = origArray[origArray.length - 1];

        return tempArray;
    }

    private static void findMissingNumber() {
        int[] numbers = {9, 6, 4, 5, 7, 0, 1};
        Arrays.sort(numbers);
        HashSet<Integer> set = new HashSet<>();

        for (int i = numbers[0]; i < numbers[numbers.length - 1]; i++) {
            set.add(i);
        }

        for (int i = 0; i < numbers.length; i++) {
            set.remove(numbers[i]);
        }

        for (int x : set) {
            System.out.print(x + " ");
        }
    }

    private static void removeDuplicateNumber() {
        int[] number = {10, 20, 15, 10, 25, 12, 20};
        int preNum = number[0];
        int[] withOutDuplilcateAry = new int[number.length];
        withOutDuplilcateAry[0] = preNum;
        int j = 1;
        for (int i = 1; i < number.length; i++) {
            boolean isNotAdd = false;
            for (int i1 : withOutDuplilcateAry) {
                if (i1 == number[i]) {
                    isNotAdd = true;
                    break;
                }
            }
            if (!isNotAdd) {
                withOutDuplilcateAry[j++] = number[i];
            }
        }

        System.out.println(Arrays.toString(withOutDuplilcateAry));
    }
}
