class Solution {

    public int[] topKFrequent(int[] nums, int k) {
        Arrays.sort(nums);
        int[] arr = new int[k];
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int number : nums) {
            if (hashmap.containsKey(number)) {
                hashmap.put(number, hashmap.get(number) + 1);
            } else {
                hashmap.put(number, 1);
            }
        }
        for (int i = 0; i < k; i++) {
            int largest = Collections.max(hashmap.entrySet(), Map.Entry.comparingByValue()).getKey();
            arr[i] = largest;
            hashmap.remove(largest);
        }

        return arr;
    }
}