class Solution {
    public int integerBreak(int n) {
        if (n == 2) {
            return 1;
        } else if (n == 3) {
            return 2;
        }
        int result = 1;
        while (n > 4) {
            n -= 3;
            result *= 3;
        }
        return result * n;
    }
}