public class JumpGame {
    public boolean canJump(int[] nums) {
        if (nums.length < 1) {
            return true;
        }
        boolean[] visited = new boolean[nums.length];
        return reachable(nums, 0, visited);
    }

    public boolean reachable (int[] nums, int arrived, boolean[] visited) {
        if (arrived > nums.length - 1) {
            return true;
        }
        if (visited[arrived]) {
            return false;
        }
        visited[arrived] = true;

        for (int i = 1; i <= nums[arrived]; i++) {
            if (reachable(nums, arrived + i, visited)) {
                return true;
            }
        }
        return false;
    }
}
