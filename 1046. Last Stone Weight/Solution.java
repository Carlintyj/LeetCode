class Solution {
    public int lastStoneWeight(int[] stones) {
        int n = stones.length - 1;
        for (int i = 1; i < stones.length; i++) {
            Arrays.sort(stones);
            System.out.println(Arrays.toString(stones));
            if (stones[n] == stones[n-1]) {
                stones[n] = 0;
                stones[n-1] = 0;
            } else {
                stones[n-1] = stones[n] - stones[n-1];
                stones[n] = 0;
            }
        }
        Arrays.sort(stones);
        return stones[n];
    }
}