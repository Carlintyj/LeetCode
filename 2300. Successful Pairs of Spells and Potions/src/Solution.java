import java.util.Arrays;

class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] arr = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int count = 0;

            //Binary Search
            int lo = 0;
            int hi = potions.length - 1;
            while (hi > lo) {
                int mid = (hi + lo)/2;
                long product = 1L * potions[mid]*spells[i];
                if (product >= success) {
                    hi = mid;
                } else {
                    lo = mid + 1;
                }
            }
            long productCheck = 1L * potions[lo]*spells[i];
            if (lo == potions.length - 1 &&  productCheck < success) {
                lo = potions.length;
            }
            arr[i] = potions.length - lo;

        }
        return arr;
    }
}