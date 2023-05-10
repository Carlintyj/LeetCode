class Solution {
    public int[][] generateMatrix(int n) {
        int count = 1;

        if (n == 1) {
            return new int[][]{new int[]{1}};
        }
        int[][] matrix = new int[n][n];

        int rowStart = 0;
        int rowEnd = n - 1;
        int colStart = 0;
        int colEnd = n - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int col = colStart; col <= colEnd; col++) {
                matrix[rowStart][col] = count;
                count++;
            }
            rowStart++;

            // Traverse down
            for (int row = rowStart; row <= rowEnd; row++) {
                matrix[row][colEnd] = count;
                count++;
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                // Traverse left
                for (int col = colEnd; col >= colStart; col--) {
                    matrix[rowEnd][col] = count;
                    count++;
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                // Traverse up
                for (int row = rowEnd; row >= rowStart; row--) {
                    matrix[row][colStart] = count;
                    count++;
                }
                colStart++;
            }
        }

        return matrix;
    }
}