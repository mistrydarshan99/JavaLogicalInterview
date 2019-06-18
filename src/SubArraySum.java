import java.util.Arrays;

public class SubArraySum {

    public static void main(String[] args) {


//        findSubArray(new int[]{42, 15, 12, 8, 6, 32}, 26);
        long time1 = System.currentTimeMillis();
        int i = subArraySum(new int[]{42, 15, 12, 8, 6, 32}, 26);
        long time2 = System.currentTimeMillis();
        System.out.println(time2 - time1);


    }

    static void findSubArray(int[] inputArray, int inputNumber) {
        //Initializing sum with the first element of the inputArray

        int sum = inputArray[0];

        //Initializing starting point with 0

        int start = 0;

        //Iterating through inputArray starting from second element

        for (int i = 1; i < inputArray.length; i++) { //Adding inputArray[i] to the current 'sum' sum = sum + inputArray[i]; //If sum is greater than inputNumber then following loop is executed until //sum becomes either smaller than or equal to inputNumber while(sum > inputNumber && start <= i-1)
            {
                //Removing starting elements from the 'sum'

                sum = sum - inputArray[start];

                //Incrementing start by 1

                start++;
            }

            //If 'sum' is equal to 'inputNumber' then printing the sub array

            if (sum == inputNumber) {
                System.out.println("Input Array : " + Arrays.toString(inputArray));

                System.out.println("Input Number : " + inputNumber);

                System.out.print("Continuous Sub Array : ");

                for (int j = start; j <= i; j++) {
                    System.out.print(inputArray[j] + " ");
                }

                System.out.println();
            }
        }

        System.out.println("=================================");
    }

    /* Returns true if the there is a subarray of arr[] with sum equal to
       'sum' otherwise returns false.  Also, prints the result */
    static int subArraySum(int arr[], int sum) {
        int n = arr.length;
        int curr_sum = arr[0], start = 0, i;

        // Pick a starting point
        for (i = 1; i <= n; i++) {
            // If curr_sum exceeds the sum, then remove the starting elements
            while (curr_sum > sum && start < i - 1) {
                curr_sum = curr_sum - arr[start];
                start++;
            }

            // If curr_sum becomes equal to sum, then return true
            if (curr_sum == sum) {
                int p = i - 1;
                System.out.println("Sum found between indexes " + start
                        + " and " + p);
                return 1;
            }

            // Add this element to curr_sum
            if (i < n)
                curr_sum = curr_sum + arr[i];

        }

        System.out.println("No subarray found");
        return 0;
    }


}
