public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // k is the num of elements that not equals to the val
        int k = nums.length;
        // traverse each elements in nums, opt when find elm equals to the val
        for (int i = 0; i < k; i++) {
            if (nums[i] == val) {
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j+1];
                }
                k--;
                // 'Cause we moved all elements one position left, this place contains the next elm, offset the i++
                i--;
            }
        }

        return k;
    }
}
