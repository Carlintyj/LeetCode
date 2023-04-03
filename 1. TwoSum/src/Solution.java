import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }

        Arrays.sort(temp);

        int start = 0;
        int end = temp.length-1;

        while (end >= start) {
            int sum = temp[start] + temp[end];
            if (sum == target) {
                break;
            } else if (sum > target) {
                end--;
            } else {
                start++;
            }
        }

        int startIndex = -1;
        boolean checkStart = true;
        int endIndex = -1;
        boolean checkEnd = true;

        for (int j = 0; j < nums.length; j++ ) {

            if (nums[j] == temp[start] && checkStart) {
                startIndex = j;
                checkStart = false;
            }
            if (nums[j] == temp[end] && j != startIndex && checkEnd) {
                endIndex = j;
                checkEnd = false;
            }
        }

        return new int[]{startIndex, endIndex};
    }
}