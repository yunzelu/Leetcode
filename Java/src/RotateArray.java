public class RotateArray {
    public void rotate(int[] nums, int k) {
        // Time Limit Exceeded Solution
        if (nums.length < k){
            while (k != 0) {
                int temp = nums[nums.length-1];
                for (int i = nums.length-1; i > 0; i--){
                    nums[i] = nums[i-1];
                }
                nums[0] = temp;
                k--;
            }
        } else {
            int[] temp = new int[k];
            for (int i = k; i > 0; i--) {
                temp[i-1] = nums[nums.length - i];
            }
            for (int i = nums.length-1; i >= k; i--){
                nums[i] = nums[i-k];
            }
            for (int i = k; i > 0; i--) {
                nums[i-1] = temp[temp.length - i];
            }
        }
    }
}
