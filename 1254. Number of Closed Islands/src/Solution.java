class Solution {
    public int closedIsland(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int count = 0;
        for (int r = 1; r < row-1; r++) {
            for (int c = 1; c < col-1; c++) {
                if (grid[r][c] == 0 && dfs(r, c, grid)) {
                    count++;
                }
            }

        }
        return count;
    }

    public boolean dfs(int r, int c, int[][] grid) {
        if(r < 0 || c < 0 || r == grid.length || c == grid[0].length) {
            return false;
        }
        if(grid[r][c] == 1) {
            return true;
        }
        grid[r][c] = 1; // Mark as visited
        boolean down = dfs(r + 1, c, grid);
        boolean up = dfs(r - 1, c, grid);
        boolean right = dfs(r, c + 1, grid);
        boolean left = dfs(r, c - 1, grid);
        return down && up && right && left;
    }
}