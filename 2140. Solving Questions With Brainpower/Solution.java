class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] memo = new long[n];
        return helper(questions, 0, memo);
    }

    public long helper(int[][] questions, int index, long[] memo) {
        if (index >= questions.length) {
            return 0;
        }

        if (memo[index] != 0) {
            return memo[index];
        }

        long points = Math.max(
                questions[index][0] + helper(questions, index + questions[index][1] + 1, memo),
                helper(questions, index + 1, memo)
        );

        memo[index] = points;
        return points;
    }
}
