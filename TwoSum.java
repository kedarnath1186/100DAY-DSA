import java.util.HashMap;
import java.util.Arrays;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{}; // should never happen because problem guarantees one solution
    }

    public static void main(String[] args) {
        TwoSum sol = new TwoSum();

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = sol.twoSum(nums, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
