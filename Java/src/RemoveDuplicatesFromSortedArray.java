public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        // employ two pointers strategy
        // first pointer as the return num k, which stands for the num of the unique elms
        int k = 0;
        // second pointer used for traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {
                k ++;
                nums[k] = nums[i];
            }
        }
        return k + 1;
    }
}
