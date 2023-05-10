import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return list;
        }

        int rowStart = 0;
        int rowEnd = matrix.length - 1;
        int colStart = 0;
        int colEnd = matrix[0].length - 1;

        while (rowStart <= rowEnd && colStart <= colEnd) {
            // Traverse right
            for (int col = colStart; col <= colEnd; col++) {
                list.add(matrix[rowStart][col]);
            }
            rowStart++;

            // Traverse down
            for (int row = rowStart; row <= rowEnd; row++) {
                list.add(matrix[row][colEnd]);
            }
            colEnd--;

            if (rowStart <= rowEnd) {
                // Traverse left
                for (int col = colEnd; col >= colStart; col--) {
                    list.add(matrix[rowEnd][col]);
                }
                rowEnd--;
            }

            if (colStart <= colEnd) {
                // Traverse up
                for (int row = rowEnd; row >= rowStart; row--) {
                    list.add(matrix[row][colStart]);
                }
                colStart++;
            }
        }

        return list;
    }
}
