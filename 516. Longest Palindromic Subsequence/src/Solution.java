class Solution {
    public int longestPalindromeSubseq(String s) {
        String reverse = "";
        int n = s.length();
        int[][] DP = new int[n+1][n+1];
        for (int i = 0; i < s.length(); i++) {
            reverse = s.charAt(i) + reverse;
        }
        for (int i = 0; i < n+1; i++) {
            for (int j = 0; j < n+1; j++) {
                if (i == 0 || j == 0) {
                    DP[i][j] = 0;
                } else if (s.charAt(i-1) == reverse.charAt(j-1)){
                    DP[i][j] = DP[i-1][j-1] + 1;
                } else {
                    DP[i][j] = Math.max(DP[i-1][j], DP[i][j-1]);
                }
            }
        }

        return DP[n][n];

    }
}