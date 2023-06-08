/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function(grid) {
    var m = grid.length;
    var n = grid[0].length;
    var count = 0;
    for (var r = 0; r < m; r++) {
        for (var c = n-1; c >= 0; c--) {
            if (grid[r][c] >= 0) {
                continue;
            } else {
                count++;
            }
        }
    }
    return count;
};