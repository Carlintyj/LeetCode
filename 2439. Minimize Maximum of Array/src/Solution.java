
class Solution {
    public int minimizeArrayValue(int[] nums) {
        long[] prefix = new long[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = prefix[i-1] + nums[i];
        }

        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {
            long avg = prefix[i]/(i+1);
            avg += ((prefix[i] % (i+1)) == 0) ? 0 : 1;
            ans = Math.max(ans, (int) avg);
        }
        return ans;
    }

}

