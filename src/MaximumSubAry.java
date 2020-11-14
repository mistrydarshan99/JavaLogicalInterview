public class MaximumSubAry {

    public static void main(String[] args) {
        System.out.println("Largest subArray Sum "+maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println("Largest subArray Sum "+maxSubArray(new int[]{1}));
        System.out.println("Largest subArray Sum "+maxSubArray(new int[]{1, 2}));
    }

    public static int maxSubArray(int[] nums) {

        if(nums.length == 0) return 0;

        int sum = nums[0];
        int result = sum;
        int initialIndex = 0;
        int lastIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if(sum < nums[i]){
                sum = nums[i];
                initialIndex = i;
            }

            if(sum > result){
                result = sum;
                lastIndex = i;
            }
        }

        for (int i = initialIndex; i <= lastIndex; i++) {
            System.out.print(nums[i]+ " ");
        }
        return result;
    }
}
