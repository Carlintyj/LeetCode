class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        int n = nums.length;

        for (int i = 0; i < n-1; i++) {
            int j = i + 1;
            isIncreasing = isIncreasing & (nums[i] <= nums[j]);
            isDecreasing = isDecreasing & (nums[i] >= nums[j]);
            if (isIncreasing == false && isDecreasing == false) {
                return false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}