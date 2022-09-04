package exercise.递归.maximumDepthOfBinaryTree104;

import exercise.递归.TreeNode;

/**
 * https://leetcode.cn/problems/maximum-depth-of-binary-tree/submissions/
 */
public class MaximumDepthOfBinaryTree104 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return 1 + (Math.max(right, left));
    }
}
