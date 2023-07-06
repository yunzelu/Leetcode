public class MergeSortedArray {
    static public void merge(int[] nums1, int m, int[] nums2, int n) {
        // for each element in nums2, find the right place in nums1
        for (int i = 0; i < n; i++) {
            int j = 0;
            while (j < m + i && nums2[i] > nums1[j]) {
                j++;
            }
            // move all elements after j to the right
            for (int k = m + i; k > j; k--) {
                nums1[k] = nums1[k - 1];
            }
            nums1[j] = nums2[i];
        }
    }
}
