import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PairIntSum {

    public static void main(String[] args) {
        int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
        prettyPrint(numbers, 7);

//        int[] numbersWithDuplicates = { 2, 4, 3, 5, 6, -2, 4, 7, 8, 9 };
//        prettyPrint(numbersWithDuplicates, 7);
    }

    /**
     * Utility method to print input and output for better explanation.
     */
    public static void prettyPrint(int[] givenArray, int givenSum){
        System.out.println("Given array : " + Arrays.toString(givenArray));
        System.out.println("Given sum : " + givenSum);
        System.out.println("Integer numbers, whose sum is equal to value : " + givenSum);
//        printPairs(givenArray, givenSum);
        printPairsUsingSet(givenArray, givenSum);
//        printPairsUsingTwoPointers(givenArray, givenSum);
    }

    /**
     * Prints all pair of integer values from given array whose sum is is equal to given number.
     * complexity of this solution is O(n^2)
     */
    public static void printPairs(int[] array, int sum) {

        for (int i = 0; i < array.length; i++) {
            int first = array[i];
            for (int j = i + 1; j < array.length; j++) {
                int second = array[j];

                if ((first + second) == sum) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }

        }
    }

    /**
     * Given an array of integers finds two elements in the array whose sum is equal to n.
     * @param numbers
     * @param n
     */
    public static void printPairsUsingSet(int[] numbers, int n){
        if(numbers.length < 2){
            return;
        }
        Set set = new HashSet(numbers.length);

        for(int value : numbers){
            int target = n - value;

            // if target number is not in set then add
            if(!set.contains(target)){
                set.add(value);
            }else {
                System.out.printf("(%d, %d) %n", value, target);
            }
        }
    }

    /**
     * Given a number finds two numbers from an array so that the sum is equal to that number k.
     * @param numbers
     * @param k
     */
    public static void printPairsUsingTwoPointers(int[] numbers, int k){
        if(numbers.length < 2){
            return;
        }
        Arrays.sort(numbers);

        int left = 0; int right = numbers.length -1;
        while(left < right){
            int sum = numbers[left] + numbers[right];
            if(sum == k){
                System.out.printf("(%d, %d) %n", numbers[left], numbers[right]);
                left = left + 1;
                right = right -1;

            }else if(sum < k){
                left = left +1;

            }else if (sum > k) {
                right = right -1;
            }
        }

    }
}
