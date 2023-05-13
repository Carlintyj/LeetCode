import java.util.HashMap;

class Solution {
    HashMap<String, Integer> memo;
    
    public int countGoodStrings(int low, int high, int zero, int one) {
        memo = new HashMap<>();
        return helper(low, high, zero, one, 0);
    }
    
    public int helper(int low, int high, int zero, int one, int length) {
        int count = 0;

        if (length > high) {
            return 0;
        }
        
        if (length >= low && length <= high) {
            count = 1;
        }
        
        String key = low + "#" + high + "#" + zero + "#" + one + "#" + length;
        if (memo.containsKey(key)) {
            return memo.get(key);
        }
        
        int zeroNum;
        int oneNum;
        
        zeroNum = helper(low, high, zero, one, length + zero);
        oneNum = helper(low, high, zero, one, length + one);
        
        count += (zeroNum + oneNum) % 1000000007;
        
        memo.put(key, count);
        return count;
    }
}
