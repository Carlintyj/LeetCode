/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int longestZigZag(TreeNode root) {
        return Math.max(helper(root.left,false, 0), helper(root.right, true, 0));
    }

    public int helper(TreeNode root, boolean dir, int count) {
        // true is right, false is left
        if (root == null) {
            return count;
        }
        if (root.left == null && root.right == null) {
            return count + 1;
        }
        if (dir) {
            return Math.max(helper(root.left, false, count + 1), helper(root.right, true, 0));
        } else {
            return Math.max(helper(root.right, true, count + 1), helper(root.left, false, 0));
        }
    }
}



