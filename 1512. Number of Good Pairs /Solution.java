class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        int pairs = 0;
        for (Map.Entry<Integer, Integer> set : map.entrySet()) {
            int n = set.getValue();
            pairs += (n * (n-1))/2;
        }
        return pairs;
    }
}