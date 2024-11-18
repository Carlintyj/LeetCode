/**
 * @param {number[]} code
 * @param {number} k
 * @return {number[]}
 */
var decrypt = function(code, k) {
    var ans = [];
    var n = code.length
    for (var i = 0; i < n; i++) {
        if (k == 0) {
            ans[i] = 0;
        } else if (k > 0) {
            sum = 0;
            for (var j = i + 1; j < k + i + 1; j++) {
                sum += code[j%n];
            }
            ans[i] = sum;
        } else if (k < 0) {
            sum = 0;
            for (var j = i - 1; j > i + k - 1; j--) {
                sum += code[(n+j)%n];
            }
            ans[i] = sum;
        }
    }
    return ans;
};