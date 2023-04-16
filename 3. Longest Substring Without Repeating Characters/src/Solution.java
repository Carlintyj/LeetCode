import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s == "") {
            return 0;
        }
        int result = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            HashMap<Character, Integer> hashmap = new HashMap<>();
            int sum = 0;
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                if (hashmap.containsKey(c)) {
                    break;
                }
                hashmap.put(c, 0);
                sum += 1;
            }
            result = Math.max(result, sum);
        }
        return result;
    }
}