public class RemoveDuplicatesFromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }
        int k = 0;
        for (int i = 2, j = 0; i < nums.length - k; i++, j++) {
            if (nums[i] == nums[j]) {
                k++;
                for (int l = i; l < nums.length - 1; l++) {
                    nums[l] = nums[l + 1];
                }
                i--;
                j--;
            }
        }
        return nums.length - k;
    }
}
