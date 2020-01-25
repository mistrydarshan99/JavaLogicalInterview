import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;

public class MaxMinFromArray {

    public static void main(String args[]) {
        largestAndSmallest(new int[]{-20, 34, 21, -87, 92,
                Integer.MAX_VALUE});
        largestAndSmallest(new int[]{10, Integer.MIN_VALUE, -2});
        largestAndSmallest(new int[]{Integer.MAX_VALUE, 40,
                Integer.MAX_VALUE});
        largestAndSmallest(new int[]{1, -1, 0});

        deleteLastElementOfArray(new int[]{15, 20, 25, 50});

        secondLargestElementOfArray(new int[]{51, 25, 3, 65, 8, 41});

        System.out.println(findKthLargest(new int[]{51, 25, 3, 65, 8, 41}, 3));
    }

    public static void largestAndSmallest(int[] numbers) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            } else if (number < smallest) {
                smallest = number;
            }
        }

        System.out.println("Given integer array : " + Arrays.toString(numbers));
        System.out.println("Largest number in array is : " + largest);
        System.out.println("Smallest number in array is : " + smallest);
    }

    private static void deleteLastElementOfArray(int number[]) {
        int[] ints = Arrays.copyOf(number, number.length - 1);
        System.out.println(ints.length);
    }

    private static void secondLargestElementOfArray(int numbers[]){
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 3]);
    }

    private static int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<Integer>(k);
        for(int i: nums){
            q.offer(i);

            if(q.size()>k){
                q.poll();
            }
        }

        return q.element();
    }
}
