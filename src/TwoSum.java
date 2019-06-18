import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] ints = twoSum(new int[]{2, 7, 11, 15}, 9);

        twoSumHashMap(new int[]{2, 7, 11, 15}, 9);

    }

    static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; ++i) {
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    static int[] twoSumHashMap(int[] nums, int target) {
        int len = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; ++i) {
            final Integer value = map.get(nums[i]);
            if (value != null) {
                return new int[]{value, i};
            }
            map.put(target - nums[i], i);
        }
        return null;
    }
}
