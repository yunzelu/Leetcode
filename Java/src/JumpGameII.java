public class JumpGameII {

    public int jump(int[] nums) {
        // number of visited elements
        int n = 0;
        if (nums.length <= 1) {
            return n;
        }

        return greedy(nums, 0, n);
    }
    public int greedy(int[] nums, int index, int n) {
        int tempIndex = index;
        int jumpableLen = 0;
        for (int i = 1; i <= nums[index]; i++) {
            if (i + index >= nums.length - 1) {
                return ++n;
            }
            if (i + nums[i + index] > jumpableLen) {
                tempIndex = i + index;
                jumpableLen = i + nums[i + index];
            }
        }
        n++;
        return greedy(nums, tempIndex, n);
    }

}
