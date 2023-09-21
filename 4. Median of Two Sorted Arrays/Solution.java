class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] arr = new int[m+n];
        merge(nums1, nums2, 0, 0, 0, arr);
        return arr.length % 2 == 0
            ? (double) (arr[arr.length/2] + arr[arr.length/2-1]) / 2
            : arr[arr.length/2];
    }

    public void merge(int[] nums1, int[] nums2, int nums1_ptr, int nums2_ptr, int count, int[] nums3) {
        if (nums1.length == nums1_ptr) {
            for (int i = count; i < nums3.length; i++) {
                nums3[count] = nums2[nums2_ptr];
                nums2_ptr++;
                count++;
            }
            return;
        } else if (nums2.length == nums2_ptr) {
            for (int i = count; i < nums3.length; i++) {
                nums3[count] = nums1[nums1_ptr];
                nums1_ptr++;
                count++;
            }
            return;
        }

        if (nums1[nums1_ptr] < nums2[nums2_ptr]) {
            nums3[count] = nums1[nums1_ptr];
            nums1_ptr++;
        } else {
            nums3[count] = nums2[nums2_ptr];
            nums2_ptr++;
        }
        merge(nums1, nums2, nums1_ptr, nums2_ptr, count + 1, nums3);

        
    }
}