import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber {

    public static void main(String[] args) {

        Integer[] numbers = {20, 50, 30, 15, 5, 25};
        findSecondLargestNum(numbers);

        findSecondLargestNumMethodTwo(numbers);

        findSecondLargestNumMethodThree(numbers);
    }

    private static void findSecondLargestNum(Integer[] numbers) {
        List<Integer> ints = Arrays.asList(numbers);
        Collections.sort(ints);
        System.out.println(ints.get(ints.size() - 2));
    }

    private static void findSecondLargestNumMethodTwo(Integer[] numbers) {
        int i, first, second;

        /* There should be atleast two elements */
        if (numbers.length < 2) {
            System.out.print(" Invalid Input ");
            return;
        }

        first = second = Integer.MIN_VALUE;
        for (i = 0; i < numbers.length; i++) {
            /* If current element is smaller than
            first then update both first and second */
            if (numbers[i] > first) {
                second = first;
                first = numbers[i];
            }

            /* If arr[i] is in between first and
               second then update second  */
            else if (numbers[i] > second && numbers[i] != first)
                second = numbers[i];
        }

        if (second == Integer.MIN_VALUE)
            System.out.print("There is no second largest" +
                    " element\n");
        else
            System.out.print("The second largest element" +
                    " is " + second);
    }

    private static void findSecondLargestNumMethodThree(Integer[] arr){
        int largest = arr[0];
        int secondLargest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];

            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);
    }
}
