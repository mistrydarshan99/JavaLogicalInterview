import java.util.Map;
import java.util.TreeMap;

public class MajorityElement {

    public static void main(String[] args) {
        System.out.println(count(new int[]{2,2,1,1,1,1,1,1,1,1,1,2,2,10,10,10,10,10}));
    }

    public static int count(int[] nums){
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
